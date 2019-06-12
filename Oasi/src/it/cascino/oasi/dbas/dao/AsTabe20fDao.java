package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsTabe20f;

public interface AsTabe20fDao{
	List<AsTabe20f> getAllDaTbnot(String tbnot);
	
	Boolean salva(AsTabe20f o);
	
	Boolean aggiorna(AsTabe20f o);

	AsTabe20f getDaTbnotTbele(String tbnot, String tbele);

	void close();
}
