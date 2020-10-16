package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagMarchi;

public interface MsvOA_AnagMarchiDao{
	List<MsvOA_AnagMarchi> getAll();
	
	MsvOA_AnagMarchi getDaMchCodice(String mchCodice);
	
	MsvOA_AnagMarchi getDaCodiceCascino(String codiceCascino);
	
	// void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
