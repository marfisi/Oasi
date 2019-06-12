package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_ClientiDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Clienti;
import it.cascino.oasi.utils.Resources;

public class MsvOA_ClientiDaoMng implements MsvOA_ClientiDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_ClientiDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_Clienti> getAll(){
		List<MsvOA_Clienti> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_Clienti.findAll");
				o = (List<MsvOA_Clienti>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// TODO @Transactional(rollbackOn = MsvOA_Clienti.class)
//	public void salva(MsvOA_Clienti a){
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
	
	public void aggiorna(MsvOA_Clienti a){
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
	
	public void elimina(MsvOA_Clienti aElimina){
		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
		try{
			try{
				utx.begin();
				MsvOA_Clienti a = em.find(MsvOA_Clienti.class, aElimina.getCodice());
				log.info("elimina: " + a.toString());
				em.remove(a);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public MsvOA_Clienti getDaCodice(String codice){
		MsvOA_Clienti o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_Clienti.findByCodice");
				query.setParameter("codice", codice);
				o = (MsvOA_Clienti)query.getSingleResult();
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
//				Query query = em.createNamedQuery("MsvOA_Clienti.svuota");
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
