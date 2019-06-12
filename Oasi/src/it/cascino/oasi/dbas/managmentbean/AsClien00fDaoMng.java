package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsClien00fDao;
import it.cascino.oasi.dbas.model.AsClien00f;
import it.cascino.oasi.utils.Resources;

public class AsClien00fDaoMng implements AsClien00fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsClien00fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsClien00f> getAll(){
		List<AsClien00f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsClien00f.findAll");
				o = (List<AsClien00f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsClien00f o){
		try{
			try{
				utx.begin();
				// precodice.setId(null);
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
	
	public Boolean aggiorna(AsClien00f o){
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
	
	public AsClien00f getDaClccli(BigDecimal clccli){
		AsClien00f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsClien00f.findByClccli");
				query.setParameter("clccli", clccli);
				o = (AsClien00f)query.getSingleResult();
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
	public List<AsClien00f> getAggiornatiDopo(BigDecimal cluins, BigDecimal clhins){
		List<AsClien00f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsClien00f.findAggiornatiDopo");
				query.setParameter("cluins", cluins);
				query.setParameter("clhins", clhins);
				o = (List<AsClien00f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Integer aggiornaCampiMancanti(){
		Integer o = null;
		try{
			try{
				utx.begin();
				String sql = "update $$libfca.clien00f set CLCGRU = '1', CLCMA1 = '6', CLCCTO = '01', CLFAPA = 'A', CLTPEC = 'P', CLFACF = 'A', CLFRBO = '*',  CLIFID = 0, CLAUPD = year(curdate()), CLMUPD = month(curdate()), CLMGI1 = 810, CLMGF1 = 824, CLMGS1 = 825, CLFLIC = 4, CLFI11 = 'N', CLFILP = 'N', CLFGPA = '*', CLCCIM = 'C1', CLCPIA = concat('C ', digits(clccli)), CLCISO = 'IT', CLCPRV = case when clcnaz <> 'IT' then 'EE' else CLCPRV end where clcgru = ' '";
				Query query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				
				sql = "update $$libfca.clien00f set cldalt = left(cldrso, 25) where cldalt = ' '";
				query = em.createNativeQuery(sql);
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
