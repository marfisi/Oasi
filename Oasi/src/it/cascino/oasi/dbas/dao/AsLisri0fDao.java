package it.cascino.oasi.dbas.dao;

import it.cascino.oasi.dbas.model.AsLisri0f;

public interface AsLisri0fDao{
	AsLisri0f getDaId(String lscoa, Integer idlis, String lstve);
	
	void detach(Object entity);
	
	void close();
}
