package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsPrzac0f;

public interface AsPrzac0fDao{
	List<AsPrzac0f> getAll();

	AsPrzac0f getDaPzcod(String pzcod);

	void close();
}
