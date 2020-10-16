package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the $$libfca/tabge00f database table.
* 
*/
@Entity(
	name = "Tabge00f"
)
@Table(
	name = "Tabge00f",
	schema = "$$libfca"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsTabge00f.findAll",
		query = "SELECT o FROM Tabge00f o order by o.tachia"
	), @NamedQuery(
		name = "AsTabge00f.findByTachia",
		query = "SELECT o FROM Tabge00f o WHERE substr(o.tachia, 1, 2) = :tachia order by o.tachia"
	)
	}
)

public class AsTabge00f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String tachia;
	private String tadati;
	
	public AsTabge00f(){
	}
	
	@Id
	public String getTachia(){
		return tachia;
	}
	
	public void setTachia(String tachia){
		this.tachia = tachia;
	}
	
	public String getTadati(){
		return tadati;
	}
	
	public void setTadati(String tadati){
		this.tadati = tadati;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tachia == null) ? 0 : tachia.hashCode());
		result = prime * result + ((tadati == null) ? 0 : tadati.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsTabge00f){
			if(this.tachia == ((AsTabge00f)obj).tachia){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsTabge00f [tachia=" + tachia + ", tadati=" + tadati + "]";
	}
}