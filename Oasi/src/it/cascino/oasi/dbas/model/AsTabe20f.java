package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsTabe20fPKey;

/**
* The persistent class for the cas_dat/Tabe20f database table.
* 
*/
@Entity(name="Tabe20f")
@NamedQueries({
	@NamedQuery(name = "AsTabe20f.findAllByTbnot", query = "SELECT o FROM Tabe20f o WHERE o.id.tbnot = :tbnot order by o.id.tbele"),
	@NamedQuery(name = "AsTabe20f.findByTbnotTbele", query = "SELECT o FROM Tabe20f o WHERE o.id.tbnot = :tbnot and o.id.tbele = :tbele")
})
public class AsTabe20f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsTabe20fPKey id;
	private String tbdes;
	private String tbcom;
	
	public AsTabe20f(){
		this.id = new AsTabe20fPKey();
	}
	
	public AsTabe20f(AsTabe20fPKey id, String tbdes, String tbcom){
		super();
		this.id = id;
		this.tbdes = tbdes;
		this.tbcom = tbcom;
	}
	
	public AsTabe20fPKey getId(){
		return id;
	}
	
	public void setId(AsTabe20fPKey id){
		this.id = id;
	}

	public String getTbdes(){
		return tbdes;
	}

	public void setTbdes(String tbdes){
		this.tbdes = tbdes;
	}

	public String getTbcom(){
		return tbcom;
	}

	public void setTbcom(String tbcom){
		this.tbcom = tbcom;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tbcom == null) ? 0 : tbcom.hashCode());
		result = prime * result + ((tbdes == null) ? 0 : tbdes.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsTabe20f){
			if(this.id == ((AsTabe20f)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsTabe20f [id=" + id + ", tbdes=" + tbdes + ", tbcom=" + tbcom + "]";
	}
}