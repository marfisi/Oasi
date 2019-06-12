package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Listini;

public interface MsvAS_ListiniDao{
	List<MsvAS_Listini> getAll();
	
	void salva(MsvAS_Listini a);
	
	void aggiorna(MsvAS_Listini a);
	
//	void elimina(MsvAS_Listini a);
	
	MsvAS_Listini getDaCodiceTipo(String codArticolo, String tipoListino);

	void svuotaTabella();
	
	void close();
}
