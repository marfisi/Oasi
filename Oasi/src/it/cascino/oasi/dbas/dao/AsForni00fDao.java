package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsForni00f;

public interface AsForni00fDao{
	List<AsForni00f> getAll();

	AsForni00f getDaFocfor(Integer focfor);
	
	List<AsForni00f> getAggiornatiDopo(Integer fouins, Integer fohins);
		
	void close();
}
