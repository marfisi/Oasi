package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsAafor0f;

public interface AsAafor0fDao{
	List<AsAafor0f> getAll();
	
//	void salva(AsAafor0f a);
//	
//	void aggiorna(AsAafor0f a);
//	
//	void elimina(AsAafor0f a);

	AsAafor0f getArticoloDaAaforAacoa(Integer aafor, String aacoa);

	void close();
}
