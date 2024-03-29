package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_BarcodeDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Barcode;
import it.cascino.oasi.utils.Resources;

public class MsvAS_BarcodeDaoMng implements MsvAS_BarcodeDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvAS_BarcodeDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvAS_Barcode> getAll(){
		List<MsvAS_Barcode> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Barcode.findAll");
				o = (List<MsvAS_Barcode>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void salva(MsvAS_Barcode a){
		try{
			try{
				utx.begin();
				// log.info("salva: " + a.toString());
				em.persist(a);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.error("salva: " + a.toString());
			log.fatal(e.toString());
		}
	}
	
	public void aggiorna(MsvAS_Barcode a){
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
	
	public MsvAS_Barcode getDaCodiceBarcode(String codArticolo, String barcode){
		MsvAS_Barcode o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvAS_Barcode.findByCodArticoloBarcode");
				query.setParameter("articolo", codArticolo);
				query.setParameter("barcode", barcode);
				o = (MsvAS_Barcode)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void svuotaTabella(){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("MsvAS_Barcode.svuota");
				query.executeUpdate();
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void detach(Object entity){
		em.detach(entity);
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
