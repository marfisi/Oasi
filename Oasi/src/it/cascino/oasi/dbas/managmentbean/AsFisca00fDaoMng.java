package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsFisca00fDao;
import it.cascino.oasi.dbas.model.AsFisca00f;
import it.cascino.oasi.utils.Resources;

public class AsFisca00fDaoMng implements AsFisca00fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsFisca00fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsFisca00f> getAll(){
		List<AsFisca00f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsFisca00f.findAll");
				o = (List<AsFisca00f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsFisca00f o){
		try{
			try{
				utx.begin();
				log.info("salva: " + o.toString());
				em.persist(o);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
			return false;
		}
		return true;
	}
	
	public Boolean aggiorna(AsFisca00f o){
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
			return false;
		}
		return true;
	}
	
	public AsFisca00f getDaFiccfoFitcfo(BigDecimal ficcfo, String fitcfo){
		AsFisca00f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsFisca00f.findByFiccfoFitcfo");
				query.setParameter("ficcfo", ficcfo);
				query.setParameter("fitcfo", fitcfo);
				o = (AsFisca00f)query.getSingleResult();
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
