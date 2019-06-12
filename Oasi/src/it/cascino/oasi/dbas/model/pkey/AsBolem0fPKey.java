package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsBolem0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer bdatd;
	private Integer bnura;
	private Integer bnumd;
	
	public AsBolem0fPKey(){
	}

	public AsBolem0fPKey(Integer bdatd, Integer bnura, Integer bnumd){
		super();
		this.bdatd = bdatd;
		this.bnura = bnura;
		this.bnumd = bnumd;
	}

	public Integer getFdatd(){
		return bdatd;
	}

	public Integer getBdatd(){
		return bdatd;
	}

	public void setBdatd(Integer bdatd){
		this.bdatd = bdatd;
	}

	public Integer getBnura(){
		return bnura;
	}

	public void setBnura(Integer bnura){
		this.bnura = bnura;
	}

	public Integer getBnumd(){
		return bnumd;
	}

	public void setBnumd(Integer bnumd){
		this.bnumd = bnumd;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bdatd == null) ? 0 : bdatd.hashCode());
		result = prime * result + ((bnumd == null) ? 0 : bnumd.hashCode());
		result = prime * result + ((bnura == null) ? 0 : bnura.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsBolem0fPKey) {
			if((this.bdatd == ((AsBolem0fPKey)obj).bdatd) && (this.bnura == ((AsBolem0fPKey)obj).bnura) && (this.bnumd == ((AsBolem0fPKey)obj).bnumd)) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsBolem0fPKey [bdatd=" + bdatd + ", bnura=" + bnura + ", bnumd=" + bnumd + "]";
	}
}