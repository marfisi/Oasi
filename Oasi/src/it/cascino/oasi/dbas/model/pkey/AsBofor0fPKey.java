package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsBofor0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer bfdat;
	private Integer bfnuz;
	private Integer bfnum;
	
	public AsBofor0fPKey(){
	}

	public Integer getBfdat(){
		return bfdat;
	}

	public void setBfdat(Integer bfdat){
		this.bfdat = bfdat;
	}

	public Integer getBfnuz(){
		return bfnuz;
	}

	public void setBfnuz(Integer bfnuz){
		this.bfnuz = bfnuz;
	}

	public Integer getBfnum(){
		return bfnum;
	}

	public void setBfnum(Integer bfnum){
		this.bfnum = bfnum;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bfdat == null) ? 0 : bfdat.hashCode());
		result = prime * result + ((bfnum == null) ? 0 : bfnum.hashCode());
		result = prime * result + ((bfnuz == null) ? 0 : bfnuz.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsBofor0fPKey) {
			if((this.bfdat == ((AsBofor0fPKey)obj).bfdat) && (this.bfnuz == ((AsBofor0fPKey)obj).bfnuz) && (this.bfnum == ((AsBofor0fPKey)obj).bfnum)) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsBofor0fPKey [bfdat=" + bfdat + ", bfnuz=" + bfnuz + ", bfnum=" + bfnum + "]";
	}
	
}