package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsOasic0f;

public interface AsOasic0fDao{
	List<AsOasic0f> getAll();
	
//	Boolean salva(AsOasic0f c);
	
	Boolean aggiorna(AsOasic0f c);
	
//	void elimina(AsOasic0f c);
//
////	List<AsOasic0f> getCmdByLycass(String lycass);
//
	List<AsOasic0f> getCmdToDo();
	
	AsOasic0f getDaOaidtr(Integer oaidtr);

	String updateRis(AsOasic0f cmd);
	
	void close();
}
