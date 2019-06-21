package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsAnma20f;

public interface AsAnma20fDao{
	List<AsAnma20f> getAll();

	AsAnma20f getDaM2cod(String m2cod);

	void close();
}
