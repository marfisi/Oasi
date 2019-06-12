package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_AnagSottofamDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_AnagSottofam> getAll(){
		List<MsvOA_AnagSottofam> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_AnagSottofam.findAll");
				o = (List<MsvOA_AnagSottofam>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// TODO @Transactional(rollbackOn = MsvOA_AnagSottofam.class)
//	public void salva(MsvOA_AnagSottofam o){
//		try{
//			try{
//				utx.begin();
//				// precodice.setId(null);
////				log.info("salva: " + o.toString());
//				em.persist(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.error("salva: " + o.toString());
//			log.fatal(e.toString());
//		}
//	}
	
//	public void aggiorna(MsvOA_AnagSottofam o){
//		try{
//			try{
//				utx.begin();
//				log.info("aggiorna: " + o.toString());
//				em.merge(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
//	
//	public void elimina(MsvOA_AnagSottofam oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				MsvOA_AnagSottofam o = em.find(MsvOA_AnagSottofam.class, oElimina.getSotCodice());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public MsvOA_AnagSottofam getDaSotCodice(String sotCodice){
		MsvOA_AnagSottofam o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_AnagSottofam.findBySotCodice");
				query.setParameter("sotCodice", sotCodice);
				o = (MsvOA_AnagSottofam)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_AnagSottofam> getDaSotFamiglia(String sotFamiglia){
		List<MsvOA_AnagSottofam> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_AnagSottofam.findBySotFamiglia");
				query.setParameter("sotFamiglia", sotFamiglia);
				o = (List<MsvOA_AnagSottofam>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
//	public void svuotaTabella(){
//		try{
//			try{
//				utx.begin();
//				Query query = em.createNamedQuery("MsvOA_AnagSottofam.svuota");
//				query.executeUpdate();
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
