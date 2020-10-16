package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_AlberoMerc;

public interface MsvAS_AlberoMercDao{
	List<MsvAS_AlberoMerc> getAll();
	
	void salva(MsvAS_AlberoMerc o);
	
	void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
