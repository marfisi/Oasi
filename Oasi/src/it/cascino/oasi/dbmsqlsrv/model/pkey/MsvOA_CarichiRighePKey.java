package it.cascino.oasi.dbmsqlsrv.model.pkey;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class MsvOA_CarichiRighePKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String idUnivocoTes;
	private String idUnivocoRiga;

	public MsvOA_CarichiRighePKey(){		
	}

	public MsvOA_CarichiRighePKey(String idUnivocoTes, String idUnivocoRiga){
		super();
		this.idUnivocoTes = idUnivocoTes;
		this.idUnivocoRiga = idUnivocoRiga;
	}

	public String getIdUnivocoTes(){
		return idUnivocoTes;
	}

	public void setIdUnivocoTes(String idUnivocoTes){
		this.idUnivocoTes = idUnivocoTes;
	}

	public String getIdUnivocoRiga(){
		return idUnivocoRiga;
	}

	public void setIdUnivocoRiga(String idUnivocoRiga){
		this.idUnivocoRiga = idUnivocoRiga;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUnivocoRiga == null) ? 0 : idUnivocoRiga.hashCode());
		result = prime * result + ((idUnivocoTes == null) ? 0 : idUnivocoTes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_CarichiRighePKey){
			if((this.idUnivocoTes == ((MsvOA_CarichiRighePKey)obj).idUnivocoTes)&&(this.idUnivocoRiga == ((MsvOA_CarichiRighePKey)obj).idUnivocoRiga)){
					return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvOA_CarichiRighePKey [idUnivocoTes=" + idUnivocoTes + ", idUnivocoRiga=" + idUnivocoRiga + "]";
	}
}