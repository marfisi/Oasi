package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_PrimaNota_TesDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Tes;
import it.cascino.oasi.utils.Resources;

public class MsvOA_PrimaNota_TesDaoMng implements MsvOA_PrimaNota_TesDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_PrimaNota_TesDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_PrimaNota_Tes> getAll(){
		List<MsvOA_PrimaNota_Tes> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Tes.findAll");
				o = (List<MsvOA_PrimaNota_Tes>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void aggiorna(MsvOA_PrimaNota_Tes o){
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
	
	public MsvOA_PrimaNota_Tes getDaNReg(String nReg){
		MsvOA_PrimaNota_Tes o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Tes.findByNReg");
				query.setParameter("nReg", nReg);
				o = (MsvOA_PrimaNota_Tes)query.getSingleResult();
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
	public List<MsvOA_PrimaNota_Tes> getDaRegIva(String regIva){
		List<MsvOA_PrimaNota_Tes> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Tes.findByRegIva");
				query.setParameter("regIva", regIva);
				o = (List<MsvOA_PrimaNota_Tes>)query.getResultList();
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
	public List<MsvOA_PrimaNota_Tes> getDaCausale(String causale){
		List<MsvOA_PrimaNota_Tes> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_PrimaNota_Tes.findByCausale");
				query.setParameter("causale", causale);
				o = (List<MsvOA_PrimaNota_Tes>)query.getResultList();
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
	public List<MsvOA_PrimaNota_Tes> getDaCausali(String causali){
		List<MsvOA_PrimaNota_Tes> o = null;
		try{
			try{
				String sql = "SELECT * FROM OA_PrimaNota_Tes o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' and o.causale in (" + causali + ") order by o.dataReg, o.sezionale, o.documento";
				Query query = em.createNativeQuery(sql, MsvOA_PrimaNota_Tes.class);
				o = (List<MsvOA_PrimaNota_Tes>)query.getResultList();
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
