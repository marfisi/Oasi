package it.cascino.oasi.dbas.dao;

import java.math.BigDecimal;
import it.cascino.oasi.dbas.model.AsFatem0f;

public interface AsFatem0fDao{
//	List<AsFatem0f> getAll();
	
	Boolean salva(AsFatem0f o);
	
	Boolean aggiorna(AsFatem0f o);
	
//	void elimina(AsFatem0f o);
	
	AsFatem0f getDaId(Integer fdatd, Integer fnura, Integer fnumd);
	
	AsFatem0f getDaFdatdFnumdFcocl(Integer fdatd, Integer fnumd, BigDecimal fcocl);
	
	void close();
}
