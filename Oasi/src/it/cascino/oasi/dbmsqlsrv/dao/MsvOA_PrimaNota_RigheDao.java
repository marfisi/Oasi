package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Righe;

public interface MsvOA_PrimaNota_RigheDao{
	List<MsvOA_PrimaNota_Righe> getAll();
	
//	void salva(MsvOA_PrimaNota_Righe o);
	
	void aggiorna(MsvOA_PrimaNota_Righe o);
	
//	void elimina(MsvOA_PrimaNota_Righe o);
	
	List<MsvOA_PrimaNota_Righe> getDaNReg(String nReg);

	MsvOA_PrimaNota_Righe getDaId(String nReg, String nRiga);

//	void svuotaTabella();
	
	void close();
}
