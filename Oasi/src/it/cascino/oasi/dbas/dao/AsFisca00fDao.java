package it.cascino.oasi.dbas.dao;

import java.math.BigDecimal;
import java.util.List;
import it.cascino.oasi.dbas.model.AsFisca00f;

public interface AsFisca00fDao{
	List<AsFisca00f> getAll();
	
	Boolean salva(AsFisca00f o);
	
	Boolean aggiorna(AsFisca00f o);

	AsFisca00f getDaFiccfoFitcfo(BigDecimal ficcfo, String fitcfo);
		
	void close();
}
