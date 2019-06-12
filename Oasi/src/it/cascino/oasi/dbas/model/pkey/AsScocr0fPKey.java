package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsScocr0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer scdat;
	private Integer scnuz;
	private Integer scnum;
	
	public AsScocr0fPKey(){
	}

	public Integer getScdat(){
		return scdat;
	}

	public void setScdat(Integer scdat){
		this.scdat = scdat;
	}

	public Integer getScnuz(){
		return scnuz;
	}

	public void setScnuz(Integer scnuz){
		this.scnuz = scnuz;
	}

	public Integer getScnum(){
		return scnum;
	}

	public void setScnum(Integer scnum){
		this.scnum = scnum;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((scdat == null) ? 0 : scdat.hashCode());
		result = prime * result + ((scnum == null) ? 0 : scnum.hashCode());
		result = prime * result + ((scnuz == null) ? 0 : scnuz.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsScocr0fPKey) {
			if((this.scdat == ((AsScocr0fPKey)obj).scdat) && (this.scnuz == ((AsScocr0fPKey)obj).scnuz) && (this.scnum == ((AsScocr0fPKey)obj).scnum)) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsScocr0fPKey [scdat=" + scdat + ", scnuz=" + scnuz + ", scnum=" + scnum + "]";
	}
}