package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsTabel0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String tnota;
	private String tcoel;

	public AsTabel0fPKey(){
	}

	public AsTabel0fPKey(String tnota, String tcoel){
		super();
		this.tnota = tnota;
		this.tcoel = tcoel;
	}

	public String getTnota(){
		return tnota;
	}

	public void setTnota(String tnota){
		this.tnota = tnota;
	}

	public String getTcoel(){
		return tcoel;
	}

	public void setTcoel(String tcoel){
		this.tcoel = tcoel;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tcoel == null) ? 0 : tcoel.hashCode());
		result = prime * result + ((tnota == null) ? 0 : tnota.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsTabel0fPKey) {
			if((this.tnota == ((AsTabel0fPKey)obj).tnota) && (this.tcoel == ((AsTabel0fPKey)obj).tcoel)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsTabel0fPKey [tnota=" + tnota + ", tcoel=" + tcoel + "]";
	}
}
