package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvNativeQueryDao;
import it.cascino.oasi.utils.Resources;

public class MsvNativeQueryDaoMng implements MsvNativeQueryDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = LogManager.getLogger(MsvNativeQueryDaoMng.class);
	
	public Integer rimuoviRigheVecchie(String data){
		Integer o = -1;
		try{
			try{
				utx.begin();
				
				// non modificare l'ordine delle query di cancellazione
				
				String sql = "DELETE FROM OA_MovimentiRighe where IdUnivocoTes in (SELECT IdUnivocoTes FROM OA_MovimentiTestate where DataReg <= '" + data + "')";
				Query query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				log.info("Eliminate " + o + " righe da " + "OA_MovimentiRighe");
				
				sql = "DELETE FROM OA_MovimentiTestate where DataReg <= '" + data + "'";
				query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				log.info("Eliminate " + o + " righe da " + "OA_MovimentiTestate");
				
				sql = "DELETE FROM OA_PrimaNota_Iva where NReg in (SELECT NReg  FROM OA_PrimaNota_Tes where DataReg <= '" + data + "')";
				query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				log.info("Eliminate " + o + " righe da " + "OA_PrimaNota_Iva");
				
				sql = "DELETE FROM OA_PrimaNota_Righe where NReg in (SELECT NReg  FROM OA_PrimaNota_Tes where DataReg <= '" + data + "')";
				query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				log.info("Eliminate " + o + " righe da " + "OA_PrimaNota_Righe");
				
				sql = "DELETE FROM OA_PrimaNota_Tes where DataReg <= '" + data + "'";
				query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				log.info("Eliminate " + o + " righe da " + "OA_PrimaNota_Tes");
				
				sql = "DELETE FROM OA_PrimaNota_Scad where DataReg <= '" + data + "'";
				query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				log.info("Eliminate " + o + " righe da " + "OA_PrimaNota_Scad");
				
				sql = "DELETE FROM OA_CarichiRighe where IdUnivocoTes in (SELECT IdUnivocoTes FROM OA_CarichiTestate where DataReg <= '" + data + "')";
				query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				log.info("Eliminate " + o + " righe da " + "OA_CarichiRighe");
				
				sql = "DELETE FROM OA_CarichiTestate where DataReg <= '" + data + "'";
				query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				log.info("Eliminate " + o + " righe da " + "OA_CarichiTestate");
			}catch(NoResultException e){
				o = -1;
			}
			utx.commit();
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
