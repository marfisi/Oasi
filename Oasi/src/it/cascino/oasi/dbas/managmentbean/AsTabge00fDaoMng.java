package it.cascino.oasi.dbas.managmentbean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import it.cascino.oasi.dbas.dao.AsTabge00fDao;
import it.cascino.oasi.dbas.model.AsTabge00f;
import it.cascino.oasi.utils.Resources;

public class AsTabge00fDaoMng implements AsTabge00fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();
	
	Logger log = Logger.getLogger(AsTabge00fDaoMng.class);
	
	@SuppressWarnings(
		"unchecked"
	)
	public List<AsTabge00f> getAll(){
		List<AsTabge00f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsTabge00f.findAll");
				o = (List<AsTabge00f>)query.getResultList();
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
	public List<AsTabge00f> getDaTachia(String tachia){
		List<AsTabge00f> o = null;
		try{
			try{
				Query query = em.createNamedQuery("AsTabge00f.findByTachia");
				query.setParameter("tachia", tachia);
				o = (List<AsTabge00f>)query.getResultList();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Boolean getSeAgenteIngrosso(String codAgente){
		Boolean o = null;
		try{
			try{
				String sql = "select count(*) from $$libfca.tabge00f a where substr(a.tachia, 1, 2)='AG' and substr(a.tachia, 14, 2) = :codagente and substr(a.tadati, 99, 2) <> 'SM'";
				Query query = em.createNativeQuery(sql);
				query.setParameter("codagente", codAgente);
				o = (((Integer)query.getSingleResult()) == 0 ? false : true);
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public String getPec(String codCoF, String cof){
		String o = null;
		try{
			try{
				String sql = "select indirizzo_e_mail from $$libfca.rubri00f where tp_cli_for_potenz = :cof and titolo = 'PEC' and cod_cli_for_potenz = :codcof limit 1";
				Query query = em.createNativeQuery(sql);
				query.setParameter("codcof", codCoF);
				query.setParameter("cof", cof);
				o = (String)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public Integer salvaPec(String codCoF, String cof, String pec){
		Integer o = null;
		try{
			try{
				utx.begin();
				String sql = "insert into $$libfca.rubri00f(tp_cli_for_potenz,  cod_cli_for_potenz, titolo, indirizzo_e_mail) values(:cof, :codcof, 'PEC', :pec)";
				Query query = em.createNativeQuery(sql);
				query.setParameter("codcof", codCoF);
				query.setParameter("cof", cof);
				query.setParameter("pec", pec);
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
	
	public Integer aggiornaPec(String codCoF, String cof, String pec){
		Integer o = null;
		try{
			try{
				utx.begin();
				String sql = "update $$libfca.rubri00f set indirizzo_e_mail = :pec where tp_cli_for_potenz = :cof and titolo = 'PEC' and cod_cli_for_potenz = :codcof";
				Query query = em.createNativeQuery(sql);
				query.setParameter("codcof", codCoF);
				query.setParameter("cof", cof);
				query.setParameter("pec", pec);
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
	
	public String getSpedizione(String codSped){
		String o = null;
		try{
			try{
				String sql = "select tadati from $$libfca.tabge00f a where substr(a.tachia, 1, 2)='PO' and substr(a.tachia, 15, 1) = :codsped";
				Query query = em.createNativeQuery(sql);
				query.setParameter("codsped", codSped);
				o = (String)query.getSingleResult();
			}catch(NoResultException e){
				o = null;
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return o;
	}
	
	public String getAliquotaIva(String codiva){
		String o = null;
		try{
			try{
				String sql = "select substr(tadati, 26, 4) from $$libfca.tabge00f o where substr(o.tachia, 1, 2) = 'IV' and substr(o.tachia, 14, 2) = :codiva";
				Query query = em.createNativeQuery(sql);
				query.setParameter("codiva", codiva);
				o = (String)query.getSingleResult();
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
