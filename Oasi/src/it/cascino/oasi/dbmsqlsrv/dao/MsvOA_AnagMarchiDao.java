package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagMarchi;

public interface MsvOA_AnagMarchiDao{
	List<MsvOA_AnagMarchi> getAll();
	
//	void salva(MsvOA_AnagMarchi o);
	
//	void aggiorna(MsvOA_AnagMarchi o);
	
//	void elimina(MsvOA_AnagMarchi o);
	
	MsvOA_AnagMarchi getDaMchCodice(String mchCodice);

	MsvOA_AnagMarchi getDaCodiceCascino(String codiceCascino);

//	void svuotaTabella();
	
	void close();
}
