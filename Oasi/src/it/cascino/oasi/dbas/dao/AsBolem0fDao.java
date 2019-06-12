package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsBolem0f;

public interface AsBolem0fDao{
	List<AsBolem0f> getAll();
	
	Boolean salva(AsBolem0f o);
	
	Boolean aggiorna(AsBolem0f o);

	AsBolem0f getDaId(Integer bdatd, Integer bnura, Integer bnumd);

	void close();
}
