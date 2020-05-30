package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsNativeQueryDao;
import it.cascino.oasi.dbas.model.AsMovtr0f;
import it.cascino.oasi.utils.Resources;

public class AsNativeQueryDaoMng implements AsNativeQueryDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsNativeQueryDaoMng.class);
		
	// in trasferimento verso deposito in Arrivo
	public BigDecimal getDaMovtr0f_MtquaDaMtcodAndMtdpa(String mtcod, Integer mtdpa){
		BigDecimal o = null;
		try{
			try{
				utx.begin();
				String sql = "SELECT sum(a.mtqua) FROM Movtr0f a WHERE a.mtcod = :mtcod and a.mtsta = ' ' and a.mtdpa = :mtdpa and a.mtdat > :mtdat";
				Query query = em.createNativeQuery(sql);
				query.setParameter("mtcod", mtcod);
				query.setParameter("mtdpa", mtdpa);
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
				LocalDateTime dateTime = LocalDateTime.now();
				dateTime = dateTime.minusMonths(6);	// 6 mesi
				query.setParameter("mtdat", dateTime.format(formatter));
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
	
	// in trasferimento da deposito in Partenza
	public BigDecimal getDaMovtr0f_MtquaDaMtcodAndMtdpp(String mtcod, Integer mtdpp){
		BigDecimal o = null;
		try{
			try{
				utx.begin();
				String sql = "SELECT sum(a.mtqua) FROM Movtr0f a WHERE a.mtcod = :mtcod and a.mtsta = ' '  and a.mtdpp = :mtdpp and a.mtdat > :mtdat";
				Query query = em.createNativeQuery(sql);
				query.setParameter("mtcod", mtcod);
				query.setParameter("mtdpp", mtdpp);
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
				LocalDateTime dateTime = LocalDateTime.now();
				dateTime = dateTime.minusDays(7); // 7 giorni;
				query.setParameter("mtdat", dateTime.format(formatter));
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
	
	public Timestamp getDaSysdummy1_TimestampAs400(){
		Timestamp o = null;
		try{
			try{
				utx.begin();
				String sql = "select a.ts from (select current timestamp ts from sysibm.sysdummy1) a";
				Query query = em.createNativeQuery(sql);
				o = (Timestamp)query.getSingleResult();
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
	public List<Object[]> getArdepArren(String articolo, String depIngrosso){
		List<Object[]> o = null;
		try{
			try{
				utx.begin();
				String sql = "select case when gia.dcoda is not null then gia.dcoda else sco.arcod end art, case when gia.dcode is not null then gia.dcode else sco.ardep end dep, gia.dgiac, gia.dgdif, sco.arsmi, sco.arsmx from ardep0f gia full join arren0f sco on gia.dcoda = sco.arcod and gia.dcode = sco.ardep where gia.dcoda = :articolo and gia.dcode in (" + depIngrosso + ")";
				Query query = em.createNativeQuery(sql);
				query.setParameter("articolo", articolo);
				o = (List<Object[]>)query.getResultList();
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
//	public List<Object[]> getMovtrDaIngrossoAexpert(zzz){
//		List<Object[]> o = null;
//		try{
//			try{
//				utx.begin();
//				String sql = "select case when gia.dcoda is not null then gia.dcoda else sco.arcod end art, case when gia.dcode is not null then gia.dcode else sco.ardep end dep, gia.dgiac, gia.dgdif, sco.arsmi, sco.arsmx from ardep0f gia full join arren0f sco on gia.dcoda = sco.arcod and gia.dcode = sco.ardep where gia.dcoda = :articolo";
//				Query query = em.createNativeQuery(sql);
//				query.setParameter("articolo", articolo);
//				o = (List<Object[]>)query.getResultList();
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
	public List<AsMovtr0f> getMovtrDaIngrossoAexpert(String depIngrosso, String depExpert, Integer data, Integer ora){
		List<AsMovtr0f> o = null;
		try{
			try{
				utx.begin();
				String sql = "select mtdat, mtnuz, mtnum, mtnur, mtcod, mtqua, mtqri, mtdpp, mtdpa, mtime, mtute, mtutr, mtsta, mtdar, mtimr, mtumi from movtr0f where mtdpp in (" + depIngrosso + ") and mtdpa in (" + depExpert + ") and (mtdat > :mtdat or (mtdat = :mtdat and mtime >= :mtime)) and mtutr = 'OA' order by mtdat, mtnuz, mtnum, mtnur";
				Query query = em.createNativeQuery(sql, AsMovtr0f.class);
				query.setParameter("mtdat", data);
				query.setParameter("mtime", ora);
				o = (List<AsMovtr0f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean getSeGiagenteNeiDepositi(String dcoda, String dep){
		Boolean o = null;
		try{
			try{
				utx.begin();
				String sql = "select count(*) from ardep0f a where dcoda = :dcoda and dcode in (" + dep + ") and dgiac != 0";
				Query query = em.createNativeQuery(sql);
				query.setParameter("dcoda", dcoda);
				o = (((Integer)query.getSingleResult()) == 0 ? false : true);
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
	public List<Object[]> getStoricoMovimenti(){
		List<Object[]> o = null;
		try{
			try{
				utx.begin();
				String sql = "select vdatr, vtime, vcaus, vnura, vnumd, vprog, vndep, vcoda, vquan, vprez, vsco1, vsco2, vsco3, vcost, vciva, vcocf from movma0f where vndep in (2, 5, 6, 8, 9) and vdatr >= 20180822 and vdatr <= 20180822 and left(vcaus, 1) in ('B', 'G', 'D', 'M', 'E') and vcaus != 'B99' order by vdatr, vcaus, vnura, vnumd, vprog";
				// String sql = "select vdatr, vtime, vcaus, vnura, vnumd, vprog, vndep, vcoda, vquan, vprez, vsco1, vsco2, vsco3, vcost, vciva, vcocf from movma0f where vndep in (2, 5, 6, 8, 9) and vdatr >= 20190101 and vdatr <= 20190414 and left(vcaus, 1) in ('E') and vcaus != 'B99' order by vdatr, vcaus, vnura, vnumd, vprog";
				Query query = em.createNativeQuery(sql);
				o = (List<Object[]>)query.getResultList();
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
	public List<Object[]> getChiusuraCassaSede(Integer mcdac){
		List<Object[]> o = null;
		try{
			try{
				utx.begin();
				String sql = "select (mcscc + mcrtc) cassa, (mcscp - mcrtc) pos from mocac0f where mcnuc = 101 and mcdac = :mcdac";
				Query query = em.createNativeQuery(sql);
				query.setParameter("mcdac", mcdac);
				o = (List<Object[]>)query.getResultList();
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
