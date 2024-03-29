package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import it.cascino.oasi.dbas.model.AsMovtr0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsMovtr0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AsMovtr0fDaoMng implements AsMovtr0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = LogManager.getLogger(AsMovtr0fDaoMng.class);
	
	public Boolean salva(AsMovtr0f o){
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
	
	public Boolean aggiorna(AsMovtr0f o){
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
	
	public AsMovtr0f getDaId(Integer mtdat, Integer mtnuz, Integer mtnum, Integer mtnur){
		AsMovtr0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsMovtr0f.findById");
				query.setParameter("mtdat", mtdat);
				query.setParameter("mtnuz", mtnuz);
				query.setParameter("mtnum", mtnum);
				query.setParameter("mtnur", mtnur);
				o = (AsMovtr0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// public AsMovtr0f getDaMtdatMtdppMtute(Integer mtdat, Integer mtdpp, String mtute){
	// AsMovtr0f o = null;
	// try{
	// try{
	// utx.begin();
	// Query query = em.createNamedQuery("AsMovtr0f.findByMtdatMtdppMtute");
	// query.setParameter("mtdat", mtdat);
	// query.setParameter("mtdpp", mtdpp);
	// query.setParameter("mtute", mtute);
	// o = (AsMovtr0f)query.getSingleResult();
	// }catch(NoResultException e){
	// o = null;
	// }
	// utx.commit();
	// }catch(Exception e){
	// log.fatal(e.toString());
	// }
	// return o;
	// }
	
	public AsMovtr0f getDaMtdatMtdppMtdpaMtuteMtcod(Integer mtdat, Integer mtdpp, Integer mtdpa, String mtute, String mtcod){
		AsMovtr0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsMovtr0f.findByMtdatMtdppMtdpaMtuteMtcod");
				query.setParameter("mtdat", mtdat);
				query.setParameter("mtdpp", mtdpp);
				query.setParameter("mtdpa", mtdpa);
				query.setParameter("mtute", mtute);
				query.setParameter("mtcod", mtcod);
				// o = (AsMovtr0f)query.getSingleResult(); // con getResultList().get(0), simulo la select con "limit 1"
				o = (AsMovtr0f)query.getResultList().get(0);
			}catch(NoResultException e){
				o = null;
			}catch(IndexOutOfBoundsException e){
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
