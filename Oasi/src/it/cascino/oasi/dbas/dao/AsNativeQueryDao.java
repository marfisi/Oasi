package it.cascino.oasi.dbas.dao;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import it.cascino.oasi.dbas.model.AsMovtr0f;

public interface AsNativeQueryDao{
	BigDecimal getDaMovtr0f_MtquaDaMtcodAndMtdpa(String mtcod, Integer mtdpa);
	
	BigDecimal getDaMovtr0f_MtquaDaMtcodAndMtdpp(String mtcod, Integer mtdpp);
	
	Timestamp getDaSysdummy1_TimestampAs400();
	
	List<Object[]> getArdepArren(String articolo, String depIngrosso);
	
	List<AsMovtr0f> getMovtrDaIngrossoAexpert(String depIngrosso, String depExpert, Integer data, Integer ora);
	
	Boolean getSeGiagenteNeiDepositi(String articolo, String dep);
	
	List<Object[]> getStoricoMovimenti();
	
	List<Object[]> getChiusuraCassaSede(Integer mcdac);
	
	void detach(Object entity);
	
	void close();
}
