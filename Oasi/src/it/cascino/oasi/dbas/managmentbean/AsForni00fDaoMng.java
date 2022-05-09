package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsForni00fDao;
import it.cascino.oasi.dbas.model.AsForni00f;
import it.cascino.oasi.utils.Resources;

public class AsForni00fDaoMng implements AsForni00fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	// private EntityTransaction utx = res.getUtxAs();
	
	Logger log = LogManager.getLogger(AsForni00fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsForni00f> getAll(){
		List<AsForni00f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsForni00f.findAll");
				o = (List<AsForni00f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsForni00f getDaFocfor(Integer focfor){
		AsForni00f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsForni00f.findByFocfor");
				query.setParameter("focfor", focfor);
				o = (AsForni00f)query.getSingleResult();
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
	public List<AsForni00f> getAggiornatiDopo(Integer fouins, Integer fohins){
		List<AsForni00f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsForni00f.findAggiornatiDopo");
				query.setParameter("fouins", fouins);
				query.setParameter("fohins", fohins);
				o = (List<AsForni00f>)query.getResultList();
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
