package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsAlmer0fPKey;

/**
* The persistent class for the cas_dat/Almer0f database table.
* 
*/
@Entity(
	name = "Almer0f"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsAlmer0f.findAll",
		query = "SELECT o FROM Almer0f o WHERE o.id.amset in ('C', 'D') order by o.id.amset, o.id.amgru, o.id.amsot, o.id.amfam, o.id.amstf, o.id.amst1"
	), @NamedQuery(
		name = "AsAlmer0f.findById",
		query = "SELECT o FROM Almer0f o WHERE o.id.amset = :amset and o.id.amgru = :amgru and o.id.amsot = :amsot and o.id.amfam = :amfam and o.id.amstf = :amstf and o.id.amst1 = :amst1"
	), @NamedQuery(
		name = "AsAlmer0f.findByAmset",
		query = "SELECT o FROM Almer0f o WHERE o.id.amset = :amset order by o.id.amset, o.id.amgru, o.id.amsot, o.id.amfam, o.id.amstf, o.id.amst1"
	)
	}
)
public class AsAlmer0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsAlmer0fPKey id;
	private String amdes;
	
	public AsAlmer0f(){
	}
	
	public AsAlmer0fPKey getId(){
		return id;
	}
	
	public void setId(AsAlmer0fPKey id){
		this.id = id;
	}
	
	public String getAmdes(){
		return amdes;
	}
	
	public void setAmdes(String amdes){
		this.amdes = amdes;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amdes == null) ? 0 : amdes.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsAlmer0f){
			if(this.id == ((AsAlmer0f)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsAlmer0f [id=" + id + ", amdes=" + amdes + "]";
	}
}