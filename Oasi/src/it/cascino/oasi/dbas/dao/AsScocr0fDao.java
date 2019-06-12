package it.cascino.oasi.dbas.dao;

import it.cascino.oasi.dbas.model.AsScocr0f;

public interface AsScocr0fDao{
//	List<AsScocr0f> getAll();
	
	Boolean salva(AsScocr0f o);
	
	Boolean aggiorna(AsScocr0f o);
	
//	void elimina(AsScocr0f o);
	
	AsScocr0f getDaId(Integer scdat, Integer scnuz, Integer scnum);
	
	void close();
}
