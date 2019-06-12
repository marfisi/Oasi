package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AsMovtr0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer mtdat;
	private Integer mtnuz;
	private Integer mtnum;
	private Integer mtnur;
	
	public AsMovtr0fPKey(){
	}
	
	public AsMovtr0fPKey(Integer mtdat, Integer mtnuz, Integer mtnum, Integer mtnur){
		super();
		this.mtdat = mtdat;
		this.mtnuz = mtnuz;
		this.mtnum = mtnum;
		this.mtnur = mtnur;
	}

	public Integer getMtdat(){
		return mtdat;
	}

	public void setMtdat(Integer mtdat){
		this.mtdat = mtdat;
	}

	public Integer getMtnuz(){
		return mtnuz;
	}

	public void setMtnuz(Integer mtnuz){
		this.mtnuz = mtnuz;
	}

	public Integer getMtnum(){
		return mtnum;
	}

	public void setMtnum(Integer mtnum){
		this.mtnum = mtnum;
	}

	public Integer getMtnur(){
		return mtnur;
	}

	public void setMtnur(Integer mtnur){
		this.mtnur = mtnur;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mtdat == null) ? 0 : mtdat.hashCode());
		result = prime * result + ((mtnum == null) ? 0 : mtnum.hashCode());
		result = prime * result + ((mtnur == null) ? 0 : mtnur.hashCode());
		result = prime * result + ((mtnuz == null) ? 0 : mtnuz.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsMovtr0fPKey) {
			if((this.mtdat == ((AsMovtr0fPKey)obj).mtdat) && (this.mtnuz == ((AsMovtr0fPKey)obj).mtnuz) && (this.mtnum == ((AsMovtr0fPKey)obj).mtnum) && (this.mtnur == ((AsMovtr0fPKey)obj).mtnur)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsMovtr0fPKey [mtdat=" + mtdat + ", mtnuz=" + mtnuz + ", mtnum=" + mtnum + ", mtnur=" + mtnur + "]";
	}
}