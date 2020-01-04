package it.cascino.oasi.dbmsqlsrv.dao;

public interface MsvNativeQueryDao{
	Integer rimuoviRigheVecchie(String data);
	
	void close();
}
