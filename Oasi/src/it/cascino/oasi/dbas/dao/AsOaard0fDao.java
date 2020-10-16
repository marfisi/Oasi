package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsOaard0f;

public interface AsOaard0fDao{
	List<AsOaard0f> getAll();
	
	Boolean aggiorna(AsOaard0f o);
	
	List<AsOaard0f> getDaDcoda(String dcoda);

	List<AsOaard0f> getDaDcode(Integer dcode);

	AsOaard0f getDaDcodaDcode(String dcoda, Integer dcode);
	
	List<AsOaard0f> getDaElaborare();
	
	void svuotaTabella();
	
	void detach(Object entity);

	void close();
}
