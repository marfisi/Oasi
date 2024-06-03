package it.cascino.oasi.dbas.dao;

import it.cascino.oasi.dbas.model.AsCorri0f;

public interface AsCorri0fDao{
	Boolean salva(AsCorri0f o);
	
	Boolean aggiorna(AsCorri0f o);
	
	AsCorri0f getDaId(Integer codat, Integer codep, String codiva);
		
	void detach(Object entity);
	
	void close();
}
