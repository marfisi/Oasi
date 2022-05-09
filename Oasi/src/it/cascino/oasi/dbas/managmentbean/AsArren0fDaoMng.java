package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsArren0fDao;
import it.cascino.oasi.dbas.model.AsArren0f;
import it.cascino.oasi.utils.Resources;

public class AsArren0fDaoMng implements AsArren0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = LogManager.getLogger(AsArren0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsArren0f> getAll(){
		List<AsArren0f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsArren0f.findAll");
				o = (List<AsArren0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")
	public List<AsArren0f> getDaArcod(String arcod){
		List<AsArren0f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsArren0f.findByArcod");
				query.setParameter("arcod", arcod);
				o = (List<AsArren0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")
	public List<AsArren0f> getDaArdep(Integer ardep){
		List<AsArren0f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsArren0f.findByArdep");
				query.setParameter("ardep", ardep);
				o = (List<AsArren0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsArren0f getDaArcodAndArdep(String arcod, Integer ardep){
		AsArren0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsArren0f.findByArcodAndArdep");
				query.setParameter("arcod", arcod);
				query.setParameter("ardep", ardep);
				o = (AsArren0f)query.getSingleResult();
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
