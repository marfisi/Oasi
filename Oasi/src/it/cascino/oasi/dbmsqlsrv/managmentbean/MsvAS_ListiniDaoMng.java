package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_ListiniDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Listini;
import it.cascino.oasi.utils.Resources;

public class MsvAS_ListiniDaoMng implements MsvAS_ListiniDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvAS_ListiniDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvAS_Listini> getAll(){
		List<MsvAS_Listini> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Listini.findAll");
				o = (List<MsvAS_Listini>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void salva(MsvAS_Listini o){
		try{
			try{
				utx.begin();
				// log.info("salva: " + a.toString());
				em.persist(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.error("salva: " + o.toString());
			log.fatal(e.toString());
		}
	}
	
	public void aggiorna(MsvAS_Listini o){
		try{
			try{
				utx.begin();
				log.info("aggiorna: " + o.toString());
				em.merge(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public MsvAS_Listini getDaCodiceTipo(String codArticolo, String tipoListino){
		MsvAS_Listini o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Listini.findByCodArticoloTipoListino");
				query.setParameter("codArticolo", codArticolo);
				query.setParameter("tipoListino", tipoListino);
				o = (MsvAS_Listini)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void svuotaTabella(){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvAS_Listini.svuota");
				query.executeUpdate();
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void detach(Object entity){
		em.detach(entity);
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
