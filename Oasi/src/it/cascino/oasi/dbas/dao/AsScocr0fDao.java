package it.cascino.oasi.dbas.dao;

import it.cascino.oasi.dbas.model.AsScocr0f;

public interface AsScocr0fDao{
	Boolean salva(AsScocr0f o);
	
	Boolean aggiorna(AsScocr0f o);
	
	AsScocr0f getDaId(Integer scdat, Integer scnuz, Integer scnum);
	
	AsScocr0f getDaScdatScnusScdep(Integer scdat, Integer scnus, Integer scdep);
	
	void detach(Object entity);
	
	void close();
}
