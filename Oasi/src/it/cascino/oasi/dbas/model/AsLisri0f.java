package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsLisri0fPKey;

/**
* The persistent class for the cas_dat/Lisri0f database table.
* 
*/
 @Entity(name = "Lisri0f")
 @NamedQueries({
	 @NamedQuery(name = "AsLisri0f.findAll", query = "SELECT o FROM Lisri0f o"),
	 @NamedQuery(name = "AsLisri0f.findById", query = "SELECT o FROM Lisri0f o WHERE o.id.lscoa = :lscoa and o.id.idlis = :idlis and o.lstip = 'V' and o.lstve = :lstve")
 })
public class AsLisri0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsLisri0fPKey id;
	private BigDecimal lsprl; // Prezzo Listino P 11 4
	private BigDecimal lssc1; // Sconto 1 P 4 2
	private BigDecimal lssc2; // Sconto 2 P 4 2
	private BigDecimal lssc3; // Sconto 3 P 4 2
	private BigDecimal lssc4; // Sconto 4 P 4 2
	private String lstip; // Tipo Listino A 1
	private String lstve; // Tipo vendita cliente A 2
	
	public AsLisri0f(){
	}
	
	public AsLisri0fPKey getId(){
		return id;
	}
	
	public void setId(AsLisri0fPKey id){
		this.id = id;
	}
	
	public BigDecimal getLsprl(){
		return lsprl;
	}
	
	public void setLsprl(BigDecimal lsprl){
		this.lsprl = lsprl;
	}
	
	public BigDecimal getLssc1(){
		return lssc1;
	}
	
	public void setLssc1(BigDecimal lssc1){
		this.lssc1 = lssc1;
	}
	
	public BigDecimal getLssc2(){
		return lssc2;
	}
	
	public void setLssc2(BigDecimal lssc2){
		this.lssc2 = lssc2;
	}
	
	public BigDecimal getLssc3(){
		return lssc3;
	}
	
	public void setLssc3(BigDecimal lssc3){
		this.lssc3 = lssc3;
	}
	
	public BigDecimal getLssc4(){
		return lssc4;
	}
	
	public void setLssc4(BigDecimal lssc4){
		this.lssc4 = lssc4;
	}
	
	public String getLstip(){
		return lstip;
	}
	
	public void setLstip(String lstip){
		this.lstip = lstip;
	}
	
	public String getLstve(){
		return lstve;
	}
	
	public void setLstve(String lstve){
		this.lstve = lstve;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lsprl == null) ? 0 : lsprl.hashCode());
		result = prime * result + ((lssc1 == null) ? 0 : lssc1.hashCode());
		result = prime * result + ((lssc2 == null) ? 0 : lssc2.hashCode());
		result = prime * result + ((lssc3 == null) ? 0 : lssc3.hashCode());
		result = prime * result + ((lssc4 == null) ? 0 : lssc4.hashCode());
		result = prime * result + ((lstip == null) ? 0 : lstip.hashCode());
		result = prime * result + ((lstve == null) ? 0 : lstve.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsLisri0f){
			if(this.id == ((AsLisri0f)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsLisri0f [id=" + id + ", lsprl=" + lsprl + ", lssc1=" + lssc1 + ", lssc2=" + lssc2 + ", lssc3=" + lssc3 + ", lssc4=" + lssc4 + ", lstip=" + lstip + ", lstve=" + lstve + "]";
	}
}