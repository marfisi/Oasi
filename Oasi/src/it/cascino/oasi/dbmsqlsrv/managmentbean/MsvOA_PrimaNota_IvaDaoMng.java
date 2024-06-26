package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_PrimaNota_IvaDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Iva;
import it.cascino.oasi.utils.Resources;

public class MsvOA_PrimaNota_IvaDaoMng implements MsvOA_PrimaNota_IvaDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvOA_PrimaNota_IvaDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_PrimaNota_Iva> getAll(){
		List<MsvOA_PrimaNota_Iva> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Iva.findAll");
				o = (List<MsvOA_PrimaNota_Iva>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
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
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_PrimaNota_Iva> getDaNReg(String nReg){
		List<MsvOA_PrimaNota_Iva> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Iva.findByNReg");
				query.setParameter("nReg", nReg);
				o = (List<MsvOA_PrimaNota_Iva>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_PrimaNota_Iva getDaId(String nReg, String nRiga){
		MsvOA_PrimaNota_Iva o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Iva.findByNRegNRiga");
				query.setParameter("nReg", nReg);
				query.setParameter("nRiga", nRiga);
				o = (MsvOA_PrimaNota_Iva)query.getSingleResult();
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
	public List<MsvOA_PrimaNota_Iva> getDaNRegNoTipoOperazione(String nReg){
		List<MsvOA_PrimaNota_Iva> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Iva.findByNRegNoTipoOperazione");
				query.setParameter("nReg", nReg);
				o = (List<MsvOA_PrimaNota_Iva>)query.getResultList();
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
