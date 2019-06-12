package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Iva;

public interface MsvOA_PrimaNota_IvaDao{
	List<MsvOA_PrimaNota_Iva> getAll();
	
//	void salva(MsvOA_PrimaNota_Iva o);
	
	void aggiorna(MsvOA_PrimaNota_Iva o);
	
//	void elimina(MsvOA_PrimaNota_Iva o);
	
	List<MsvOA_PrimaNota_Iva> getDaNReg(String nReg);

	MsvOA_PrimaNota_Iva getDaId(String nReg, String nRiga);

//	void svuotaTabella();
	
	void close();
}
