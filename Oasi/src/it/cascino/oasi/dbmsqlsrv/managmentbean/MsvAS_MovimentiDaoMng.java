package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_MovimentiDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Movimenti;
import it.cascino.oasi.utils.Resources;

public class MsvAS_MovimentiDaoMng implements MsvAS_MovimentiDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvAS_MovimentiDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvAS_Movimenti> getAll(){
		List<MsvAS_Movimenti> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Movimenti.findAll");
				o = (List<MsvAS_Movimenti>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void salva(MsvAS_Movimenti o){
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
				Query query = em.createNamedQuery("MsvAS_Movimenti.svuota");
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
