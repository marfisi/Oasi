package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_FornitoriDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Fornitori;
import it.cascino.oasi.utils.Resources;

public class MsvAS_FornitoriDaoMng implements MsvAS_FornitoriDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvAS_FornitoriDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvAS_Fornitori> getAll(){
		List<MsvAS_Fornitori> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Fornitori.findAll");
				o = (List<MsvAS_Fornitori>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	// @Transactional(rollbackOn = MsvAS_Fornitori.class)
	public void salva(MsvAS_Fornitori o){
		try{
			try{
				utx.begin();
				// log.info("salva: " + o.toString());
				em.persist(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.error("salva: " + o.toString());
			log.fatal(e.toString());
		}
	}
	
	public void aggiorna(MsvAS_Fornitori o){
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
	
	public void svuotaTabella(){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvAS_Fornitori.svuota");
				query.executeUpdate();
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public MsvAS_Fornitori getDaCodice(String codice){
		MsvAS_Fornitori o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Fornitori.findByCodice");
				query.setParameter("codice", codice);
				o = (MsvAS_Fornitori)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void detach(Object entity){
		em.detach(entity);
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
