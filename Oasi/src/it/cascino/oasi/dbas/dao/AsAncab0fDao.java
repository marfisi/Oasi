package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsAncab0f;

public interface AsAncab0fDao{
	List<AsAncab0f> getAll();
	
	List<AsAncab0f> getDaCcoda(String ccoda);
	
	AsAncab0f getDaCcodb(String ccodb);
	
	void detach(Object entity);
	
	void close();
}
