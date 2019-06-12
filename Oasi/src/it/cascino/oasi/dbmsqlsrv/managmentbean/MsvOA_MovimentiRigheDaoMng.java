package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_MovimentiRigheDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_MovimentiRighe;
import it.cascino.oasi.utils.Resources;

public class MsvOA_MovimentiRigheDaoMng implements MsvOA_MovimentiRigheDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_MovimentiRigheDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_MovimentiRighe> getAll(){
		List<MsvOA_MovimentiRighe> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findAll");
				o = (List<MsvOA_MovimentiRighe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
//	public void salva(MsvOA_MovimentiRighe a){
//		try{
//			try{
//				utx.begin();
//				// precodice.setId(null);
////				log.info("salva: " + a.toString());
//				em.persist(a);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.error("salva: " + a.toString());
//			log.fatal(e.toString());
//		}
//	}
	
	public void aggiorna(MsvOA_MovimentiRighe a){
		try{
			try{
				utx.begin();
				log.info("aggiorna: " + a.toString());
				em.merge(a);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
//	public void elimina(MsvOA_MovimentiRighe oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				MsvOA_MovimentiRighe a = em.find(MsvOA_MovimentiRighe.class, oElimina.getId());
//				log.info("elimina: " + a.toString());
//				em.remove(a);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_MovimentiRighe> getDaIdUnivocoTes(String idUnivocoTes){
		List<MsvOA_MovimentiRighe> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findByIdUnivocoTes");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_MovimentiRighe>)query.getResultList();
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
	public List<MsvOA_MovimentiRighe> getDaIdUnivocoTesNonElaborate(String idUnivocoTes){
		List<MsvOA_MovimentiRighe> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findByIdUnivocoTesNonElaborate");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_MovimentiRighe>)query.getResultList();
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
	public List<MsvOA_MovimentiRighe> getDaIdUnivocoTesElaborate(String idUnivocoTes){
		List<MsvOA_MovimentiRighe> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findByIdUnivocoTesElaborate");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_MovimentiRighe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_MovimentiRighe getDaIdUnivocoTesIdUnivocoRiga(String idUnivocoTes, String idUnivocoRiga){
		MsvOA_MovimentiRighe o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findByIdUnivocoTesIdUnivocoRiga");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				query.setParameter("idUnivocoRiga", idUnivocoRiga);
				o = (MsvOA_MovimentiRighe)query.getSingleResult();
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
//				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.svuota");
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
