package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsTabel0fDao;
import it.cascino.oasi.dbas.model.AsTabel0f;
import it.cascino.oasi.utils.Resources;

public class AsTabel0fDaoMng implements AsTabel0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsTabel0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsTabel0f> getAllDaTnota(String tnota){
		List<AsTabel0f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsTabel0f.findAllByTnota");
				query.setParameter("tnota", tnota);
				o = (List<AsTabel0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
//	public Boolean salva(AsTabel0f o){
//		try{
//			try{
//				utx.begin();
//				// precodice.setId(null);
//				log.info("salva: " + o.toString());
//				em.persist(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public Boolean aggiorna(AsTabel0f o){
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
	
	public AsTabel0f getDaTnotaTcoel(String tnota, String tcoel){
		AsTabel0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsTabel0f.findByTnotaTcoel");
				query.setParameter("tnota", tnota);
				query.setParameter("tcoel", tcoel);
				o = (AsTabel0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
