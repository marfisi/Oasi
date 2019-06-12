package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_PrimaNota_TesDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Tes;
import it.cascino.oasi.utils.Resources;

public class MsvOA_PrimaNota_TesDaoMng implements MsvOA_PrimaNota_TesDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_PrimaNota_TesDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_PrimaNota_Tes> getAll(){
		List<MsvOA_PrimaNota_Tes> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Tes.findAll");
				o = (List<MsvOA_PrimaNota_Tes>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
//	public void salva(MsvOA_PrimaNota_Tes o){
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
	
	public void aggiorna(MsvOA_PrimaNota_Tes o){
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
	
//	public void elimina(MsvOA_PrimaNota_Tes oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				MsvOA_PrimaNota_Tes o = em.find(MsvOA_PrimaNota_Tes.class, oElimina.getnReg());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public MsvOA_PrimaNota_Tes getDaNReg(String nReg){
		MsvOA_PrimaNota_Tes o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Tes.findByNReg");
				query.setParameter("nReg", nReg);
				o = (MsvOA_PrimaNota_Tes)query.getSingleResult();
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
	public List<MsvOA_PrimaNota_Tes> getDaRegIva(String regIva){
		List<MsvOA_PrimaNota_Tes> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Tes.findByRegIva");
				query.setParameter("regIva", regIva);
				o = (List<MsvOA_PrimaNota_Tes>)query.getResultList();
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
//				Query query = em.createNamedQuery("MsvOA_PrimaNota_Tes.svuota");
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
