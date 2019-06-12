package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_GiacenzeDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Giacenze;
import it.cascino.oasi.utils.Resources;

public class MsvAS_GiacenzeDaoMng implements MsvAS_GiacenzeDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvAS_GiacenzeDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<MsvAS_Giacenze> getAll(){
		List<MsvAS_Giacenze> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvAS_Giacenze.findAll");
				o = (List<MsvAS_Giacenze>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void salva(MsvAS_Giacenze a){
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
	
	public void aggiorna(MsvAS_Giacenze a){
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
	
//	public void elimina(MsvAS_Giacenze aElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				MsvAS_Giacenze a = em.find(MsvAS_Giacenze.class, aElimina.getMcoda());
//				log.info("elimina: " + a.toString());
//				em.remove(a);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public MsvAS_Giacenze getDaCodArticoloCodDeposito(String codArticolo, String codDeposito){
		MsvAS_Giacenze o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvAS_Giacenze.findByCodArticoloCodDeposito");
				query.setParameter("codArticolo", codArticolo);
				query.setParameter("codDeposito", codDeposito);
				o = (MsvAS_Giacenze)query.getSingleResult();
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
				Query query = em.createNamedQuery("MsvAS_Giacenze.svuota");
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
