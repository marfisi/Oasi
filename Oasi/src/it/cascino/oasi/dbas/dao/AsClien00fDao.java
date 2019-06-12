package it.cascino.oasi.dbas.dao;

import java.math.BigDecimal;
import java.util.List;
import it.cascino.oasi.dbas.model.AsClien00f;

public interface AsClien00fDao{
	List<AsClien00f> getAll();
	
	Boolean salva(AsClien00f o);
	
	Boolean aggiorna(AsClien00f o);

	AsClien00f getDaClccli(BigDecimal clccli);
	
	List<AsClien00f> getAggiornatiDopo(BigDecimal cluins, BigDecimal clhins);
	
	Integer aggiornaCampiMancanti();
		
	void close();
}
