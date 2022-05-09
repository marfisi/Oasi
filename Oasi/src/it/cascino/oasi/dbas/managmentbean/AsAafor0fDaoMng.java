package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import it.cascino.oasi.dbas.model.AsAafor0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsAafor0fDao;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AsAafor0fDaoMng implements AsAafor0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	// private EntityTransaction utx = res.getUtxAs();
	
	Logger log = LogManager.getLogger(AsAafor0fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsAafor0f> getAll(){
		List<AsAafor0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAafor0f.findAll");
				o = (List<AsAafor0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsAafor0f getArticoloDaAaforAacoa(Integer aafor, String aacoa){
		AsAafor0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAafor0f.findByAaforAacoa");
				query.setParameter("aafor", aafor);
				query.setParameter("aacoa", aacoa); // in aafor0f il campo aacoa e' di 14 mentre in anmag0f il campo mcoaf e' di 13
				o = (AsAafor0f)query.getSingleResult();
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
