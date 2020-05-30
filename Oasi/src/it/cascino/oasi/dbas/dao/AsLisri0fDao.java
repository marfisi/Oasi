package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsLisri0f;

public interface AsLisri0fDao{
	List<AsLisri0f> getAll();

	AsLisri0f getDaId(String lscoa, Integer idlis, String lstve);

	void close();
}
