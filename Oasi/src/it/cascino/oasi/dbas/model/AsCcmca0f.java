package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsCcmca0fPKey;

/**
* The persistent class for the cas_dat/Ccmca0f database table.
* 
*/
@Entity(
	name = "Ccmca0f"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsCcmca0f.findById",
		query = "SELECT o FROM Ccmca0f o WHERE o.id.cadar = :cadar and o.id.canum = :canum and o.id.carig = :carig"
	), @NamedQuery(
		name = "AsCcmca0f.findByCadarCanumCanupCacon",
		query = "SELECT o FROM Ccmca0f o WHERE o.id.cadar = :cadar and o.id.canum = :canum and o.canup = :canup and trim(o.cacon) like :cacon"
	)
	}
)
public class AsCcmca0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsCcmca0fPKey id;
	private Integer cadad;
	private Integer cadap;
	private String canup;
	private Integer canrp;
	private String canud;
	private String cacre;
	private String cadav;
	private BigDecimal caimp;
	private String cacon;
	private String cacoa;
	private String cadmo;
	
	public AsCcmca0f(){
	}
	
	public AsCcmca0fPKey getId(){
		return id;
	}
	
	public void setId(AsCcmca0fPKey id){
		this.id = id;
	}
	
	public Integer getCadad(){
		return cadad;
	}
	
	public void setCadad(Integer cadad){
		this.cadad = cadad;
	}
	
	public Integer getCadap(){
		return cadap;
	}
	
	public void setCadap(Integer cadap){
		this.cadap = cadap;
	}
	
	public String getCanup(){
		return canup;
	}
	
	public void setCanup(String canup){
		this.canup = canup;
	}
	
	public Integer getCanrp(){
		return canrp;
	}
	
	public void setCanrp(Integer canrp){
		this.canrp = canrp;
	}
	
	public String getCanud(){
		return canud;
	}
	
	public void setCanud(String canud){
		this.canud = canud;
	}
	
	public String getCacre(){
		return cacre;
	}
	
	public void setCacre(String cacre){
		this.cacre = cacre;
	}
	
	public String getCadav(){
		return cadav;
	}
	
	public void setCadav(String cadav){
		this.cadav = cadav;
	}
	
	public BigDecimal getCaimp(){
		return caimp;
	}
	
	public void setCaimp(BigDecimal caimp){
		this.caimp = caimp;
	}
	
	public String getCacon(){
		return cacon;
	}
	
	public void setCacon(String cacon){
		this.cacon = cacon;
	}
	
	public String getCacoa(){
		return cacoa;
	}
	
	public void setCacoa(String cacoa){
		this.cacoa = cacoa;
	}
	
	public String getCadmo(){
		return cadmo;
	}
	
	public void setCadmo(String cadmo){
		this.cadmo = cadmo;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cacon == null) ? 0 : cacon.hashCode());
		result = prime * result + ((cacre == null) ? 0 : cacre.hashCode());
		result = prime * result + ((cadap == null) ? 0 : cadap.hashCode());
		result = prime * result + ((cadad == null) ? 0 : cadad.hashCode());
		result = prime * result + ((cadav == null) ? 0 : cadav.hashCode());
		result = prime * result + ((cadmo == null) ? 0 : cadmo.hashCode());
		result = prime * result + ((caimp == null) ? 0 : caimp.hashCode());
		result = prime * result + ((canrp == null) ? 0 : canrp.hashCode());
		result = prime * result + ((canud == null) ? 0 : canud.hashCode());
		result = prime * result + ((canup == null) ? 0 : canup.hashCode());
		result = prime * result + ((cacoa == null) ? 0 : cacoa.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsCcmca0f){
			if(this.id == ((AsCcmca0f)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsCcmca0f [id=" + id + ", cadad=" + cadad + ", cadap=" + cadap + ", canup=" + canup + ", canrp=" + canrp + ", canud=" + canud + ", cacre=" + cacre + ", cadav=" + cadav + ", caimp=" + caimp + ", cacon=" + cacon + ", cacoa=" + cacoa + ", cadmo=" + cadmo + "]";
	}
}