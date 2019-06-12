package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_AnagLivelliDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagLivelli;
import it.cascino.oasi.utils.Resources;

public class MsvOA_AnagLivelliDaoMng implements MsvOA_AnagLivelliDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_AnagLivelliDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_AnagLivelli> getAll(){
		List<MsvOA_AnagLivelli> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_AnagLivelli.findAll");
				o = (List<MsvOA_AnagLivelli>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// TODO @Transactional(rollbackOn = MsvOA_AnagLivelli.class)
//	public void salva(MsvOA_AnagLivelli o){
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
	
//	public void aggiorna(MsvOA_AnagLivelli o){
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
//	public void elimina(MsvOA_AnagLivelli oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				MsvOA_AnagLivelli o = em.find(MsvOA_AnagLivelli.class, oElimina.getLvmCodice());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public MsvOA_AnagLivelli getDaLvmCodice(String lvmCodice){
		MsvOA_AnagLivelli o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_AnagLivelli.findByLvmCodice");
				query.setParameter("lvmCodice", lvmCodice);
				o = (MsvOA_AnagLivelli)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_AnagLivelli getDaCodiceCascino(String codiceCascino){
		MsvOA_AnagLivelli o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_AnagLivelli.findByCodiceCascino");
				query.setParameter("codiceCascino", codiceCascino);
				o = (MsvOA_AnagLivelli)query.getSingleResult();
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
//				Query query = em.createNamedQuery("MsvOA_AnagLivelli.svuota");
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
