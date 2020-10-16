package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Listini;

public interface MsvAS_ListiniDao{
	List<MsvAS_Listini> getAll();
	
	void salva(MsvAS_Listini o);
	
	void aggiorna(MsvAS_Listini o);
	
	MsvAS_Listini getDaCodiceTipo(String codArticolo, String tipoListino);
	
	void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
