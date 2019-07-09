package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_PrimaNota_RigheDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Righe;
import it.cascino.oasi.utils.Resources;

public class MsvOA_PrimaNota_RigheDaoMng implements MsvOA_PrimaNota_RigheDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_PrimaNota_RigheDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_PrimaNota_Righe> getAll(){
		List<MsvOA_PrimaNota_Righe> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Righe.findAll");
				o = (List<MsvOA_PrimaNota_Righe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
//	public void salva(MsvOA_PrimaNota_Righe o){
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
	
	public void aggiorna(MsvOA_PrimaNota_Righe o){
		try{
			try{
				utx.begin();
				log.info("aggiorna: " + o.toString());
				em.merge(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
//	public void elimina(MsvOA_PrimaNota_Righe oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				MsvOA_PrimaNota_Righe o = em.find(MsvOA_PrimaNota_Righe.class, oElimina.getId());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_PrimaNota_Righe> getDaNReg(String nReg){
		List<MsvOA_PrimaNota_Righe> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Righe.findByNReg");
				query.setParameter("nReg", nReg);
				o = (List<MsvOA_PrimaNota_Righe>)query.getResultList();
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
	public List<MsvOA_PrimaNota_Righe> getDaNRegElaborate(String nReg){
		List<MsvOA_PrimaNota_Righe> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Righe.findByNRegElaborate");
				query.setParameter("nReg", nReg);
				o = (List<MsvOA_PrimaNota_Righe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_PrimaNota_Righe getDaId(String nReg, String nRiga){
		MsvOA_PrimaNota_Righe o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Righe.findById");
				query.setParameter("nReg", nReg);
				query.setParameter("nRiga", nRiga);
				o = (MsvOA_PrimaNota_Righe)query.getSingleResult();
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
//				Query query = em.createNamedQuery("MsvOA_PrimaNota_Righe.svuota");
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
