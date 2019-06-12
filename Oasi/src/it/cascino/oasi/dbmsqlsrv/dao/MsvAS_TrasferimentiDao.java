package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Trasferimenti;

public interface MsvAS_TrasferimentiDao{
	List<MsvAS_Trasferimenti> getAll();
	
	void salva(MsvAS_Trasferimenti o);
	
//	void aggiorna(MsvAS_Trasferimenti o);
//	
//	void elimina(MsvAS_Trasferimenti o);

	void svuotaTabella();
	
	void close();
}
