package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsAncab0fDao;
import it.cascino.oasi.dbas.model.AsAncab0f;
import it.cascino.oasi.utils.Resources;

public class AsAncab0fDaoMng implements AsAncab0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	// private EntityTransaction utx = res.getUtxAs();
	
	Logger log = LogManager.getLogger(AsAncab0fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsAncab0f> getAll(){
		List<AsAncab0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAncab0f.findAll");
				o = (List<AsAncab0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsAncab0f> getDaCcoda(String ccoda){
		List<AsAncab0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAncab0f.findByCcoda");
				query.setParameter("ccoda", ccoda);
				o = (List<AsAncab0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsAncab0f getDaCcodb(String ccodb){
		AsAncab0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAncab0f.findByCcodb");
				query.setParameter("ccodb", ccodb);
				o = (AsAncab0f)query.getSingleResult();
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
