package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import it.cascino.oasi.dbas.model.AsMovma0f;
import it.cascino.oasi.utils.Resources;
import it.cascino.oasi.dbas.dao.AsMovma0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsMovma0fDaoMng implements AsMovma0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsMovma0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsMovma0f> getAll(){
		List<AsMovma0f> cod = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsMovma0f.findAll");
				cod = (List<AsMovma0f>)query.getResultList();
			}catch(NoResultException e){
				cod = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return cod;
	}
	
	public Boolean salva(AsMovma0f o){
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
	
	public Boolean aggiorna(AsMovma0f o){
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
	
//	public void elimina(AsMovma0f oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				AsMovma0f o = em.find(AsMovma0f.class, oElimina.getVcoda());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public AsMovma0f getDaId(Integer vdatr, String vcaus, Integer vnura, Integer vnumd, Integer vprog){
		AsMovma0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsMovma0f.findById");
				query.setParameter("vdatr", vdatr);
				query.setParameter("vcaus", vcaus);
				query.setParameter("vnura", vnura);
				query.setParameter("vnumd", vnumd);
				query.setParameter("vprog", vprog);
				o = (AsMovma0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}

	public BigDecimal getUltimoCostoArticolo(String vcoda){
		BigDecimal o = null;
		try{
			try{
				utx.begin();
				String sql = "select ((vprez - (vprez * vsco1 / 100)) - ((vprez - (vprez * vsco1 / 100)) * vsco2 / 100)) - (((vprez - (vprez * vsco1 / 100)) - ((vprez - (vprez * vsco1 / 100)) * vsco2 / 100)) * vsco3 / 100) from movma0f a where a.vprez > 0 and a.vcoda = :vcoda and left(a.vcaus, 1) = 'B' and a.vcaus <> 'B9' order by a.vdatr desc limit 1";
				Query query = em.createNativeQuery(sql);
				query.setParameter("vcoda", vcoda);
				o = (BigDecimal)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")
	public List<AsMovma0f> getDaVcoda(String vcoda, String dataPartenza, String depositi){
		List<AsMovma0f> o = null;
		try{
			try{
				utx.begin();
				String sql = "select * from movma0f where vcoda = :vcoda and vdatr >= :datapart and vndep in (" + depositi + ") order by vdatr, vndep, vcaus, vnura, vnumd";
				Query query = em.createNativeQuery(sql, AsMovma0f.class);
				query.setParameter("vcoda", vcoda);
				query.setParameter("datapart", dataPartenza);
				o = (List<AsMovma0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	
	public Integer aggiornaVcomm(Integer vdatr, String vcaus, Integer vnura, Integer vnumd, String vcomm){
		Integer o = null;
		try{
			try{
				utx.begin();
				String sql = "update movma0f set vcomm = X'" + vcomm + "' where vdatr = :vdatr and vcaus = :vcaus and vnura = :vnura and vnumd = :vnumd";
				Query query = em.createNativeQuery(sql);
				query.setParameter("vdatr", vdatr);
				query.setParameter("vcaus", vcaus);
				query.setParameter("vnura", vnura);
				query.setParameter("vnumd", vnumd);
				o = query.executeUpdate();
			}catch(NoResultException e){
				o = -1;
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
