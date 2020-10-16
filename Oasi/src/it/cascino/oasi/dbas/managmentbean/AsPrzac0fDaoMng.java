package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsPrzac0fDao;
import it.cascino.oasi.dbas.model.AsPrzac0f;
import it.cascino.oasi.utils.Resources;

public class AsPrzac0fDaoMng implements AsPrzac0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	// private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsPrzac0fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsPrzac0f> getAll(){
		List<AsPrzac0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsPrzac0f.findAll");
				o = (List<AsPrzac0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsPrzac0f getDaPzcod(String pzcod){
		AsPrzac0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsPrzac0f.findByPzcod");
				query.setParameter("pzcod", pzcod);
				o = (AsPrzac0f)query.getSingleResult();
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
