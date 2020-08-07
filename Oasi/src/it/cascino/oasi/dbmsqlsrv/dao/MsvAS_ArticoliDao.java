package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Articoli;

public interface MsvAS_ArticoliDao{
	List<MsvAS_Articoli> getAll();
	
	void salva(MsvAS_Articoli a);
	
	void aggiorna(MsvAS_Articoli a);
	
//	void elimina(MsvAS_Articoli a);
	
	MsvAS_Articoli getDaCodice(String codArticolo);

	void svuotaTabella();
	
	void detach(Object entity);

	void close();
}
