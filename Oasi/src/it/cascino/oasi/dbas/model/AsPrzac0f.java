package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
* The persistent class for the cas_dat/Przac0f database table.
* 
*/
@Entity(name = "Przac0f")
@NamedQueries({
	@NamedQuery(name = "AsPrzac0f.findAll", query = "SELECT o FROM Przac0f o order by o.pzcod"),
	@NamedQuery(name = "AsPrzac0f.findByPzcod", query = "SELECT o FROM Przac0f o WHERE o.pzcod = :pzcod")
})
public class AsPrzac0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String pzcod;
	private BigDecimal pzult;
	
	public AsPrzac0f(){
	}
	
	public AsPrzac0f(String pzcod, BigDecimal pzult){
		super();
		this.pzcod = pzcod;
		this.pzult = pzult;
	}
	
	@Id
	public String getPzcod(){
		return pzcod;
	}

	public void setPzcod(String pzcod){
		this.pzcod = pzcod;
	}

	public BigDecimal getPzult(){
		return pzult;
	}

	public void setPzult(BigDecimal pzult){
		this.pzult = pzult;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pzcod == null) ? 0 : pzcod.hashCode());
		result = prime * result + ((pzult == null) ? 0 : pzult.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsPrzac0f) {
			if(this.pzcod == ((AsPrzac0f)obj).pzcod){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsPrzac0f [pzcod=" + pzcod + ", pzult=" + pzult + "]";
	}
}