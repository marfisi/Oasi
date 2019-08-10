package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsArdep0fPKey;

/**
* The persistent class for the cas_dat/ardep0f database table.
* 
*/
@Entity(name = "Ardep0f")
@NamedQueries({
	@NamedQuery(name = "AsArdep0f.findAll", query = "SELECT a FROM Ardep0f a"),
	@NamedQuery(name = "AsArdep0f.findByDcoda", query = "SELECT a FROM Ardep0f a WHERE a.id.dcoda = :dcoda"),
	@NamedQuery(name = "AsArdep0f.findByDcode", query = "SELECT a FROM Ardep0f a WHERE a.id.dcode = :dcode"),
	@NamedQuery(name = "AsArdep0f.findByDcodaAndDcode", query = "SELECT a FROM Ardep0f a WHERE a.id.dcoda = :dcoda and a.id.dcode = :dcode")
})
public class AsArdep0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsArdep0fPKey id;
	private BigDecimal dgiac;
	private BigDecimal dgdif;
	private String datuc;
	private String datus;
	private String datin;
	private BigDecimal dscmi;
	private BigDecimal dscma;
	private BigDecimal damma;
	
	public AsArdep0f(){
	}
	
	public AsArdep0fPKey getId(){
		return id;
	}
	
	public void setId(AsArdep0fPKey id){
		this.id = id;
	}
	
	public BigDecimal getDgiac(){
		return dgiac;
	}
	
	public void setDgiac(BigDecimal dgiac){
		this.dgiac = dgiac;
	}
	
	public BigDecimal getDgdif(){
		return dgdif;
	}
	
	public void setDgdif(BigDecimal dgdif){
		this.dgdif = dgdif;
	}
	
	public String getDatuc(){
		return datuc;
	}
	
	public void setDatuc(String datuc){
		this.datuc = datuc;
	}
	
	public String getDatus(){
		return datus;
	}
	
	public void setDatus(String datus){
		this.datus = datus;
	}
	
	public String getDatin(){
		return datin;
	}
	
	public void setDatin(String datin){
		this.datin = datin;
	}
	
	public BigDecimal getDscmi(){
		return dscmi;
	}
	
	public void setDscmi(BigDecimal dscmi){
		this.dscmi = dscmi;
	}
	
	public BigDecimal getDscma(){
		return dscma;
	}
	
	public void setDscma(BigDecimal dscma){
		this.dscma = dscma;
	}
	
	public BigDecimal getDamma(){
		return damma;
	}

	public void setDamma(BigDecimal damma){
		this.damma = damma;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datin == null) ? 0 : datin.hashCode());
		result = prime * result + ((datuc == null) ? 0 : datuc.hashCode());
		result = prime * result + ((datus == null) ? 0 : datus.hashCode());
		result = prime * result + ((dgdif == null) ? 0 : dgdif.hashCode());
		result = prime * result + ((dgiac == null) ? 0 : dgiac.hashCode());
		result = prime * result + ((dscma == null) ? 0 : dscma.hashCode());
		result = prime * result + ((dscmi == null) ? 0 : dscmi.hashCode());
		result = prime * result + ((damma == null) ? 0 : damma.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsArdep0f) {
			if(this.id == ((AsArdep0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsArdep0f [id=" + id + ", dgiac=" + dgiac + ", dgdif=" + dgdif + ", datuc=" + datuc + ", datus=" + datus + ", datin=" + datin + ", dscmi=" + dscmi + ", dscma=" + dscma + ", damma=" + damma + "]";
	}
}