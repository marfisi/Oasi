package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsOaard0fDao;
import it.cascino.oasi.dbas.model.AsOaard0f;
import it.cascino.oasi.utils.Resources;

public class AsOaard0fDaoMng implements AsOaard0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = LogManager.getLogger(AsOaard0fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsOaard0f> getAll(){
		List<AsOaard0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsOaard0f.findAll");
				o = (List<AsOaard0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean aggiorna(AsOaard0f o){
		try{
			try{
				utx.begin();
				// log.info("aggiorna: " + o.toString());
				em.merge(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.info("aggiorna: " + o.toString());
			log.fatal(e.toString());
			return false;
		}
		return true;
	}
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsOaard0f> getDaDcoda(String dcoda){
		List<AsOaard0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsOaard0f.findByDcoda");
				query.setParameter("dcoda", dcoda);
				o = (List<AsOaard0f>)query.getResultList();
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
	public List<AsOaard0f> getDaDcode(Integer dcode){
		List<AsOaard0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsOaard0f.findByDcode");
				query.setParameter("dcode", dcode);
				o = (List<AsOaard0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsOaard0f getDaDcodaDcode(String dcoda, Integer dcode){
		AsOaard0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsOaard0f.findByDcodaDcode");
				query.setParameter("dcoda", dcoda);
				query.setParameter("dcode", dcode);
				o = (AsOaard0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// @SuppressWarnings("unchecked")
	// public List<AsOaard0f> getDaElaborare(){
	// List<AsOaard0f> o = null;
	// try{
	// try{
	// utx.begin();
	// Query query = em.createNamedQuery("AsOaard0f.findDaElab");
	// o = (List<AsOaard0f>)query.getResultList();
	// }catch(NoResultException e){
	// o = null;
	// }
	// utx.commit();
	// }catch(Exception e){
	// log.fatal(e.toString());
	// }
	// return o;
	// }
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsOaard0f> getDaElaborare(){
		List<AsOaard0f> o = null;
		try{
			try{
				String sql = "SELECT * FROM Oaard0f a WHERE a.dflag = ' ' order by a.dcoda asc, a.dcode asc";
				Query query = em.createNativeQuery(sql, AsOaard0f.class);
				o = (List<AsOaard0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void svuotaTabella(){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsOaard0f.svuota");
				query.executeUpdate();
				// String sql = "TRUNCATE TABLE Oaard0f";
				// String sql = "DELETE FROM Oaard0f";
				// Query query = em.createNativeQuery(sql);
				// query.executeUpdate();//.getResultList();
			}catch(NoResultException e){
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void detach(Object entity){
		em.detach(entity);
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
