package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;
import org.apache.commons.lang3.StringUtils;

@Embeddable
public class AsOasic0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer oaidtr;
	private String oacmd1;

	public AsOasic0fPKey(){
	}

	public AsOasic0fPKey(Integer oaidtr, String oacmd1){
		super();
		this.oaidtr = oaidtr;
		this.oacmd1 = oacmd1;
	}
	
	public Integer getOaidtr(){
		return oaidtr;
	}

	public void setOaidtr(Integer oaidtr){
		this.oaidtr = oaidtr;
	}
	
	public String getOacmd1(){
		return oacmd1;
	}
	
	public void setOacmd1(String oacmd1){
		this.oacmd1 = oacmd1;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((oaidtr == null) ? 0 : oaidtr.hashCode());
		result = prime * result + ((oacmd1 == null) ? 0 : oacmd1.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsOasic0fPKey) {
			if((this.oacmd1 == ((AsOasic0fPKey)obj).oacmd1) && (this.oaidtr == ((AsOasic0fPKey)obj).oaidtr)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("AsOacmd0fPKey");
		stringBuilder.append("[");
		stringBuilder.append("oaidtr=" + oaidtr).append(", ");
		stringBuilder.append("oacmd1=" + StringUtils.trim(oacmd1));
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
