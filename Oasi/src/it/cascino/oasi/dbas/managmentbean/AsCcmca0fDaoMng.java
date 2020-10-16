package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import it.cascino.oasi.dbas.model.AsCcmca0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsCcmca0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsCcmca0fDaoMng implements AsCcmca0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsCcmca0fDaoMng.class);
	
	public Boolean salva(AsCcmca0f o){
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
	
	public Boolean aggiorna(AsCcmca0f o){
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
	
	public void elimina(AsCcmca0f oElimina){
		try{
			try{
				utx.begin();
				AsCcmca0f o = em.find(AsCcmca0f.class, oElimina.getId());
				log.info("elimina: " + o.toString());
				em.remove(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public AsCcmca0f getDaId(Integer cadar, Integer canum, Integer carig){
		AsCcmca0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsCcmca0f.findById");
				query.setParameter("cadar", cadar);
				query.setParameter("canum", canum);
				query.setParameter("carig", carig);
				o = (AsCcmca0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public BigDecimal getUltimoCanum(Integer cadar){
		BigDecimal o = null;
		try{
			try{
				String sql = "select coalesce(max(o.canum), 0) from Ccmca0f o WHERE o.cadar = :cadar";
				Query query = em.createNativeQuery(sql);
				query.setParameter("cadar", cadar);
				o = (BigDecimal)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// public Integer delByCadarCanup(Integer cadar, String canup){ @NamedQuery(name = "AsCcmca0f.delByCadarCanup", query = "DELETE FROM Ccmca0f o WHERE o.id.cadar = :cadar and o.canup = :canup")
	// Integer o = -1;
	// try{
	// try{
	// utx.begin();
	// Query query = em.createNamedQuery("AsCcmca0f.delByCadarCanup");
	// query.setParameter("cadar", cadar);
	// query.setParameter("canup", canup);
	// o = query.executeUpdate();
	// }catch(NoResultException e){
	// o = -1;
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
	public List<AsCcmca0f> getDaCadarCanup(Integer cadar, String canup){
		List<AsCcmca0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsCcmca0f.findByCadarCanup");
				query.setParameter("cadar", cadar);
				query.setParameter("canup", canup);
				o = (List<AsCcmca0f>)query.getResultList();
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
