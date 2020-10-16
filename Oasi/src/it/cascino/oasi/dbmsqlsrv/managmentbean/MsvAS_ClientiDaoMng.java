package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_ClientiDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Clienti;
import it.cascino.oasi.utils.Resources;

public class MsvAS_ClientiDaoMng implements MsvAS_ClientiDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvAS_ClientiDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvAS_Clienti> getAll(){
		List<MsvAS_Clienti> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Clienti.findAll");
				o = (List<MsvAS_Clienti>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// @Transactional(rollbackOn = MsvAS_Clienti.class)
	public void salva(MsvAS_Clienti o){
		try{
			try{
				utx.begin();
				// log.info("salva: " + o.toString());
				em.persist(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.error("salva: " + o.toString());
			log.fatal(e.toString());
		}
	}
	
	public void aggiorna(MsvAS_Clienti o){
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
	
	public MsvAS_Clienti getDaCodice(String codice){
		MsvAS_Clienti o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Clienti.findByCodice");
				query.setParameter("codice", codice);
				o = (MsvAS_Clienti)query.getSingleResult();
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
				Query query = em.createNamedQuery("MsvAS_Clienti.svuota");
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
