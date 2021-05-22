package it.cascino.oasi.dbmsqlsrv.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class MsvAS_Vendite008PKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String idTes;
	private String idRig;
	
	public MsvAS_Vendite008PKey(){
	}
	
	public String getIdTes(){
		return idTes;
	}
	
	public void setIdTes(String idTes){
		this.idTes = idTes;
	}
	
	public String getIdRig(){
		return idRig;
	}
	
	public void setIdRig(String idRig){
		this.idRig = idRig;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRig == null) ? 0 : idRig.hashCode());
		result = prime * result + ((idTes == null) ? 0 : idTes.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_Vendite008PKey){
			if((this.idRig == ((MsvAS_Vendite008PKey)obj).idRig) && (this.idTes == ((MsvAS_Vendite008PKey)obj).idTes)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvAS_Vendite008PKey [idTes=" + idTes + ", idRig=" + idRig + "]";
	}
}