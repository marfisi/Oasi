package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_AnagCausContDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagCausCont;
import it.cascino.oasi.utils.Resources;

public class MsvOA_AnagCausContDaoMng implements MsvOA_AnagCausContDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	// private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvOA_AnagCausContDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_AnagCausCont> getAll(){
		List<MsvOA_AnagCausCont> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_AnagCausCont.findAll");
				o = (List<MsvOA_AnagCausCont>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_AnagCausCont getDaCatCodice(String catCodice){
		MsvOA_AnagCausCont o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_AnagCausCont.findByCatCodice");
				query.setParameter("catCodice", catCodice);
				o = (MsvOA_AnagCausCont)query.getSingleResult();
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
