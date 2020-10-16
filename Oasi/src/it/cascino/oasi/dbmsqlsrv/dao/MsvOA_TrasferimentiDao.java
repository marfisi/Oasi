package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Trasferimenti;

public interface MsvOA_TrasferimentiDao{
	List<MsvOA_Trasferimenti> getAll();
	
	void elimina(MsvOA_Trasferimenti o);
	
	void detach(Object entity);
	
	void close();
}
