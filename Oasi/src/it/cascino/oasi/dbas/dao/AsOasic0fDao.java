package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsOasic0f;

public interface AsOasic0fDao{
	List<AsOasic0f> getAll();
	
	Boolean aggiorna(AsOasic0f o);
	
	List<AsOasic0f> getCmdToDo();
	
	AsOasic0f getDaOaidtr(Integer oaidtr);
	
	String updateRis(AsOasic0f cmd);
	
	void detach(Object entity);
	
	void close();
}
