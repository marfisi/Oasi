package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import it.cascino.oasi.dbas.model.AsMovtr0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsMovtr0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsMovtr0fDaoMng implements AsMovtr0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsMovtr0fDaoMng.class);
	
//	@SuppressWarnings("unchecked")
//	public List<AsMovtr0f> getAll(){
//		List<AsMovtr0f> cod = null;
//		try{
//			try{
//				utx.begin();
//				Query query = em.createNamedQuery("AsMovtr0f.findAll");
//				cod = (List<AsMovtr0f>)query.getResultList();
//			}catch(NoResultException e){
//				cod = null;
//			}
//			utx.commit();
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//		return cod;
//	}
	
	public Boolean salva(AsMovtr0f o){
		try{
			try{
				utx.begin();
				// precodice.setId(null);
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
	
//	public void elimina(AsMovtr0f oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				AsMovtr0f o = em.find(AsMovtr0f.class, oElimina.getMcoda());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public AsMovtr0f getDaId(Integer mtdat, Integer mtnuz, Integer mtnum, Integer mtnur){
		AsMovtr0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsMovtr0f.findById");
				query.setParameter("mtdat", mtdat);
				query.setParameter("mtnuz", mtnuz);
				query.setParameter("mtnum", mtnum);
				query.setParameter("mtnur", mtnur);
				o = (AsMovtr0f)query.getSingleResult();
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
