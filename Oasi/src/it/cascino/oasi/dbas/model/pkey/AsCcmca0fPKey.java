package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsCcmca0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer cadar;
	private Integer canum;
	private Integer carig;
	
	public AsCcmca0fPKey(){
	}

	public Integer getCadar(){
		return cadar;
	}

	public void setCadar(Integer cadar){
		this.cadar = cadar;
	}

	public Integer getCanum(){
		return canum;
	}

	public void setCanum(Integer canum){
		this.canum = canum;
	}

	public Integer getCarig(){
		return carig;
	}

	public void setCarig(Integer carig){
		this.carig = carig;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cadar == null) ? 0 : cadar.hashCode());
		result = prime * result + ((canum == null) ? 0 : canum.hashCode());
		result = prime * result + ((carig == null) ? 0 : carig.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsCcmca0fPKey) {
			if((this.cadar == ((AsCcmca0fPKey)obj).cadar) && (this.canum == ((AsCcmca0fPKey)obj).canum) && (this.carig == ((AsCcmca0fPKey)obj).carig)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsCcmca0fPKey [cadar=" + cadar + ", canum=" + canum + ", carig=" + carig + "]";
	}
}