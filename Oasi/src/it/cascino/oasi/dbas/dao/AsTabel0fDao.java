package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsTabel0f;

public interface AsTabel0fDao{
	List<AsTabel0f> getAllDaTnota(String tnota);
	
	Boolean aggiorna(AsTabel0f o);
	
	AsTabel0f getDaTnotaTcoel(String tnota, String tcoel);
	
	AsTabel0f getDaTnotaTcom2(String tnota, String tcom2);
	
	void detach(Object entity);
	
	void close();
}
