package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagLivelli;

public interface MsvOA_AnagLivelliDao{
	List<MsvOA_AnagLivelli> getAll();
	
	MsvOA_AnagLivelli getDaLvmCodice(String lvmCodice);
	
	MsvOA_AnagLivelli getDaCodiceCascino(String codiceCascino);
	
	// void svuotaTabella();
	
	public void detach(Object entity);
	
	void close();
}
