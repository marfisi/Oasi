package it.cascino.oasi.dbmsqlsrv.dao;

import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Vendite008;

public interface MsvAS_Vendite008Dao{	
	void salva(MsvAS_Vendite008 o);
	
	void detach(Object entity);
	
	void close();
}
