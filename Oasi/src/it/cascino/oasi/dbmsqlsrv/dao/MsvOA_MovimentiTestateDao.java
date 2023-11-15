package it.cascino.oasi.dbmsqlsrv.dao;

import java.sql.Timestamp;
import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_MovimentiTestate;

public interface MsvOA_MovimentiTestateDao{
	List<MsvOA_MovimentiTestate> getAll();
	
	void aggiorna(MsvOA_MovimentiTestate o);
	
	List<MsvOA_MovimentiTestate> getFatture(String causali);
	
	List<MsvOA_MovimentiTestate> getDaIdUnivocoTes(String idUnivocoTes);
	
	MsvOA_MovimentiTestate getDaIdPntNReg(String idPntNReg);
	
	List<MsvOA_MovimentiTestate> getTestateConRigheAggiornate();

	List<MsvOA_MovimentiTestate> getAssistenzeInterne();
	
	Timestamp getMaxDataReg();
	
	void detach(Object entity);
	
	void close();
}
