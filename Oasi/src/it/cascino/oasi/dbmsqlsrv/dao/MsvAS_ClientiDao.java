package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Clienti;

public interface MsvAS_ClientiDao{
	List<MsvAS_Clienti> getAll();
	
	void salva(MsvAS_Clienti o);
	
	void aggiorna(MsvAS_Clienti o);
	
	MsvAS_Clienti getDaCodice(String codice);
	
	void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
