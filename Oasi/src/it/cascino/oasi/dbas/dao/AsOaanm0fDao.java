package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsOaanm0f;

public interface AsOaanm0fDao{
	List<AsOaanm0f> getAll();
	
	Boolean aggiorna(AsOaanm0f o);
	
	AsOaanm0f getDaMcoda(String mcoda);
	
	List<String> getDaElaborare();
	
	void svuotaTabella();
	
	void eliminaArticoliAnomali();
	
	void detach(Object entity);
	
	void close();
}
