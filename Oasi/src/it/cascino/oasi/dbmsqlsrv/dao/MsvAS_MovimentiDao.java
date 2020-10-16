package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Movimenti;

public interface MsvAS_MovimentiDao{
	List<MsvAS_Movimenti> getAll();
	
	void salva(MsvAS_Movimenti o);
	
	void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
