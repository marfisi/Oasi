package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_AnagLivelliDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagLivelli;
import it.cascino.oasi.utils.Resources;

public class MsvOA_AnagLivelliDaoMng implements MsvOA_AnagLivelliDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	// private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvOA_AnagLivelliDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_AnagLivelli> getAll(){
		List<MsvOA_AnagLivelli> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_AnagLivelli.findAll");
				o = (List<MsvOA_AnagLivelli>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_AnagLivelli getDaLvmCodice(String lvmCodice){
		MsvOA_AnagLivelli o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_AnagLivelli.findByLvmCodice");
				query.setParameter("lvmCodice", lvmCodice);
				o = (MsvOA_AnagLivelli)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_AnagLivelli getDaCodiceCascino(String codiceCascino){
		MsvOA_AnagLivelli o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_AnagLivelli.findByCodiceCascino");
				query.setParameter("codiceCascino", codiceCascino);
				o = (MsvOA_AnagLivelli)query.getSingleResult();
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
