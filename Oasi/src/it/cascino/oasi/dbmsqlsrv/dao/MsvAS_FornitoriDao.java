package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Fornitori;

public interface MsvAS_FornitoriDao{
	List<MsvAS_Fornitori> getAll();
	
	void salva(MsvAS_Fornitori o);
	
	void aggiorna(MsvAS_Fornitori o);
	
	MsvAS_Fornitori getDaCodice(String codice);
	
	void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
