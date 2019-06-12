package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsFisca00fPKey;

/**
* The persistent class for the $$libfca/Fisca00f database table.
* 
*/
@Entity(name="Fisca00f")
@Table(name="Fisca00f", schema="$$libfca")
@NamedQueries({
	@NamedQuery(name = "AsFisca00f.findAll", query = "SELECT o FROM Fisca00f o order by o.id.ficcfo"),
	@NamedQuery(name = "AsFisca00f.findByFiccfoFitcfo", query = "SELECT o FROM Fisca00f o WHERE o.id.ficcfo = :ficcfo and o.id.fitcfo = :fitcfo")
})
public class AsFisca00f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsFisca00fPKey id;
	private String fidrss;
	private String fidnme;
	
	public AsFisca00f(){
		this.id = new AsFisca00fPKey();
	}

	public AsFisca00fPKey getId(){
		return id;
	}
	
	public void setId(AsFisca00fPKey id){
		this.id = id;
	}

	public String getFidrss(){
		return fidrss;
	}

	public void setFidrss(String fidrss){
		this.fidrss = fidrss;
	}

	public String getFidnme(){
		return fidnme;
	}

	public void setFidnme(String fidnme){
		this.fidnme = fidnme;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fidnme == null) ? 0 : fidnme.hashCode());
		result = prime * result + ((fidrss == null) ? 0 : fidrss.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsMovma0f) {
			if(this.id == ((AsFisca00f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsFisca00f [id=" + id + ", fidrss=" + fidrss + ", fidnme=" + fidnme + "]";
	}
}