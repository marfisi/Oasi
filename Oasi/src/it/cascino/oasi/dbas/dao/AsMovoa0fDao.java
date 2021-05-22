package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsMovoa0f;

public interface AsMovoa0fDao{
	List<AsMovoa0f> getAll();
	
	Boolean salva(AsMovoa0f o);
	
	Boolean aggiorna(AsMovoa0f o);
	
	AsMovoa0f getDaId(String vidoa);
	
	void detach(Object entity);
	
	void close();
}
