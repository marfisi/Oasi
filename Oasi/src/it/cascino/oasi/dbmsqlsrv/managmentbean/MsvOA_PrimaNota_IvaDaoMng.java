package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_PrimaNota_IvaDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Iva;
import it.cascino.oasi.utils.Resources;

public class MsvOA_PrimaNota_IvaDaoMng implements MsvOA_PrimaNota_IvaDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_PrimaNota_IvaDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_PrimaNota_Iva> getAll(){
		List<MsvOA_PrimaNota_Iva> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Iva.findAll");
				o = (List<MsvOA_PrimaNota_Iva>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
//	public void salva(MsvOA_PrimaNota_Iva o){
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
	
	public void aggiorna(MsvOA_PrimaNota_Iva o){
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
	
//	public void elimina(MsvOA_PrimaNota_Iva oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				MsvOA_PrimaNota_Iva o = em.find(MsvOA_PrimaNota_Iva.class, oElimina.getId());
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
	public List<MsvOA_PrimaNota_Iva> getDaNReg(String nReg){
		List<MsvOA_PrimaNota_Iva> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Iva.findByNReg");
				query.setParameter("nReg", nReg);
				o = (List<MsvOA_PrimaNota_Iva>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_PrimaNota_Iva getDaId(String nReg, String nRiga){
		MsvOA_PrimaNota_Iva o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Iva.findByNRegNRiga");
				query.setParameter("nReg", nReg);
				query.setParameter("nRiga", nRiga);
				o = (MsvOA_PrimaNota_Iva)query.getSingleResult();
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
//				Query query = em.createNamedQuery("MsvOA_PrimaNota_Iva.svuota");
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
