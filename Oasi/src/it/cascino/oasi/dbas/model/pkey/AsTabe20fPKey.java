package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsTabe20fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String tbnot;
	private String tbele;

	public AsTabe20fPKey(){
	}

	public AsTabe20fPKey(String tbnot, String tbele){
		super();
		this.tbnot = tbnot;
		this.tbele = tbele;
	}
	
	public String getTbnot(){
		return tbnot;
	}

	public void setTbnot(String tbnot){
		this.tbnot = tbnot;
	}

	public String getTbele(){
		return tbele;
	}

	public void setTbele(String tbele){
		this.tbele = tbele;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tbele == null) ? 0 : tbele.hashCode());
		result = prime * result + ((tbnot == null) ? 0 : tbnot.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsTabe20fPKey) {
			if((this.tbele == ((AsTabe20fPKey)obj).tbele) && (this.tbnot == ((AsTabe20fPKey)obj).tbnot)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsTabe20fPKey [tbnot=" + tbnot + ", tbele=" + tbele + "]";
	}
}
