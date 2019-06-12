package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Giacenze;

public interface MsvAS_GiacenzeDao{
	List<MsvAS_Giacenze> getAll();
	
	void salva(MsvAS_Giacenze a);
	
	void aggiorna(MsvAS_Giacenze a);
	
//	void elimina(MsvAS_Giacenze a);
	
	MsvAS_Giacenze getDaCodArticoloCodDeposito(String codArticolo, String codDeposito);

	void svuotaTabella();
	
	void close();
}
