package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsOaard0fPKey;

/**
* The persistent class for the cas_dat/Oaard0f database table.
* 
*/
@Entity(name = "Oaard0f")
@NamedQueries({
	@NamedQuery(name = "AsOaard0f.findAll", query = "SELECT a FROM Oaard0f a order by a.id.dcoda asc, a.id.dcode asc"),
	@NamedQuery(name = "AsOaard0f.findByDcoda", query = "SELECT a FROM Oaard0f a WHERE a.id.dcoda = :dcoda order by a.id.dcoda asc, a.id.dcode asc"),
	@NamedQuery(name = "AsOaard0f.findByDcode", query = "SELECT a FROM Oaard0f a WHERE a.id.dcode = :dcode order by a.id.dcoda asc, a.id.dcode asc"),
	@NamedQuery(name = "AsOaard0f.findByDcodaDcode", query = "SELECT a FROM Oaard0f a WHERE a.id.dcoda = :dcoda and a.id.dcode = :dcode"),
	@NamedQuery(name = "AsOaard0f.svuota", query = "DELETE FROM Oaard0f a WHERE a.id.dcoda != ''")
})
public class AsOaard0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsOaard0fPKey id;
	private String dflag;
	
	public AsOaard0f(){
	}
	
	public AsOaard0fPKey getId(){
		return id;
	}
	
	public void setId(AsOaard0fPKey id){
		this.id = id;
	}
	
	public String getDflag(){
		return dflag;
	}

	public void setDflag(String dflag){
		this.dflag = dflag;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dflag == null) ? 0 : dflag.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsOaard0f) {
			if(this.id == ((AsOaard0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsOaard0f [id=" + id + ", dflag=" + dflag + "]";
	}
}