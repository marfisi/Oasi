package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the cas_dat/ancab0f database table.
* 
*/
@Entity(
	name = "Ancab0f"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsAncab0f.findAll",
		query = "SELECT o FROM Ancab0f o"
	), @NamedQuery(
		name = "AsAncab0f.findByCcoda",
		query = "SELECT o FROM Ancab0f o WHERE o.ccoda = :ccoda order by o.ccodb"
	), @NamedQuery(
		name = "AsAncab0f.findByCcodb",
		query = "SELECT o FROM Ancab0f o WHERE o.ccodb = :ccodb"
	)
	}
)
public class AsAncab0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String ccoda;
	private String ccodb;
	
	public AsAncab0f(){
	}
	
	public String getCcoda(){
		return ccoda;
	}
	
	public void setCcoda(String ccoda){
		this.ccoda = ccoda;
	}
	
	@Id
	public String getCcodb(){
		return ccodb;
	}
	
	public void setCcodb(String ccodb){
		this.ccodb = ccodb;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ccoda == null) ? 0 : ccoda.hashCode());
		result = prime * result + ((ccodb == null) ? 0 : ccodb.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsAncab0f){
			if(this.ccodb == ((AsAncab0f)obj).ccodb){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsAncab0f [ccoda=" + ccoda + ", ccodb=" + ccodb + "]";
	}
}