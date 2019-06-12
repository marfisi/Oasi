package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsOaanm0fDao;
import it.cascino.oasi.dbas.model.AsOaanm0f;
import it.cascino.oasi.utils.Resources;

public class AsOaanm0fDaoMng implements AsOaanm0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsOaanm0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsOaanm0f> getAll(){
		List<AsOaanm0f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsOaanm0f.findAll");
				o = (List<AsOaanm0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean aggiorna(AsOaanm0f a){
		try{
			try{
				utx.begin();
				em.merge(a);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.info("aggiorna: " + a.toString());
			log.fatal(e.toString());
			return false;
		}
		return true;
	}
	
	public AsOaanm0f getDaMcoda(String mcoda){
		AsOaanm0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsOaanm0f.findByMcoda");
				query.setParameter("mcoda", mcoda);
				o = (AsOaanm0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
//	@SuppressWarnings("unchecked")
//	public List<AsOaanm0f> getDaElaborare(){
//		List<AsOaanm0f> o = null;
//		try{
//			try{
//				utx.begin();
//				Query query = em.createNamedQuery("AsOaanm0f.findDaElab");
//				o = (List<AsOaanm0f>)query.getResultList();
//			}catch(NoResultException e){
//				o = null;
//			}
//			utx.commit();
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//		return o;
//	}
	
	@SuppressWarnings("unchecked")
	public List<String> getDaElaborare(){
		List<String> o = null;
		try{
			try{
				utx.begin();
				String sql = "SELECT distinct(a.mcoda) FROM Oaanm0f a WHERE a.mflag = ' ' order by a.mcoda";
				Query query = em.createNativeQuery(sql);
				o = (List<String>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void svuotaTabella(){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsOaanm0f.svuota");
				query.executeUpdate();
				//String sql = "TRUNCATE TABLE Oaanm0f";
//				String sql = "DELETE FROM Oaanm0f";
//				Query query = em.createNativeQuery(sql);
//				query.executeUpdate();//.getResultList();
			}catch(NoResultException e){
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
