package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsAnma20fDao;
import it.cascino.oasi.dbas.model.AsAnma20f;
import it.cascino.oasi.utils.Resources;

public class AsAnma20fDaoMng implements AsAnma20fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = LogManager.getLogger(AsAnma20fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsAnma20f> getAll(){
		List<AsAnma20f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAnma20f.findAll");
				o = (List<AsAnma20f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsAnma20f o){
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
	
	public Boolean aggiorna(AsAnma20f o){
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
	
	public AsAnma20f getDaM2cod(String m2cod){
		AsAnma20f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAnma20f.findByM2cod");
				query.setParameter("m2cod", m2cod);
				o = (AsAnma20f)query.getSingleResult();
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
	public List<AsAnma20f> getDaM2oas(String m2oas){
		List<AsAnma20f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAnma20f.findByM2oas");
				query.setParameter("m2oas", m2oas);
				o = (List<AsAnma20f>)query.getResultList();
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
