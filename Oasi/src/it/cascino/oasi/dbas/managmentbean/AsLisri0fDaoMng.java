package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsLisri0fDao;
import it.cascino.oasi.dbas.model.AsLisri0f;
import it.cascino.oasi.utils.Resources;

public class AsLisri0fDaoMng implements AsLisri0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	// private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsLisri0fDaoMng.class);
	
	public AsLisri0f getDaId(String lscoa, Integer idlis, String lstve){
		AsLisri0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsLisri0f.findById");
				query.setParameter("lscoa", lscoa);
				query.setParameter("idlis", idlis);
				query.setParameter("lstve", lstve);
				o = (AsLisri0f)query.getSingleResult();
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
