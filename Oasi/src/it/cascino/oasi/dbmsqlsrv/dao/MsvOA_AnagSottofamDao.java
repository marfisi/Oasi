package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagSottofam;

public interface MsvOA_AnagSottofamDao{
	List<MsvOA_AnagSottofam> getAll();
	
	MsvOA_AnagSottofam getDaSotCodice(String sotCodice);
	
	List<MsvOA_AnagSottofam> getDaSotFamiglia(String sotFamiglia);
	
	// void svuotaTabella();
	
	void detach(Object entity);
	
	void close();
}
