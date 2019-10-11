package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
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
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_MovimentiTestate> getAll(){
		List<MsvOA_MovimentiTestate> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_MovimentiTestate.findAll");
				o = (List<MsvOA_MovimentiTestate>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
//	public void salva(MsvOA_MovimentiTestate a){
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
	
	public void aggiorna(MsvOA_MovimentiTestate a){
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
	
//	public void elimina(MsvOA_MovimentiTestate oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				MsvOA_MovimentiTestate a = em.find(MsvOA_MovimentiTestate.class, oElimina.getIdUnivocoTes());
//				log.info("elimina: " + a.toString());
//				em.remove(a);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
//	public void svuotaTabella(){
//		try{
//			try{
//				utx.begin();
//				Query query = em.createNamedQuery("MsvOA_MovimentiTestate.svuota");
//				query.executeUpdate();
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	@SuppressWarnings("unchecked")
	public List<MsvOA_MovimentiTestate> getFatture(String causali){
		List<MsvOA_MovimentiTestate> o = null;
		try{
			try{
				utx.begin();
//				Query query = em.createNamedQuery("MsvOA_MovimentiTestate.findFatture"); @NamedQuery(name = "MsvOA_MovimentiTestate.findFatture", query = "SELECT o FROM OA_MovimentiTestate o WHERE substring(o.tipoOperazione, 1, 1) = '*' and o.tipoOperazione != 'DEL' and o.causaleOasi in ('CORC', 'RSCL') and o.documAccomp = 1 order by o.dataReg, o.idUnivocoTes")
				String sql = "SELECT * FROM OA_MovimentiTestate o WHERE substring(o.tipoOperazione, 1, 1) = '*' and o.tipoOperazione != 'DEL' and o.causaleOasi in (" + causali + ") and o.documAccomp = 1 order by o.dataReg, o.idUnivocoTes";
				Query query = em.createNativeQuery(sql, MsvOA_MovimentiTestate.class);
//				query.setParameter("causali", causali);
				o = (List<MsvOA_MovimentiTestate>)query.getResultList();
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
	public List<MsvOA_MovimentiTestate> getDaIdUnivocoTes(String idUnivocoTes){
		List<MsvOA_MovimentiTestate> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_MovimentiTestate.findByIdUnivocoTes");
				query.setParameter("idUnivocoTes", idUnivocoTes);
				o = (List<MsvOA_MovimentiTestate>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public MsvOA_MovimentiTestate getDaIdPntNReg(String idPntNReg){
		MsvOA_MovimentiTestate o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvOA_MovimentiTestate.findByIdPntNReg");
				query.setParameter("idPntNReg", idPntNReg);
				o = (MsvOA_MovimentiTestate)query.getSingleResult();
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
	public List<MsvOA_MovimentiTestate> getTestateConRigheAggiornate(){
		List<MsvOA_MovimentiTestate> o = null;
		try{
			try{
				utx.begin();
				String sql = "SELECT * FROM OA_MovimentiTestate o WHERE substring(o.tipoOperazione, 1, 1) = '*' and o.tipoOperazione != 'DEL' and o.causaleOasi in ('CORC', 'VEDD', 'VEND', 'CFOR', 'CARF', 'RFOR') and o.idUnivocoTes in (SELECT idUnivocoTes FROM OA_MovimentiRighe r WHERE r.tipoOperazione in ('INS', 'UPD')) order by o.dataReg, o.idUnivocoTes";
				Query query = em.createNativeQuery(sql, MsvOA_MovimentiTestate.class);
				o = (List<MsvOA_MovimentiTestate>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
