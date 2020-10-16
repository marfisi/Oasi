package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Giacenze;

public interface MsvAS_GiacenzeDao{
	List<MsvAS_Giacenze> getAll();
	
	void salva(MsvAS_Giacenze o);
	
	void aggiorna(MsvAS_Giacenze o);
	
	MsvAS_Giacenze getDaCodArticoloCodDeposito(String codArticolo, String codDeposito);
	
	void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
