package it.cascino.oasi.dbmsqlsrv.dao;

import java.util.List;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Barcode;

public interface MsvAS_BarcodeDao{
	List<MsvAS_Barcode> getAll();
	
	void salva(MsvAS_Barcode a);
	
	void aggiorna(MsvAS_Barcode a);
	
//	void elimina(MsvAS_Barcode a);
	
	MsvAS_Barcode getDaCodiceBarcode(String codArticolo, String barcode);

	void svuotaTabella();
	
	void detach(Object entity);

	void close();
}
