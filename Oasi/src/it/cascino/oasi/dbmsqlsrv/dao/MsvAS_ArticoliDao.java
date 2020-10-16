package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Articoli;

public interface MsvAS_ArticoliDao{
	List<MsvAS_Articoli> getAll();
	
	void salva(MsvAS_Articoli o);
	
	void aggiorna(MsvAS_Articoli o);
	
	MsvAS_Articoli getDaCodice(String codArticolo);

	void svuotaTabella();
	
	void detach(Object entity);

	void close();
}
