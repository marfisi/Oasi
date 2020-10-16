package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_TrasferimentiDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Trasferimenti;
import it.cascino.oasi.utils.Resources;

public class MsvOA_TrasferimentiDaoMng implements MsvOA_TrasferimentiDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_TrasferimentiDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_Trasferimenti> getAll(){
		List<MsvOA_Trasferimenti> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_Trasferimenti.findAll");
				o = (List<MsvOA_Trasferimenti>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void elimina(MsvOA_Trasferimenti oElimina){
		try{
			try{
				utx.begin();
				MsvOA_Trasferimenti o = em.find(MsvOA_Trasferimenti.class, oElimina.getId());
				log.info("elimina: " + o.toString());
				em.remove(o);
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
