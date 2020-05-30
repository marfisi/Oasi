package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsLisri0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String lscoa; // Cod. Articolo
	private Integer idlis; // Id Listino
	
	public AsLisri0fPKey(){
	}
	
	public String getLscoa(){
		return lscoa;
	}
	
	public void setLscoa(String lscoa){
		this.lscoa = lscoa;
	}
	
	public Integer getIdlis(){
		return idlis;
	}
	
	public void setIdlis(Integer idlis){
		this.idlis = idlis;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idlis == null) ? 0 : idlis.hashCode());
		result = prime * result + ((lscoa == null) ? 0 : lscoa.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsLisri0fPKey){
			if((this.lscoa == ((AsLisri0fPKey)obj).lscoa) && (this.idlis == ((AsLisri0fPKey)obj).idlis)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsLisri0fPKey [lscoa=" + lscoa + ", idlis=" + idlis + "]";
	}
}