package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsTabge00f;

public interface AsTabge00fDao{
	List<AsTabge00f> getAll();

	List<AsTabge00f> getDaTachia(String tachia);
	
	// query native, non strettamente legate a tabge00f
	Boolean getSeAgenteIngrosso(String codagente);
	
	String getPec(String codCoF, String cof);
	
	Integer salvaPec(String codCoF, String cof, String pec);
	
	Integer aggiornaPec(String codCoF, String cof, String pec);
	
	String getSpedizione(String codSped);
	
	String getAliquotaIva(String codiva);
	
	void close();
}
