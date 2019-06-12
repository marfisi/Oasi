package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_ArticoliDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Articoli;
import it.cascino.oasi.utils.Resources;

public class MsvOA_ArticoliDaoMng implements MsvOA_ArticoliDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_ArticoliDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_Articoli> getAll(){
		List<MsvOA_Articoli> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_Articoli.findAll");
				o = (List<MsvOA_Articoli>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// TODO @Transactional(rollbackOn = MsvOA_Articoli.class)
//	public void salva(MsvOA_Articoli o){
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
	
	public void aggiorna(MsvOA_Articoli o){
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
	
	public void elimina(MsvOA_Articoli oElimina){
		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
		try{
			try{
				utx.begin();
				MsvOA_Articoli o = em.find(MsvOA_Articoli.class, oElimina.getCodBreveOasi());
				log.info("elimina: " + o.toString());
				em.remove(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public MsvOA_Articoli getDaCodBreveOasi(String codBreveOasi){
		MsvOA_Articoli o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_Articoli.findByCodBreveOasi");
				query.setParameter("codBreveOasi", codBreveOasi);
				o = (MsvOA_Articoli)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_Articoli getDaCodArticoloCascino(String codArticoloCascino){
		MsvOA_Articoli o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_Articoli.findByCodArticoloCascino");
				query.setParameter("codArticoloCascino", codArticoloCascino);
				o = (MsvOA_Articoli)query.getSingleResult();
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
//				Query query = em.createNamedQuery("MsvOA_Articoli.svuota");
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
