package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsArren0f;

public interface AsArren0fDao{
	List<AsArren0f> getAll();
	
	List<AsArren0f> getDaArcod(String arcod);

	List<AsArren0f> getDaArdep(Integer ardep);

	AsArren0f getDaArcodAndArdep(String arcod, Integer ardep);

	void close();
}
