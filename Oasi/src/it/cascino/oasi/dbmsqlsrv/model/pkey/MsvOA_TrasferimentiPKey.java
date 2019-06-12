package it.cascino.oasi.dbmsqlsrv.model.pkey;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class MsvOA_TrasferimentiPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String idTes;
	private String idRig;

	public MsvOA_TrasferimentiPKey(){		
	}

	public MsvOA_TrasferimentiPKey(String idTes, String idRig){
		super();
		this.idTes = idTes;
		this.idRig = idRig;
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
		if(obj instanceof MsvOA_TrasferimentiPKey){
			if((this.idTes == ((MsvOA_TrasferimentiPKey)obj).idTes)&&(this.idRig == ((MsvOA_TrasferimentiPKey)obj).idRig)){
					return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvOA_TrasferimentiPKey [idTes=" + idTes + ", idRig=" + idRig + "]";
	}
}