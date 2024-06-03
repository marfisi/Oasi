package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsCorri0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer codat; // Data P 8 0
	private Integer codep; // Deposito P 2 0
	private String coiva; // Codice Iva A 2
	
	public AsCorri0fPKey(){
	}
	
	public Integer getCodat(){
		return codat;
	}
	
	public void setCodat(Integer codat){
		this.codat = codat;
	}
	
	public Integer getCodep(){
		return codep;
	}
	
	public void setCodep(Integer codep){
		this.codep = codep;
	}
	
	public String getCoiva(){
		return coiva;
	}
	
	public void setCoiva(String coiva){
		this.coiva = coiva;
	}
	
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codat == null) ? 0 : codat.hashCode());
		result = prime * result + ((codep == null) ? 0 : codep.hashCode());
		result = prime * result + ((coiva == null) ? 0 : coiva.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsCorri0fPKey){
			if((this.codat == ((AsCorri0fPKey)obj).codat) && (this.codat == ((AsCorri0fPKey)obj).codat) && (this.coiva == ((AsCorri0fPKey)obj).coiva)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsCorri0fPKey [codat=" + codat + ", codep=" + codep + ", coiva=" + coiva + "]";
	}
}