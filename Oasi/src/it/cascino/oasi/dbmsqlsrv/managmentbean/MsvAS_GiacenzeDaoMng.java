package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_GiacenzeDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Giacenze;
import it.cascino.oasi.utils.Resources;

public class MsvAS_GiacenzeDaoMng implements MsvAS_GiacenzeDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvAS_GiacenzeDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvAS_Giacenze> getAll(){
		List<MsvAS_Giacenze> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Giacenze.findAll");
				o = (List<MsvAS_Giacenze>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void salva(MsvAS_Giacenze o){
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
	
	public void aggiorna(MsvAS_Giacenze o){
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
	
	public MsvAS_Giacenze getDaCodArticoloCodDeposito(String codArticolo, String codDeposito){
		MsvAS_Giacenze o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Giacenze.findByCodArticoloCodDeposito");
				query.setParameter("codArticolo", codArticolo);
				query.setParameter("codDeposito", codDeposito);
				o = (MsvAS_Giacenze)query.getSingleResult();
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
				Query query = em.createNamedQuery("MsvAS_Giacenze.svuota");
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
