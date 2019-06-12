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
	
	@SuppressWarnings("unchecked")
	public List<AsOasic0f> getAll(){
		List<AsOasic0f> c = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsOasic0f.findAll");
				query.setParameter("oatipo", oatipo);
				c = (List<AsOasic0f>)query.getResultList();
			}catch(NoResultException e){
				c = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return c;
	}
	
//	public Boolean salva(AsOasic0f c){
//		try{
//			try{
//				utx.begin();
//				// precodice.setId(null);
//				log.info("salva: " + c.toString());
//				em.persist(c);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public Boolean aggiorna(AsOasic0f c){
		try{
			try{
				utx.begin();
				log.info("aggiorna: " + c.toString());
				em.merge(c);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
			return false;
		}
		return true;
	}
	
//	public void elimina(AsOasic0f cElimina){
//		try{
//			try{
//				utx.begin();
//				AsOasic0f c = em.find(AsOasic0f.class, cElimina.getId());
//				log.info("elimina: " + c.toString());
//				em.remove(c);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<AsOasic0f> getCmdByOacass(String lycass){
//		List<AsOasic0f> c = null;
//		try{
//			try{
//				utx.begin();
//				Query query = em.createNamedQuery("AsOasic0f.findAll");//findByOacass");
////				query.setParameter("lycass", lycass);
////				query.setParameter("lytip", lytip);
//				c = (List<AsOasic0f>)query.getResultList();
//			}catch(NoResultException e){
//				c = null;
//			}
//			utx.commit();
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//		return c;
//	}
//	
	@SuppressWarnings("unchecked")
	public List<AsOasic0f> getCmdToDo(){
		List<AsOasic0f> c = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsOasic0f.findByToDo");
				query.setParameter("oatipo", oatipo);
				c = (List<AsOasic0f>)query.getResultList();
			}catch(NoResultException e){
				c = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return c;
	}
	
	public AsOasic0f getDaOaidtr(Integer oaidtr){
		AsOasic0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsOasic0f.findByOaidtr");
				query.setParameter("oaidtr", oaidtr);
				o = (AsOasic0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public String updateRis(AsOasic0f cmd){
		Integer c = -1;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsOasic0f.updateRis");
				query.setParameter("oacmd1", cmd.getId().getOacmd1());
				query.setParameter("oaris1", cmd.getOaris1());
				query.setParameter("oaidtr", cmd.getId().getOaidtr());
				query.setParameter("oatipo", oatipo);
				c = query.executeUpdate();
			}catch(NoResultException e){
				c = -1;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return c.toString();
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
