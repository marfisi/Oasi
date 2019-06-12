package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsFinaz0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer fndat;
	private Integer fnnum;
	
	public AsFinaz0fPKey(){
	}

	public Integer getFndat(){
		return fndat;
	}

	public void setFndat(Integer fndat){
		this.fndat = fndat;
	}

	public Integer getFnnum(){
		return fnnum;
	}

	public void setFnnum(Integer fnnum){
		this.fnnum = fnnum;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fndat == null) ? 0 : fndat.hashCode());
		result = prime * result + ((fnnum == null) ? 0 : fnnum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsFinaz0fPKey) {
			if((this.fndat == ((AsFinaz0fPKey)obj).fndat) && (this.fnnum == ((AsFinaz0fPKey)obj).fnnum)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsFinaz0fPKey [fndat=" + fndat + ", fnnum=" + fnnum + "]";
	}
}