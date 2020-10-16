package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import it.cascino.oasi.dbas.model.AsFinaz0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsFinaz0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsFinaz0fDaoMng implements AsFinaz0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsFinaz0fDaoMng.class);
	
	public Boolean salva(AsFinaz0f o){
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
	
	public Boolean aggiorna(AsFinaz0f o){
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
	
	public AsFinaz0f getDaId(Integer fndat, Integer fnnum){
		AsFinaz0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsFinaz0f.findById");
				query.setParameter("fndat", fndat);
				query.setParameter("fnnum", fnnum);
				o = (AsFinaz0f)query.getSingleResult();
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
