package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsArren0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String arcod;
	private Integer ardep;

	public AsArren0fPKey(){
	}

	public AsArren0fPKey(String arcod, Integer ardep){
		super();
		this.arcod = arcod;
		this.ardep = ardep;
	}

	public String getArcod(){
		return arcod;
	}

	public void setArcod(String arcod){
		this.arcod = arcod;
	}

	public Integer getArdep(){
		return ardep;
	}

	public void setArdep(Integer ardep){
		this.ardep = ardep;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arcod == null) ? 0 : arcod.hashCode());
		result = prime * result + ((ardep == null) ? 0 : ardep.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsArren0fPKey){
			if((this.arcod == ((AsArren0fPKey)obj).arcod)&&(this.ardep == ((AsArren0fPKey)obj).ardep)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsArren0fPKey [arcod=" + arcod + ", ardep=" + ardep + "]";
	}
}
