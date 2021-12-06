package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagCausCont;

public interface MsvOA_AnagCausContDao{
	List<MsvOA_AnagCausCont> getAll();
	
	MsvOA_AnagCausCont getDaCatCodice(String catCodice);
	
	// void svuotaTabella();
	
	public void detach(Object entity);
	
	void close();
}
