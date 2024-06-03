package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import it.cascino.oasi.dbas.model.AsCorri0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsCorri0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AsCorri0fDaoMng implements AsCorri0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = LogManager.getLogger(AsCorri0fDaoMng.class);
	
	public Boolean salva(AsCorri0f o){
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
	
	public Boolean aggiorna(AsCorri0f o){
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
	
	public AsCorri0f getDaId(Integer codat, Integer codep, String coiva){
		AsCorri0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsCorri0f.findById");
				query.setParameter("codat", codat);
				query.setParameter("codep", codep);
				query.setParameter("coiva", coiva);
				o = (AsCorri0f)query.getSingleResult();
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
