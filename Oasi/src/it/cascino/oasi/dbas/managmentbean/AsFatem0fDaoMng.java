package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.math.BigDecimal;
import it.cascino.oasi.dbas.model.AsFatem0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsFatem0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AsFatem0fDaoMng implements AsFatem0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = LogManager.getLogger(AsFatem0fDaoMng.class);
	
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
	
	public AsFatem0f getDaId(Integer fdatd, Integer fnura, Integer fnumd){
		AsFatem0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsFatem0f.findById");
				query.setParameter("fdatd", fdatd);
				query.setParameter("fnura", fnura);
				query.setParameter("fnumd", fnumd);
				o = (AsFatem0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsFatem0f getDaFdatdFnumdFcocl(Integer fdatd, Integer fnumd, BigDecimal fcocl){
		AsFatem0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsFatem0f.findByFdatdFnumdFcocl");
				query.setParameter("fdatd", fdatd);
				query.setParameter("fnumd", fnumd);
				query.setParameter("fcocl", fcocl);
				o = (AsFatem0f)query.getSingleResult();
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
