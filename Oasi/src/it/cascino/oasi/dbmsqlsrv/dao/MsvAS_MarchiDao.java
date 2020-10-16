package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Marchi;

public interface MsvAS_MarchiDao{
	List<MsvAS_Marchi> getAll();
	
	void salva(MsvAS_Marchi o);
	
	void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
