package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsMovoa0fDao;
import it.cascino.oasi.dbas.model.AsMovoa0f;
import it.cascino.oasi.utils.Resources;

public class AsMovoa0fDaoMng implements AsMovoa0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = LogManager.getLogger(AsMovoa0fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsMovoa0f> getAll(){
		List<AsMovoa0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsMovoa0f.findAll");
				o = (List<AsMovoa0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsMovoa0f o){
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
	
	public Boolean aggiorna(AsMovoa0f o){
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
	
	public AsMovoa0f getDaId(String vidoa){
		AsMovoa0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsMovoa0f.findById");
				query.setParameter("vidoa", vidoa);
				o = (AsMovoa0f)query.getSingleResult();
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
