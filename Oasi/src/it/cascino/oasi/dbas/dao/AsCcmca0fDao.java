package it.cascino.oasi.dbas.dao;

import java.math.BigDecimal;
import java.util.List;
import it.cascino.oasi.dbas.model.AsCcmca0f;

public interface AsCcmca0fDao{
	Boolean salva(AsCcmca0f o);
	
	Boolean aggiorna(AsCcmca0f o);
	
	void elimina(AsCcmca0f o);
	
	AsCcmca0f getDaId(Integer cadar, Integer canum, Integer carig);
	
	BigDecimal getUltimoCanum(Integer cadar);
	
	// Integer delByCadarCanup(Integer cadar, String canup);
	
	// List<AsCcmca0f> getDaCadarCanumCanupCacon(Integer cadar, Integer canum, String canup, String cacon);
	
	List<AsCcmca0f> getDaCadarCanumCanup(Integer cadar, Integer canum, String canup);
	
	void detach(Object entity);
	
	void close();
}
