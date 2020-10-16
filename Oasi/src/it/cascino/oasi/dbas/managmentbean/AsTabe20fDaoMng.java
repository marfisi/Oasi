package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsTabe20fDao;
import it.cascino.oasi.dbas.model.AsTabe20f;
import it.cascino.oasi.utils.Resources;

public class AsTabe20fDaoMng implements AsTabe20fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsTabe20fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsTabe20f> getAllDaTbnot(String tbnot){
		List<AsTabe20f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsTabe20f.findAllByTbnot");
				query.setParameter("tbnot", tbnot);
				o = (List<AsTabe20f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsTabe20f o){
		try{
			try{
				utx.begin();
				log.info("salva: " + o.toString());
				em.persist(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
			return false;
		}
		return true;
	}
	
	public Boolean aggiorna(AsTabe20f o){
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
			return false;
		}
		return true;
	}
	
	public AsTabe20f getDaTbnotTbele(String tbnot, String tbele){
		AsTabe20f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsTabe20f.findByTbnotTbele");
				query.setParameter("tbnot", tbnot);
				query.setParameter("tbele", tbele);
				o = (AsTabe20f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void detach(Object entity){
		em.detach(entity);
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
