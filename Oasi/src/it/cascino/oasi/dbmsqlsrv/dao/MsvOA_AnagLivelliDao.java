package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagLivelli;

public interface MsvOA_AnagLivelliDao{
	List<MsvOA_AnagLivelli> getAll();
	
//	void salva(MsvOA_AnagLivelli o);
	
//	void aggiorna(MsvOA_AnagLivelli o);
	
//	void elimina(MsvOA_AnagLivelli o);
	
	MsvOA_AnagLivelli getDaLvmCodice(String lvmCodice);

	MsvOA_AnagLivelli getDaCodiceCascino(String codiceCascino);

//	void svuotaTabella();
	
	void close();
}
