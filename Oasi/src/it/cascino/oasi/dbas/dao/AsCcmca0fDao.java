package it.cascino.oasi.dbas.dao;

import java.math.BigDecimal;
import java.util.List;
import it.cascino.oasi.dbas.model.AsCcmca0f;

public interface AsCcmca0fDao{
//	List<AsCcmca0f> getAll();
	
	Boolean salva(AsCcmca0f o);
	
	Boolean aggiorna(AsCcmca0f o);
	
	void elimina(AsCcmca0f o);
	
	AsCcmca0f getDaId(Integer cadar, Integer canum, Integer carig);

	BigDecimal getUltimoCanum(Integer cadar);
	
//	Integer delByCadarCanup(Integer cadar, String canup);
	
	List<AsCcmca0f> getDaCadarCanup(Integer cadar, String canup);

	void close();
}
