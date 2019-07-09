package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsAnmag0fDao;
import it.cascino.oasi.dbas.model.AsAnmag0f;
import it.cascino.oasi.utils.Resources;

public class AsAnmag0fDaoMng implements AsAnmag0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsAnmag0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsAnmag0f> getAll(){
		List<AsAnmag0f> o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsAnmag0f.findAll");
				o = (List<AsAnmag0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean salva(AsAnmag0f o){
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
	
	public Boolean aggiorna(AsAnmag0f o){
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
	
//	public void elimina(AsAnmag0f oElimina){
//		// log.info("tmpDEBUGtmp: " + "> " + "elimina(" + produttoreElimina + ")");
//		try{
//			try{
//				utx.begin();
//				AsAnmag0f a = em.find(AsAnmag0f.class, oElimina.getMcoda());
//				log.info("elimina: " + o.toString());
//				em.remove(o);
//			}finally{
//				utx.commit();
//			}
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//	}
	
	public AsAnmag0f getArticoloDaMcoda(String mcoda){
		AsAnmag0f o = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsAnmag0f.findByMcoda");
				query.setParameter("mcoda", mcoda);
				o = (AsAnmag0f)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
//	@SuppressWarnings("unchecked")
//	public List<AsAnmag0f> getArticoliIngrosso(){
//		List<AsAnmag0f> o = null;
//		try{
//			try{
//				utx.begin();
//				Query query = em.createNamedQuery("AsAnmag0f.findAllIngrosso");
//				o = (List<AsAnmag0f>)query.getResultList();
//			}catch(NoResultException e){
//				o = null;
//			}
//			utx.commit();
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//		return o;
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<AsAnmag0f> getArticoliAttivi(){
//		List<AsAnmag0f> o = null;
//		try{
//			try{
//				utx.begin();
//				Query query = em.createNamedQuery("AsAnmag0f.findAttivi");
//				o = (List<AsAnmag0f>)query.getResultList();
//			}catch(NoResultException e){
//				o = null;
//			}
//			utx.commit();
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//		return o;
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<AsAnmag0f> getArticoliAnnulatiMaMovimentatiDal(String dataPartenza){
//		List<AsAnmag0f> o = null;
//		try{
//			try{
//				utx.begin();
////				String sql1 = "select * from ((select * from anmag0f where atama = (' ')) union (select * from anmag0f where atama = ('A') and mcoda in (select vcoda from movma0f where vdatr >= 20160101)) except (select * from anmag0f where mcoda in (select dcoda from (select dcoda, sum(dgiac) gia from ardep0f where dcode in (2, 5, 6, 8, 9) group by dcoda) gicenz where gia = 0 and dcoda not in (select vcoda from movma0f where vdatr >= 20160101 and vndep in (2, 5, 6, 8, 9))))) t1";
////				String sql2 = "select * from ((select * from anmag0f where atama = (' ')) union (select * from anmag0f where atama = ('A') and mcoda in (select vcoda from movma0f where vdatr >= 20160101)) ) t1";
////				String sql3 = "select atama, mcoda, mdesc, mumis, mpeu1, msc11, mconf, mdepi, madiv, magru, masot, mafam, mastf, mast1, march, model, mcofo, mcoaf, mciva from ((select * from anmag0f where atama = (' ')) union (select * from anmag0f where atama = ('A') and mcoda in (select vcoda from movma0f where vdatr >= :datapart)) ) t1";
////				String sql4 = "select * from ((select * from anmag0f where atama = (' ')) union (select * from anmag0f where atama = ('A') and mcoda in (select vcoda from movma0f where vdatr >= :datapart)) ) t1";
////				String sql5 = "select atama, mcoda, mdesc, mumis, mpeu1, 	msc11, mconf, mdepi, madiv, magru, masot, mafam, mastf, mast1, march, model, mcofo, mcoaf, mciva from ((select * from anmag0f where atama = (' ')) union (select * from anmag0f where atama = ('A') and mcoda in (select vcoda from movma0f where vdatr >= :datapart)) ) t1";
////				String sql6 = "select * from anmag0f a where atama = (' ')";
//				String sql = "select * from anmag0f where atama = ('A') and mcoda in (select vcoda from movma0f where vdatr >= :datapart)";
//				Query query = em.createNativeQuery(sql, AsAnmag0f.class);
//				query.setParameter("datapart", dataPartenza);
//				o = (List<AsAnmag0f>)query.getResultList();
//			}catch(NoResultException e){
//				o = null;
//			}
//			utx.commit();
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//		return o;
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<AsAnmag0f> getArticoliDaNonPassare(String dataPartenza, String depositi){
//		List<AsAnmag0f> o = null;
//		try{
//			try{
//				utx.begin();
//				String sql = "select * from anmag0f where atama in (' ', 'A') except (select * from anmag0f where atama in (' ', 'A') and mdepi in (1, 3)) except (select * from anmag0f where mcoda in (select dcoda from ardep0f where mdepi in (1, 3) and dcode in (" + depositi + ") and dgiac <> 0)) except (select * from anmag0f where mcoda in (select mtcod from movtr0f where mtdpa in (" + depositi + ") and mtutr = 'OA'))";
//				Query query = em.createNativeQuery(sql, AsAnmag0f.class);
////				query.setParameter("datapart", dataPartenza);
//				o = (List<AsAnmag0f>)query.getResultList();
//			}catch(NoResultException e){
//				o = null;
//			}
//			utx.commit();
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//		return o;
//	}
//	
//	public AsAnmag0f getArticoloDaNonPassare(String codArticolo, String dataPartenza, String depositi){
//		AsAnmag0f o = null;
//		try{
//			try{
//				utx.begin();
//				String sql = "select * from anmag0f where atama in (' ', 'A') and mcoda = :codArticolo except (select * from anmag0f where atama in (' ', 'A') and mdepi in (1, 3)) except (select * from anmag0f where mcoda in (select dcoda from ardep0f where mdepi in (1, 3) and dcode in (" + depositi + ") and dgiac <> 0)) except (select * from anmag0f where mcoda in (select mtcod from movtr0f where mtdpa in (" + depositi + ") and mtutr = 'OA'))";
//				Query query = em.createNativeQuery(sql, AsAnmag0f.class);
//				query.setParameter("codArticolo", codArticolo);
////				query.setParameter("datapart", dataPartenza);
//				o = (AsAnmag0f)query.getSingleResult();
//			}catch(NoResultException e){
//				o = null;
//			}
//			utx.commit();
//		}catch(Exception e){
//			log.fatal(e.toString());
//		}
//		return o;
//	}
	
	@SuppressWarnings("unchecked")
	public List<AsAnmag0f> getArticoliDaAS400aOasi(){
		List<AsAnmag0f> o = null;
		try{
			try{
				utx.begin();
				String sql = "select * from anmag0f where atama in (' ', 'A') and mcoda in (select m2cod from anma20f where m2oas = 'O')";
				Query query = em.createNativeQuery(sql, AsAnmag0f.class);
				o = (List<AsAnmag0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public AsAnmag0f getArticoliDaAS400aOasi(String mcoda){
		AsAnmag0f o = null;
		try{
			try{
				utx.begin();
				String sql = "select * from anmag0f where atama in (' ', 'A') and mcoda = :mcoda and mcoda in (select m2cod from anma20f where m2oas = 'O')";
				Query query = em.createNativeQuery(sql, AsAnmag0f.class);
				query.setParameter("mcoda", mcoda);
				o = (AsAnmag0f)query.getSingleResult();
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
				String sql = "update anmag0f set mgrup=98, msotg=999 where mgrup = 0 and left(mcoda, 2) = 'OA'";
				Query query = em.createNativeQuery(sql);
				o = query.executeUpdate();
				
//				sql = "update anmag0f set ";
//				query = em.createNativeQuery(sql);
//				o = query.executeUpdate();
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
