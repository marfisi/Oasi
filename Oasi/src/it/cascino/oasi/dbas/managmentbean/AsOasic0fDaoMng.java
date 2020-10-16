package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import it.cascino.oasi.dbas.model.AsOasic0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsOasic0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsOasic0fDaoMng implements AsOasic0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsOasic0fDaoMng.class);
	
	private final String oatipo = "";
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsOasic0f> getAll(){
		List<AsOasic0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsOasic0f.findAll");
				query.setParameter("oatipo", oatipo);
				o = (List<AsOasic0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean aggiorna(AsOasic0f o){
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
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsOasic0f> getCmdToDo(){
		List<AsOasic0f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsOasic0f.findByToDo");
				query.setParameter("oatipo", oatipo);
				o = (List<AsOasic0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsOasic0f getDaOaidtr(Integer oaidtr){
		AsOasic0f o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsOasic0f.findByOaidtr");
				query.setParameter("oaidtr", oaidtr);
				o = (AsOasic0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public String updateRis(AsOasic0f cmd){
		Integer o = -1;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsOasic0f.updateRis");
				query.setParameter("oacmd1", cmd.getId().getOacmd1());
				query.setParameter("oaris1", cmd.getOaris1());
				query.setParameter("oaidtr", cmd.getId().getOaidtr());
				query.setParameter("oatipo", oatipo);
				o = query.executeUpdate();
			}catch(NoResultException e){
				o = -1;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o.toString();
	}
	
	public void detach(Object entity){
		em.detach(entity);
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
