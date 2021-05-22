package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_CarichiRighe;

public interface MsvOA_CarichiRigheDao{
	List<MsvOA_CarichiRighe> getAll();
	
	void aggiorna(MsvOA_CarichiRighe o);
	
	List<MsvOA_CarichiRighe> getDaIdUnivocoTes(String idUnivocoTes);
	
	List<MsvOA_CarichiRighe> getDaIdUnivocoTesElaborate(String idUnivocoTes);
	
	List<MsvOA_CarichiRighe> getDaIdUnivocoTesNonElaborate(String idUnivocoTes);
	
	MsvOA_CarichiRighe getDaIdUnivocoTesIdUnivocoRiga(String idUnivocoTes, String idUnivocoRiga);
	
	void detach(Object entity);
	
	void close();
}
