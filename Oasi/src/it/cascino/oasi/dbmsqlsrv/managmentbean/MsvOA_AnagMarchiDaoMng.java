package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_AnagMarchiDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagMarchi;
import it.cascino.oasi.utils.Resources;

public class MsvOA_AnagMarchiDaoMng implements MsvOA_AnagMarchiDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_AnagMarchiDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_AnagMarchi> getAll(){
		List<MsvOA_AnagMarchi> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_AnagMarchi.findAll");
				o = (List<MsvOA_AnagMarchi>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// TODO @Transactional(rollbackOn = MsvOA_AnagMarchi.class)
//	public void salva(MsvOA_AnagMarchi o){
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
	
//	public void aggiorna(MsvOA_AnagMarchi o){
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
	
	public void elimina(MsvOA_AnagMarchi oElimina){
		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
		try{
			try{
				utx.begin();
				MsvOA_AnagMarchi o = em.find(MsvOA_AnagMarchi.class, oElimina.getMchCodice());
				log.info("elimina: " + o.toString());
				em.remove(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public MsvOA_AnagMarchi getDaMchCodice(String mchCodice){
		MsvOA_AnagMarchi o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_AnagMarchi.findByMchCodice");
				query.setParameter("mchCodice", mchCodice);
				o = (MsvOA_AnagMarchi)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_AnagMarchi getDaCodiceCascino(String codiceCascino){
		MsvOA_AnagMarchi o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_AnagMarchi.findByCodiceCascino");
				query.setParameter("codiceCascino", codiceCascino);
				o = (MsvOA_AnagMarchi)query.getSingleResult();
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
//				Query query = em.createNamedQuery("MsvOA_AnagMarchi.svuota");
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
