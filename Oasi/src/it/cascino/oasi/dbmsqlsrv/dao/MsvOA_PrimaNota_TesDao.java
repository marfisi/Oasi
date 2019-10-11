package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Tes;

public interface MsvOA_PrimaNota_TesDao{
	List<MsvOA_PrimaNota_Tes> getAll();
	
//	void salva(MsvOA_PrimaNota_Tes o);
	
	void aggiorna(MsvOA_PrimaNota_Tes o);
	
//	void elimina(MsvOA_PrimaNota_Tes o);
	
	MsvOA_PrimaNota_Tes getDaNReg(String nReg);

	List<MsvOA_PrimaNota_Tes> getDaRegIva(String regIva);

	List<MsvOA_PrimaNota_Tes> getDaCausale(String causale);
	
	List<MsvOA_PrimaNota_Tes> getDaCausali(String causali);

	//	void svuotaTabella();
	
	void close();
}
