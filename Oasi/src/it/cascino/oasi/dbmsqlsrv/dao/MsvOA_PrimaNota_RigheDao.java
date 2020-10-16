package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Righe;

public interface MsvOA_PrimaNota_RigheDao{
	List<MsvOA_PrimaNota_Righe> getAll();
	
	void aggiorna(MsvOA_PrimaNota_Righe o);
	
	List<MsvOA_PrimaNota_Righe> getDaNReg(String nReg);
	
	List<MsvOA_PrimaNota_Righe> getDaNRegElaborate(String nReg);
	
	MsvOA_PrimaNota_Righe getDaId(String nReg, String nRiga);
	
	void detach(Object entity);
	
	void close();
}
