package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_Vendite008Dao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Vendite008;
import it.cascino.oasi.utils.Resources;

public class MsvAS_Vendite008DaoMng implements MsvAS_Vendite008Dao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvAS_Vendite008DaoMng.class);
	
	public void salva(MsvAS_Vendite008 o){
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
	
	public void detach(Object entity){
		em.detach(entity);
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
