package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Clienti;

public interface MsvOA_ClientiDao{
	List<MsvOA_Clienti> getAll();
	
	void aggiorna(MsvOA_Clienti o);
	
	// void elimina(MsvOA_Clienti o);
	
	MsvOA_Clienti getDaCodice(String codice);
	
	// void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
