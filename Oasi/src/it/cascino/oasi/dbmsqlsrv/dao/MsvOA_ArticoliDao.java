package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Articoli;

public interface MsvOA_ArticoliDao{
	List<MsvOA_Articoli> getAll();
	
	void aggiorna(MsvOA_Articoli o);
	
	void elimina(MsvOA_Articoli o);
	
	MsvOA_Articoli getDaCodBreveOasi(String codBreveOasi);
	
	MsvOA_Articoli getDaCodArticoloCascino(String codArticoloCascino);
	
	// void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
