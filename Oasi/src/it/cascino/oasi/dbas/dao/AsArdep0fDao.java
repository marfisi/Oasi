package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsArdep0f;

public interface AsArdep0fDao{
	List<AsArdep0f> getAll();
	
	Boolean salva(AsArdep0f o);
	
	Boolean aggiorna(AsArdep0f o);
	
	List<AsArdep0f> getDaDcoda(String dcoda);
	
	List<AsArdep0f> getDaDcode(Integer dcode);
	
	AsArdep0f getDaDcodaAndDcode(String dcoda, Integer dcode);
	
	void detach(Object entity);
	
	void close();
}
