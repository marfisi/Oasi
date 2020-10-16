package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the cas_dat/Oaanm0f database table.
* 
*/
@Entity(
	name = "Oaanm0f"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsOaanm0f.findAll",
		query = "SELECT o FROM Oaanm0f o"
	), @NamedQuery(
		name = "AsOaanm0f.findByMcoda",
		query = "SELECT o FROM Oaanm0f o WHERE o.mcoda = :mcoda"
	), @NamedQuery(
		name = "AsOaanm0f.svuota",
		query = "DELETE FROM Oaanm0f o WHERE o.mcoda != ''"
	)
	}
)
public class AsOaanm0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String mcoda;
	private String mflag;
	
	public AsOaanm0f(){
	}
	
	@Id
	public String getMcoda(){
		return mcoda;
	}
	
	public void setMcoda(String mcoda){
		this.mcoda = mcoda;
	}
	
	public String getMflag(){
		return mflag;
	}
	
	public void setMflag(String mflag){
		this.mflag = mflag;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mcoda == null) ? 0 : mcoda.hashCode());
		result = prime * result + ((mflag == null) ? 0 : mflag.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsOaanm0f){
			if(this.mcoda == ((AsOaanm0f)obj).mcoda){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsOaanm0f [mcoda=" + mcoda + ", mflag=" + mflag + "]";
	}
}