package it.cascino.oasi.dbas.dao;

import it.cascino.oasi.dbas.model.AsFinaz0f;

public interface AsFinaz0fDao{
//	List<AsFinaz0f> getAll();
	
	Boolean salva(AsFinaz0f o);
	
	Boolean aggiorna(AsFinaz0f o);
	
//	void elimina(AsFinaz0f o);
	
	AsFinaz0f getDaId(Integer fndat, Integer fnnum);
	
	void close();
}
