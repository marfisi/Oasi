package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsArdep0fDao;
import it.cascino.oasi.dbas.model.AsArdep0f;
import it.cascino.oasi.utils.Resources;

public class AsArdep0fDaoMng implements AsArdep0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsArdep0fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsArdep0f> getAll(){
		List<AsArdep0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsArdep0f.findAll");
				o = (List<AsArdep0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsArdep0f o){
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
	
	public Boolean aggiorna(AsArdep0f o){
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
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsArdep0f> getDaDcoda(String dcoda){
		List<AsArdep0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsArdep0f.findByDcoda");
				query.setParameter("dcoda", dcoda);
				o = (List<AsArdep0f>)query.getResultList();
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
	public List<AsArdep0f> getDaDcode(Integer dcode){
		List<AsArdep0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsArdep0f.findByDcode");
				query.setParameter("dcode", dcode);
				o = (List<AsArdep0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsArdep0f getDaDcodaAndDcode(String dcoda, Integer dcode){
		AsArdep0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsArdep0f.findByDcodaAndDcode");
				query.setParameter("dcoda", dcoda);
				query.setParameter("dcode", dcode);
				o = (AsArdep0f)query.getSingleResult();
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
