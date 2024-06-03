package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsCorri0fPKey;

/**
* The persistent class for the cas_dat/Corri0f database table.
* 
*/
@Entity(
	name = "Corri0f"
)
@NamedQueries(
	{@NamedQuery(name = "AsCorri0f.findById", query = "SELECT o FROM Corri0f o WHERE o.id.codat = :codat and o.id.codep = :codep and o.id.coiva = :coiva")}
)
public class AsCorri0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsCorri0fPKey id;
	private BigDecimal coimp; // Imponibile P 9 2
	private BigDecimal coimi; // Importo Iva P 9 2
	private String cofla; // Flag aggiorn. A 1
	
	public AsCorri0f(){
	}
	
	public AsCorri0fPKey getId(){
		return id;
	}
	
	public void setId(AsCorri0fPKey id){
		this.id = id;
	}
	
	public BigDecimal getCoimp(){
		return coimp;
	}
	
	public void setCoimp(BigDecimal coimp){
		this.coimp = coimp;
	}
	
	public BigDecimal getCoimi(){
		return coimi;
	}
	
	public void setCoimi(BigDecimal coimi){
		this.coimi = coimi;
	}
	
	public String getCofla(){
		return cofla;
	}
	
	public void setCofla(String cofla){
		this.cofla = cofla;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cofla == null) ? 0 : cofla.hashCode());
		result = prime * result + ((coimi == null) ? 0 : coimi.hashCode());
		result = prime * result + ((coimp == null) ? 0 : coimp.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsCorri0f){
			if(this.id == ((AsCorri0f)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsCorri0f [id=" + id + ", coimp=" + coimp + ", coimi=" + coimi + ", cofla=" + cofla + "]";
	}
}