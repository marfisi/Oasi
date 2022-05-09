package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_CarichiRigheDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_CarichiRighe;
import it.cascino.oasi.utils.Resources;

public class MsvOA_CarichiRigheDaoMng implements MsvOA_CarichiRigheDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvOA_CarichiRigheDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_CarichiRighe> getAll(){
		List<MsvOA_CarichiRighe> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_CarichiRighe.findAll");
				o = (List<MsvOA_CarichiRighe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void aggiorna(MsvOA_CarichiRighe o){
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
	public List<MsvOA_CarichiRighe> getDaIdUnivocoTes(String idUnivocoTes){
		List<MsvOA_CarichiRighe> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_CarichiRighe.findByIdUnivocoTes");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_CarichiRighe>)query.getResultList();
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
	public List<MsvOA_CarichiRighe> getDaIdUnivocoTesNonElaborate(String idUnivocoTes){
		List<MsvOA_CarichiRighe> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_CarichiRighe.findByIdUnivocoTesNonElaborate");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_CarichiRighe>)query.getResultList();
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
	public List<MsvOA_CarichiRighe> getDaIdUnivocoTesElaborate(String idUnivocoTes){
		List<MsvOA_CarichiRighe> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_CarichiRighe.findByIdUnivocoTesElaborate");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_CarichiRighe>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_CarichiRighe getDaIdUnivocoTesIdUnivocoRiga(String idUnivocoTes, String idUnivocoRiga){
		MsvOA_CarichiRighe o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_CarichiRighe.findByIdUnivocoTesIdUnivocoRiga");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				query.setParameter("idUnivocoRiga", idUnivocoRiga);
				o = (MsvOA_CarichiRighe)query.getSingleResult();
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
