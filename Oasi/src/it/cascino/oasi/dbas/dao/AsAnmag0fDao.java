package it.cascino.oasi.dbas.dao;

import java.util.List;
import it.cascino.oasi.dbas.model.AsAnmag0f;

public interface AsAnmag0fDao{
	List<AsAnmag0f> getAll();
	
	Boolean salva(AsAnmag0f o);
	
	Boolean aggiorna(AsAnmag0f o);
	
//	void elimina(AsAnmag0f o);

	AsAnmag0f getArticoloDaMcoda(String mcoda);
	
	AsAnmag0f getArticoloDaMoalu(String moalu);
	
//	List<AsAnmag0f> getArticoliIngrosso();
//
//	List<AsAnmag0f> getArticoliAttivi();
//	
//	List<AsAnmag0f> getArticoliAnnulatiMaMovimentatiDal(String dataPartenza);
//
//	List<AsAnmag0f> getArticoliDaNonPassare(String dataPartenza, String depositi);
//
//	AsAnmag0f getArticoloDaNonPassare(String codArticolo, String dataPartenza, String depositi);
	
	List<AsAnmag0f> getArticoliDaAS400aOasi();
	
	AsAnmag0f getArticoliDaAS400aOasi(String mcoda);
	
	List<AsAnmag0f> getArticoliDaAS400aOasiSoloGiacenze();

	Integer aggiornaCampiMancanti();
	
	void close();
}
