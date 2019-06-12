package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_MovimentiRighe;

public interface MsvOA_MovimentiRigheDao{
	List<MsvOA_MovimentiRighe> getAll();
	
//	void salva(MsvOA_MovimentiRighe o);
	
	void aggiorna(MsvOA_MovimentiRighe o);
	
//	void elimina(MsvOA_MovimentiRighe o);
	
	List<MsvOA_MovimentiRighe> getDaIdUnivocoTes(String idUnivocoTes);
	
	List<MsvOA_MovimentiRighe> getDaIdUnivocoTesElaborate(String idUnivocoTes);
	
	List<MsvOA_MovimentiRighe> getDaIdUnivocoTesNonElaborate(String idUnivocoTes);

	MsvOA_MovimentiRighe getDaIdUnivocoTesIdUnivocoRiga(String idUnivocoTes, String idUnivocoRiga);

//	void svuotaTabella();
	
	void close();
}
