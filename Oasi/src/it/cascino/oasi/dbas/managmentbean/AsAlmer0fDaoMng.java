package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsAlmer0fDao;
import it.cascino.oasi.dbas.model.AsAlmer0f;
import it.cascino.oasi.utils.Resources;

public class AsAlmer0fDaoMng implements AsAlmer0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsAlmer0fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsAlmer0f> getAll(){
		List<AsAlmer0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAlmer0f.findAll");
				o = (List<AsAlmer0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsAlmer0f o){
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
	
	public Boolean aggiorna(AsAlmer0f o){
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
	public List<AsAlmer0f> getDaAmset(String amset){
		List<AsAlmer0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAlmer0f.findByAmset");
				query.setParameter("amset", amset);
				o = (List<AsAlmer0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsAlmer0f getDaId(String amset, String amgru, String amsot, String amfam, String amstf, String amst1){
		AsAlmer0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsAlmer0f.findById");
				query.setParameter("amset", amset);
				query.setParameter("amgru", amgru);
				query.setParameter("amsot", amsot);
				query.setParameter("amfam", amfam);
				query.setParameter("amstf", amstf);
				query.setParameter("amst1", amst1);
				o = (AsAlmer0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// public BigDecimal getRRNDaIdgetDaId(String alb){
	// BigDecimal o = null;
	// try{
	// try{
	// utx.begin();
	// String sql = "select rrn(almer0f) from almer0f where (amset concat amgru concat amsot concat amfam concat amstf concat amst1) = :alb";
	// Query query = em.createNativeQuery(sql);
	// query.setParameter("alb", alb);
	// o = (BigDecimal)query.getSingleResult();
	// }catch(NoResultException e){
	// o = null;
	// }
	// utx.commit();
	// }catch(Exception e){
	// log.fatal(e.toString());
	// }
	// return o;
	// }
	
	public void detach(Object entity){
		em.detach(entity);
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
