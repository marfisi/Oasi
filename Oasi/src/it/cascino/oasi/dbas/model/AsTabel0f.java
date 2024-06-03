package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsTabel0fPKey;

/**
* The persistent class for the cas_dat/Tabel0f database table.
* 
*/
@Entity(
	name = "Tabel0f"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsTabel0f.findAllByTnota",
		query = "SELECT o FROM Tabel0f o WHERE o.id.tnota = :tnota order by o.id.tcoel"
	), @NamedQuery(
		name = "AsTabel0f.findByTnotaTcoel",
		query = "SELECT o FROM Tabel0f o WHERE o.id.tnota = :tnota and o.id.tcoel = :tcoel"
	), @NamedQuery(
	name = "AsTabel0f.findByTnotaTcom2",
	query = "SELECT o FROM Tabel0f o WHERE o.id.tnota = :tnota and o.tcom2 = :tcom2"
)
	}
)
public class AsTabel0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsTabel0fPKey id;
	private String tdesc;
	private String tcomm;
	private String tcom2;
	
	public AsTabel0f(){
		this.id = new AsTabel0fPKey();
	}
	
	public AsTabel0fPKey getId(){
		return id;
	}
	
	public void setId(AsTabel0fPKey id){
		this.id = id;
	}
	
	public String getTdesc(){
		return tdesc;
	}
	
	public void setTdesc(String tdesc){
		this.tdesc = tdesc;
	}
	
	public String getTcomm(){
		return tcomm;
	}
	
	public void setTcomm(String tcomm){
		this.tcomm = tcomm;
	}
	
	public String getTcom2(){
		return tcom2;
	}

	public void setTcom2(String tcom2){
		this.tcom2 = tcom2;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tdesc == null) ? 0 : tdesc.hashCode());
		result = prime * result + ((tcomm == null) ? 0 : tcomm.hashCode());
		result = prime * result + ((tcom2 == null) ? 0 : tcom2.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsTabel0f){
			if(this.id == ((AsTabel0f)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsTabel0f [id=" + id + ", tdesc=" + tdesc + ", tcomm=" + tcomm + ", tcom2=" + tcom2 + "]";
	}
}