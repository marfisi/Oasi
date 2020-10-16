package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_AnagSottofamDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagSottofam;
import it.cascino.oasi.utils.Resources;

public class MsvOA_AnagSottofamDaoMng implements MsvOA_AnagSottofamDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	// private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_AnagSottofamDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_AnagSottofam> getAll(){
		List<MsvOA_AnagSottofam> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_AnagSottofam.findAll");
				o = (List<MsvOA_AnagSottofam>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_AnagSottofam getDaSotCodice(String sotCodice){
		MsvOA_AnagSottofam o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_AnagSottofam.findBySotCodice");
				query.setParameter("sotCodice", sotCodice);
				o = (MsvOA_AnagSottofam)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_AnagSottofam> getDaSotFamiglia(String sotFamiglia){
		List<MsvOA_AnagSottofam> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_AnagSottofam.findBySotFamiglia");
				query.setParameter("sotFamiglia", sotFamiglia);
				o = (List<MsvOA_AnagSottofam>)query.getResultList();
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
