package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsBolem0fDao;
import it.cascino.oasi.dbas.model.AsBolem0f;
import it.cascino.oasi.utils.Resources;

public class AsBolem0fDaoMng implements AsBolem0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsBolem0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsBolem0f> getAll(){
		List<AsBolem0f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsBolem0f.findAll");
				o = (List<AsBolem0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsBolem0f o){
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
	
	public Boolean aggiorna(AsBolem0f o){
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
	
	public AsBolem0f getDaId(Integer bdatd, Integer bnura, Integer bnumd){
		AsBolem0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsBolem0f.findById");
				query.setParameter("bdatd", bdatd);
				query.setParameter("bnura", bnura);
				query.setParameter("bnumd", bnumd);
				o = (AsBolem0f)query.getSingleResult();
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
