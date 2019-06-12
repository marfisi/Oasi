package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Fornitori;

public interface MsvAS_FornitoriDao{
	List<MsvAS_Fornitori> getAll();
	
	void salva(MsvAS_Fornitori a);
	
	void aggiorna(MsvAS_Fornitori a);
//	
//	void elimina(MsvAS_Fornitori a);
	
	MsvAS_Fornitori getDaCodice(String codice);

	void svuotaTabella();
	
	void close();
}
