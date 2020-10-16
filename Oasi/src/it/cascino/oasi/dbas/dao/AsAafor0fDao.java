package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsAafor0f;

public interface AsAafor0fDao{
	List<AsAafor0f> getAll();
	
	AsAafor0f getArticoloDaAaforAacoa(Integer aafor, String aacoa);
	
	void detach(Object entity);
	
	void close();
}
