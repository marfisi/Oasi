package it.cascino.oasi.dbas.dao;

import it.cascino.oasi.dbas.model.AsFinaz0f;

public interface AsFinaz0fDao{
	Boolean salva(AsFinaz0f o);
	
	Boolean aggiorna(AsFinaz0f o);
	
	AsFinaz0f getDaId(Integer fndat, Integer fnnum);

	AsFinaz0f getDaFndatFncfiFnnup(Integer fndat, String fncfi, String fnnup);

	void detach(Object entity);
	
	void close();
}
