package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_ClientiDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Clienti;
import it.cascino.oasi.utils.Resources;

public class MsvAS_ClientiDaoMng implements MsvAS_ClientiDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvAS_ClientiDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvAS_Clienti> getAll(){
		List<MsvAS_Clienti> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvAS_Clienti.findAll");
				o = (List<MsvAS_Clienti>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// TODO @Transactional(rollbackOn = MsvAS_Clienti.class)
	public void salva(MsvAS_Clienti a){
		try{
			try{
				utx.begin();
				// precodice.setId(null);
//				log.info("salva: " + a.toString());
				em.persist(a);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.error("salva: " + a.toString());
			log.fatal(e.toString());
		}
	}
	
	public void aggiorna(MsvAS_Clienti a){
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
	
//	public void elimina(MsvAS_Clienti aElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				MsvAS_Clienti a = em.find(MsvAS_Clienti.class, aElimina.getMcoda());
//				log.info("elimina: " + a.toString());
//				em.remove(a);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public MsvAS_Clienti getDaCodice(String codice){
		MsvAS_Clienti o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvAS_Clienti.findByCodice");
				query.setParameter("codice", codice);
				o = (MsvAS_Clienti)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void svuotaTabella(){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvAS_Clienti.svuota");
				query.executeUpdate();
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
