package it.cascino.oasi.dbas.dao;

import java.math.BigDecimal;
import java.util.List;
import it.cascino.oasi.dbas.model.AsMovma0f;

public interface AsMovma0fDao{
	List<AsMovma0f> getAll();
	
	Boolean salva(AsMovma0f o);
	
	Boolean aggiorna(AsMovma0f o);
	
	// void elimina(AsMovma0f o);
	
	AsMovma0f getDaId(Integer vdatr, String vcaus, Integer vnura, Integer vnumd, Integer vprog);
	
	BigDecimal getUltimoCostoArticolo(String vcoda);
	
	List<AsMovma0f> getDaVcoda(String vcoda, String dataPartenza, String depositi);
	
	Integer aggiornaVimps(Integer vdatr, String vcaus, Integer vnura, Integer vnumd, BigDecimal vimps);
	
	Integer aggiornaVcomm(Integer vdatr, String vcaus, Integer vnura, Integer vnumd, String vcomm);
	
	List<AsMovma0f> getDaVidoa(String vidoa);
	
	Integer aggiornaVcausInAssistenzeGaranzia(String vcaus, String vidoa);

	void detach(Object entity);
	
	void close();
}
