package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
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
	
	@SuppressWarnings("unchecked")
	public List<AsFinaz0f> getAll(){
		List<AsFinaz0f> cod = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsFinaz0f.findAll");
				cod = (List<AsFinaz0f>)query.getResultList();
			}catch(NoResultException e){
				cod = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return cod;
	}
	
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
	
//	public void elimina(AsFinaz0f oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				AsFinaz0f o = em.find(AsFinaz0f.class, oElimina.getVcoda());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public AsFinaz0f getDaId(Integer fndat, Integer fnnum){
		AsFinaz0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsFinaz0f.findById");
				query.setParameter("fndat", fndat);
				query.setParameter("fnnum", fnnum);
				o = (AsFinaz0f)query.getSingleResult();
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
