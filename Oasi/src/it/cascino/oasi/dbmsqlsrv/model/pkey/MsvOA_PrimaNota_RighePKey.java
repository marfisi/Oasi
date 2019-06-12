package it.cascino.oasi.dbmsqlsrv.model.pkey;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class MsvOA_PrimaNota_RighePKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nReg;
	private String nRiga;

	public MsvOA_PrimaNota_RighePKey(){		
	}

	public MsvOA_PrimaNota_RighePKey(String nReg, String nRiga){
		super();
		this.nReg = nReg;
		this.nRiga = nRiga;
	}

	public String getnReg(){
		return nReg;
	}

	public void setnReg(String nReg){
		this.nReg = nReg;
	}

	public String getnRiga(){
		return nRiga;
	}

	public void setnRiga(String nRiga){
		this.nRiga = nRiga;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nReg == null) ? 0 : nReg.hashCode());
		result = prime * result + ((nRiga == null) ? 0 : nRiga.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_PrimaNota_RighePKey){
			if((this.nReg == ((MsvOA_PrimaNota_RighePKey)obj).nReg)&&(this.nRiga == ((MsvOA_PrimaNota_RighePKey)obj).nRiga)){
					return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvOA_PrimaNota_RighePKey [nReg=" + nReg + ", nRiga=" + nRiga + "]";
	}
}