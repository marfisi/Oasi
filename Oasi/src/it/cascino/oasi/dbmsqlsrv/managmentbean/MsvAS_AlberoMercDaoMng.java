package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_AlberoMercDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_AlberoMerc;
import it.cascino.oasi.utils.Resources;

public class MsvAS_AlberoMercDaoMng implements MsvAS_AlberoMercDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvAS_AlberoMercDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvAS_AlberoMerc> getAll(){
		List<MsvAS_AlberoMerc> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_AlberoMerc.findAll");
				o = (List<MsvAS_AlberoMerc>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void salva(MsvAS_AlberoMerc o){
		try{
			try{
				utx.begin();
				// log.info("salva: " + a.toString());
				em.persist(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.error("salva: " + o.toString());
			log.fatal(e.toString());
		}
	}
	
	public void svuotaTabella(){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvAS_AlberoMerc.svuota");
				query.executeUpdate();
			}finally{
				utx.commit();
			}
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
