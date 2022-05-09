package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_MovimentiRigheDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_MovimentiRighe;
import it.cascino.oasi.utils.Resources;

public class MsvOA_MovimentiRigheDaoMng implements MsvOA_MovimentiRigheDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvOA_MovimentiRigheDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_MovimentiRighe> getAll(){
		List<MsvOA_MovimentiRighe> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findAll");
				o = (List<MsvOA_MovimentiRighe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void aggiorna(MsvOA_MovimentiRighe o){
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
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_MovimentiRighe> getDaIdUnivocoTes(String idUnivocoTes){
		List<MsvOA_MovimentiRighe> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findByIdUnivocoTes");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_MovimentiRighe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_MovimentiRighe> getDaIdUnivocoTesNonElaborate(String idUnivocoTes){
		List<MsvOA_MovimentiRighe> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findByIdUnivocoTesNonElaborate");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_MovimentiRighe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_MovimentiRighe> getDaIdUnivocoTesElaborate(String idUnivocoTes){
		List<MsvOA_MovimentiRighe> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findByIdUnivocoTesElaborate");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_MovimentiRighe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_MovimentiRighe getDaIdUnivocoTesIdUnivocoRiga(String idUnivocoTes, String idUnivocoRiga){
		MsvOA_MovimentiRighe o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_MovimentiRighe.findByIdUnivocoTesIdUnivocoRiga");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				query.setParameter("idUnivocoRiga", idUnivocoRiga);
				o = (MsvOA_MovimentiRighe)query.getSingleResult();
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
