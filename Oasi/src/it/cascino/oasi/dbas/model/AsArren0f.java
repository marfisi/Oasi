package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsArren0fPKey;

/**
* The persistent class for the cas_dat/arren0f database table.
* 
*/
@Entity(name = "Arren0f")
@NamedQueries({
	@NamedQuery(name = "AsArren0f.findAll", query = "SELECT a FROM Arren0f a"),
	@NamedQuery(name = "AsArren0f.findByArcod", query = "SELECT a FROM Arren0f a WHERE a.id.arcod = :arcod"),
	@NamedQuery(name = "AsArren0f.findByArdep", query = "SELECT a FROM Arren0f a WHERE a.id.ardep = :ardep"),
	@NamedQuery(name = "AsArren0f.findByArcodAndArdep", query = "SELECT a FROM Arren0f a WHERE a.id.arcod = :arcod and a.id.ardep = :ardep")
})
public class AsArren0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsArren0fPKey id;
	private Integer ardpa;	
	private String arpor;
	private BigDecimal arsmi;
	private BigDecimal arsmx;
	private String ardwo;
	private Integer arqco;
	
	public AsArren0f(){
	}
	
	public AsArren0fPKey getId(){
		return id;
	}
	
	public void setId(AsArren0fPKey id){
		this.id = id;
	}
	
	public Integer getArdpa(){
		return ardpa;
	}

	public void setArdpa(Integer ardpa){
		this.ardpa = ardpa;
	}

	public String getArpor(){
		return arpor;
	}

	public void setArpor(String arpor){
		this.arpor = arpor;
	}

	public BigDecimal getArsmi(){
		return arsmi;
	}

	public void setArsmi(BigDecimal arsmi){
		this.arsmi = arsmi;
	}

	public BigDecimal getArsmx(){
		return arsmx;
	}

	public void setArsmx(BigDecimal arsmx){
		this.arsmx = arsmx;
	}

	public String getArdwo(){
		return ardwo;
	}

	public void setArdwo(String ardwo){
		this.ardwo = ardwo;
	}

	public Integer getArqco(){
		return arqco;
	}

	public void setArqco(Integer arqco){
		this.arqco = arqco;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ardpa == null) ? 0 : ardpa.hashCode());
		result = prime * result + ((ardwo == null) ? 0 : ardwo.hashCode());
		result = prime * result + ((arpor == null) ? 0 : arpor.hashCode());
		result = prime * result + ((arqco == null) ? 0 : arqco.hashCode());
		result = prime * result + ((arsmi == null) ? 0 : arsmi.hashCode());
		result = prime * result + ((arsmx == null) ? 0 : arsmx.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsArren0f) {
			if(this.id == ((AsArren0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsArren0f [id=" + id + ", ardpa=" + ardpa + ", arpor=" + arpor + ", arsmi=" + arsmi + ", arsmx=" + arsmx + ", ardwo=" + ardwo + ", arqco=" + arqco + "]";
	}
}