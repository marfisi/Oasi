package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import it.cascino.oasi.dbas.model.AsScocr0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsScocr0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsScocr0fDaoMng implements AsScocr0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsScocr0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsScocr0f> getAll(){
		List<AsScocr0f> cod = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsScocr0f.findAll");
				cod = (List<AsScocr0f>)query.getResultList();
			}catch(NoResultException e){
				cod = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return cod;
	}
	
	public Boolean salva(AsScocr0f o){
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
	
	public Boolean aggiorna(AsScocr0f o){
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
	
//	public void elimina(AsScocr0f oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				AsScocr0f o = em.find(AsScocr0f.class, oElimina.getVcoda());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public AsScocr0f getDaId(Integer scdat, Integer scnuz, Integer scnum){
		AsScocr0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsScocr0f.findById");
				query.setParameter("scdat", scdat);
				query.setParameter("scnuz", scnuz);
				query.setParameter("scnum", scnum);
				o = (AsScocr0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsScocr0f getDaScdatScnusScdep(Integer scdat, Integer scnus, Integer scdep){
		AsScocr0f o = null;
		try{
			try{
				utx.begin();
				// Query query = em.createNamedQuery("AsScocr0f.findByScdatScnusScdep"); @NamedQuery(name = "AsScocr0f.findByScdatScnusScdep", query = "SELECT o FROM Scocr0f o WHERE o.id.scdat = :scdat and o.scnus = :scnus and o.scdep = :scdep")
				String sql = "SELECT * FROM Scocr0f o WHERE o.scdat = :scdat and o.scnus = :scnus and o.scdep = :scdep order by o.scnum desc limit 1";
				Query query = em.createNativeQuery(sql, AsScocr0f.class);
				query.setParameter("scdat", scdat);
				query.setParameter("scnus", scnus);
				query.setParameter("scdep", scdep);
				o = (AsScocr0f)query.getSingleResult();
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
