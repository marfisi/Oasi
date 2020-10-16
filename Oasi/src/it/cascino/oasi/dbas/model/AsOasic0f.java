package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsOasic0fPKey;

/**
* The persistent class for the cas_dat/oasic0f database table.
* 
*/
@Entity(
	name = "Oasic0f"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsOasic0f.findAll",
		query = "SELECT o FROM Oasic0f o WHERE o.oatipo = :oatipo"
	), @NamedQuery(
		name = "AsOasic0f.findByToDo",
		query = "SELECT o FROM Oasic0f o WHERE o.oaris1 = '' and o.oatipo = :oatipo"
	), @NamedQuery(
		name = "AsOasic0f.findByOaidtr",
		query = "SELECT o FROM Oasic0f o WHERE o.id.oaidtr = :oaidtr"
	), @NamedQuery(
		name = "AsOasic0f.updateRis",
		query = "UPDATE Oasic0f o SET o.oaris1 = :oaris1 WHERE o.id.oacmd1 = :oacmd1 and o.oaris1 = '' and o.id.oaidtr = :oaidtr and o.oatipo = :oatipo"
	)
	}
)
// @NamedQuery(name = "AsOasic0f.findByOacass", query = "SELECT c FROM Oasic0f c WHERE c.id.oacass = :oacass and c.oatipo = :oatipo"),

public class AsOasic0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	@EmbeddedId
	private AsOasic0fPKey id;
	private String oaris1;
	private String oatipo;
	
	public AsOasic0f(){
		this.id = new AsOasic0fPKey();
	}
	
	public AsOasic0fPKey getId(){
		return id;
	}
	
	public void setId(AsOasic0fPKey id){
		this.id = id;
	}
	
	public String getOaris1(){
		return oaris1;
	}
	
	public void setOaris1(String oaris1){
		this.oaris1 = oaris1;
	}
	
	public String getOatipo(){
		return oatipo;
	}
	
	public void setOatipo(String oatipo){
		this.oatipo = oatipo;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((oaris1 == null) ? 0 : oaris1.hashCode());
		result = prime * result + ((oatipo == null) ? 0 : oatipo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsOasic0f){
			if(this.id == ((AsOasic0f)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsOasic0f [id=" + id + ", oaris1=" + oaris1 + ", oatipo=" + oatipo + "]";
	}
}