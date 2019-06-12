package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsFatem0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer fdatd;
	private Integer fnura;
	private Integer fnumd;
	
	public AsFatem0fPKey(){
	}

	public Integer getFdatd(){
		return fdatd;
	}

	public void setFdatd(Integer fdatd){
		this.fdatd = fdatd;
	}

	public Integer getFnura(){
		return fnura;
	}

	public void setFnura(Integer fnura){
		this.fnura = fnura;
	}

	public Integer getFnumd(){
		return fnumd;
	}

	public void setFnumd(Integer fnumd){
		this.fnumd = fnumd;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fdatd == null) ? 0 : fdatd.hashCode());
		result = prime * result + ((fnumd == null) ? 0 : fnumd.hashCode());
		result = prime * result + ((fnura == null) ? 0 : fnura.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsFatem0fPKey) {
			if((this.fdatd == ((AsFatem0fPKey)obj).fdatd) && (this.fnura == ((AsFatem0fPKey)obj).fnura) && (this.fnumd == ((AsFatem0fPKey)obj).fnumd)) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsFatem0fPKey [fdatd=" + fdatd + ", fnura=" + fnura + ", fnumd=" + fnumd + "]";
	}
}