package it.cascino.oasi.dbmsqlsrv.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_ClientiDao;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Clienti;
import it.cascino.oasi.utils.Resources;

public class MsvOA_ClientiDaoMng implements MsvOA_ClientiDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmMSsqlSrv();
	private EntityTransaction utx = res.getUtxMSsqlSrv();
	
	Logger log = Logger.getLogger(MsvOA_ClientiDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<MsvOA_Clienti> getAll(){
		List<MsvOA_Clienti> o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_Clienti.findAll");
				o = (List<MsvOA_Clienti>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public void aggiorna(MsvOA_Clienti o){
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
	
	public void elimina(MsvOA_Clienti oElimina){
		try{
			try{
				utx.begin();
				MsvOA_Clienti o = em.find(MsvOA_Clienti.class, oElimina.getCodice());
				log.info("elimina: " + o.toString());
				em.remove(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public MsvOA_Clienti getDaCodice(String codice){
		MsvOA_Clienti o = null;
		try{
			try{
				Query query = em.createNamedQuery("MsvOA_Clienti.findByCodice");
				query.setParameter("codice", codice);
				o = (MsvOA_Clienti)query.getSingleResult();
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
