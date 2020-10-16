package it.cascino.oasi.dbas.dao;

import java.math.BigDecimal;
import java.util.List;
import it.cascino.oasi.dbas.model.AsBofor0f;

public interface AsBofor0fDao{
	List<AsBofor0f> getAll();
	
	Boolean salva(AsBofor0f o);
	
	Boolean aggiorna(AsBofor0f o);
	
	AsBofor0f getDaId(Integer bfdat, Integer bfnuz, Integer bfnum);
	
	List<AsBofor0f> getDaBfdatBfcofBfido(Integer bfdat, BigDecimal bfcof, String bfido);
	
	void detach(Object entity);
	
	void close();
}
