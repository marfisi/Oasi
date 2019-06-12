package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_MovimentiTestate;

public interface MsvOA_MovimentiTestateDao{
	List<MsvOA_MovimentiTestate> getAll();
	
//	void salva(MsvOA_MovimentiTestate o);
	
	void aggiorna(MsvOA_MovimentiTestate o);
	
//	void elimina(MsvOA_MovimentiTestate o);

//	void svuotaTabella();
	
	List<MsvOA_MovimentiTestate> getFatture(String causali);
	
	List<MsvOA_MovimentiTestate> getDaIdUnivocoTes(String idUnivocoTes);

	MsvOA_MovimentiTestate getDaIdPntNReg(String idPntNReg);

	void close();
}
