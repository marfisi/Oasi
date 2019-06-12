package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang3.StringUtils;
import it.cascino.oasi.dbas.model.pkey.AsOasic0fPKey;

/**
* The persistent class for the cas_dat/oasic0f database table.
* 
*/
@Entity(name = "Oasic0f")
@NamedQueries({
	@NamedQuery(name = "AsOasic0f.findAll", query = "SELECT c FROM Oasic0f c WHERE c.oatipo = :oatipo"),
	@NamedQuery(name = "AsOasic0f.findByToDo", query = "SELECT c FROM Oasic0f c WHERE c.oaris1 = '' and c.oatipo = :oatipo"),
	@NamedQuery(name = "AsOasic0f.findByOaidtr", query = "SELECT c FROM Oasic0f c WHERE c.id.oaidtr = :oaidtr"),
	@NamedQuery(name = "AsOasic0f.updateRis", query = "UPDATE Oasic0f c SET c.oaris1 = :oaris1 WHERE c.id.oacmd1 = :oacmd1 and c.oaris1 = '' and c.id.oaidtr = :oaidtr and c.oatipo = :oatipo")
})
//@NamedQuery(name = "AsOasic0f.findByOacass", query = "SELECT c FROM Oasic0f c WHERE c.id.oacass = :oacass and c.oatipo = :oatipo"),

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
	
	public AsOasic0f(AsOasic0fPKey id, String oaris1, String oatipo){
		super();
		this.id = id;
		this.oaris1 = oaris1;
		this.oatipo = oatipo;
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
		if(obj instanceof AsOasic0f) {
			if(this.id == ((AsOasic0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1));
		stringBuilder.append("[");
		stringBuilder.append("id=" + StringUtils.trim(id.toString())).append(", ");
		stringBuilder.append("oaris1=" + StringUtils.trim(oaris1)).append(", ");
		stringBuilder.append("oatipo=" + StringUtils.trim(oatipo));
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}