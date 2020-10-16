package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsAlmer0f;

public interface AsAlmer0fDao{
	List<AsAlmer0f> getAll();
	
	Boolean salva(AsAlmer0f o);
	
	Boolean aggiorna(AsAlmer0f o);
	
	List<AsAlmer0f> getDaAmset(String amset);
	
	AsAlmer0f getDaId(String amset, String amgru, String amsot, String amfam, String amstf, String amst1);
	
	// BigDecimal getRRNDaIdgetDaId(String alb);
	
	void detach(Object entity);
	
	void close();
}
