package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import it.cascino.oasi.dbas.model.AsFatem0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsFatem0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsFatem0fDaoMng implements AsFatem0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsFatem0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsFatem0f> getAll(){
		List<AsFatem0f> cod = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsFatem0f.findAll");
				cod = (List<AsFatem0f>)query.getResultList();
			}catch(NoResultException e){
				cod = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return cod;
	}
	
	public Boolean salva(AsFatem0f o){
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
	
	public Boolean aggiorna(AsFatem0f o){
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
	
//	public void elimina(AsFatem0f oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				AsFatem0f o = em.find(AsFatem0f.class, oElimina.getVcoda());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public AsFatem0f getDaId(Integer fdatd, Integer fnura, Integer fnumd){
		AsFatem0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsFatem0f.findById");
				query.setParameter("fdatd", fdatd);
				query.setParameter("fnura", fnura);
				query.setParameter("fnumd", fnumd);
				o = (AsFatem0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsFatem0f getDaFdatdFnumdFcocl(Integer fdatd, Integer fnumd, BigDecimal fcocl){
		AsFatem0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsFatem0f.findByFdatdFnumdFcocl");
				query.setParameter("fdatd", fdatd);
				query.setParameter("fnumd", fnumd);
				query.setParameter("fcocl", fcocl);
				o = (AsFatem0f)query.getSingleResult();
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
