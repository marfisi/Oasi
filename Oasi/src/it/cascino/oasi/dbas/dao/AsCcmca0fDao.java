package it.cascino.oasi.dbas.dao;

import java.math.BigDecimal;
import it.cascino.oasi.dbas.model.AsCcmca0f;

public interface AsCcmca0fDao{
//	List<AsCcmca0f> getAll();
	
	Boolean salva(AsCcmca0f o);
	
	Boolean aggiorna(AsCcmca0f o);
	
//	void elimina(AsCcmca0f o);
	
	AsCcmca0f getDaId(Integer cadar, Integer canum, Integer carig);

	BigDecimal getUltimoCanum(Integer cadar);

	void close();
}
