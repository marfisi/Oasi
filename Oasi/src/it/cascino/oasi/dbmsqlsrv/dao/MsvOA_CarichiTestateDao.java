package it.cascino.oasi.dbmsqlsrv.dao;

import java.sql.Timestamp;
import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_CarichiTestate;

public interface MsvOA_CarichiTestateDao{
	List<MsvOA_CarichiTestate> getAll();
	
	void aggiorna(MsvOA_CarichiTestate o);
	
	List<MsvOA_CarichiTestate> getFatture(String causali);
	
	List<MsvOA_CarichiTestate> getDaIdUnivocoTes(String idUnivocoTes);
	
	MsvOA_CarichiTestate getDaIdPntNReg(String idPntNReg);
	
	List<MsvOA_CarichiTestate> getTestateConRigheAggiornate();
	
	Timestamp getMaxDataReg();
	
	void detach(Object entity);
	
	void close();
}
