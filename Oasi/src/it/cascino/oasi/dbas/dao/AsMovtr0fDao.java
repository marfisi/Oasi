package it.cascino.oasi.dbas.dao;

import it.cascino.oasi.dbas.model.AsMovtr0f;

public interface AsMovtr0fDao{
	Boolean salva(AsMovtr0f o);
	
	Boolean aggiorna(AsMovtr0f o);
	
	AsMovtr0f getDaId(Integer mtdat, Integer mtnuz, Integer mtnum, Integer mtnur);
	
	// AsMovtr0f getDaMtdatMtdppMtute(Integer mtdat, Integer mtdpp, String mtute);
	
	AsMovtr0f getDaMtdatMtdppMtdpaMtuteMtcod(Integer mtdat, Integer mtdpp, Integer mtdpa, String mtute, String mtcod);
	
	void detach(Object entity);
	
	void close();
}
