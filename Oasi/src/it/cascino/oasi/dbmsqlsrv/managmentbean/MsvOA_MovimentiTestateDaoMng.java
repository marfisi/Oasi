package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_MovimentiTestateDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_MovimentiTestate;
import it.cascino.oasi.utils.Resources;

public class MsvOA_MovimentiTestateDaoMng implements MsvOA_MovimentiTestateDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_MovimentiTestateDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_MovimentiTestate> getAll(){
		List<MsvOA_MovimentiTestate> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_MovimentiTestate.findAll");
				o = (List<MsvOA_MovimentiTestate>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void aggiorna(MsvOA_MovimentiTestate o){
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
	public List<MsvOA_MovimentiTestate> getFatture(String causali){
		List<MsvOA_MovimentiTestate> o = null;
		try{
			try{
				// Query query = em.createNamedQuery("MsvOA_MovimentiTestate.findFatture"); @NamedQuery(name = "MsvOA_MovimentiTestate.findFatture", query = "SELECT o FROM OA_MovimentiTestate o WHERE substring(o.tipoOperazione, 1, 1) = '*' and o.tipoOperazione != 'DEL' and o.causaleOasi in ('CORC', 'RSCL') and o.documAccomp = 1 order by o.dataReg, o.idUnivocoTes")
				String sql = "SELECT * FROM OA_MovimentiTestate o WHERE substring(o.tipoOperazione, 1, 1) = '*' and o.tipoOperazione != 'DEL' and o.causaleOasi in (" + causali + ") and o.documAccomp = 1 order by o.dataReg, o.idUnivocoTes";
				Query query = em.createNativeQuery(sql, MsvOA_MovimentiTestate.class);
				// query.setParameter("causali", causali);
				o = (List<MsvOA_MovimentiTestate>)query.getResultList();
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
	public List<MsvOA_MovimentiTestate> getDaIdUnivocoTes(String idUnivocoTes){
		List<MsvOA_MovimentiTestate> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_MovimentiTestate.findByIdUnivocoTes");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_MovimentiTestate>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_MovimentiTestate getDaIdPntNReg(String idPntNReg){
		MsvOA_MovimentiTestate o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_MovimentiTestate.findByIdPntNReg");
				query.setParameter("idPntNReg", idPntNReg);
				o = (MsvOA_MovimentiTestate)query.getSingleResult();
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
	public List<MsvOA_MovimentiTestate> getTestateConRigheAggiornate(){
		List<MsvOA_MovimentiTestate> o = null;
		try{
			try{
				String sql = "SELECT * FROM OA_MovimentiTestate o WHERE substring(o.tipoOperazione, 1, 1) = '*' and o.tipoOperazione != 'DEL' and o.causaleOasi in ('CORC', 'VEDD', 'VEND', 'CFOR', 'CARF', 'RFOR') and o.idUnivocoTes in (SELECT idUnivocoTes FROM OA_MovimentiRighe r WHERE r.tipoOperazione in ('INS', 'UPD')) order by o.dataReg, o.idUnivocoTes";
				Query query = em.createNativeQuery(sql, MsvOA_MovimentiTestate.class);
				o = (List<MsvOA_MovimentiTestate>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Timestamp getMaxDataReg(){
		Timestamp o = null;
		try{
			try{
				String sql = "select max(datareg) from OA_MovimentiTestate where causaleOasi  = 'CORC'";
				Query query = em.createNativeQuery(sql);
				o = (Timestamp)query.getSingleResult();
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
