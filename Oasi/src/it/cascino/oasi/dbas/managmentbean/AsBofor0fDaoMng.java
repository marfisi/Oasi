package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsBofor0fDao;
import it.cascino.oasi.dbas.model.AsBofor0f;
import it.cascino.oasi.utils.Resources;

public class AsBofor0fDaoMng implements AsBofor0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsBofor0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsBofor0f> getAll(){
		List<AsBofor0f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsBofor0f.findAll");
				o = (List<AsBofor0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsBofor0f o){
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
	
	public Boolean aggiorna(AsBofor0f o){
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
	
	public AsBofor0f getDaId(Integer bfdat, Integer bfnuz, Integer bfnum){
		AsBofor0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsBofor0f.findById");
				query.setParameter("bfdat", bfdat);
				query.setParameter("bfnuz", bfnuz);
				query.setParameter("bfnum", bfnum);
				o = (AsBofor0f)query.getSingleResult();
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
