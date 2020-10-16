package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsFinaz0fPKey;

/**
* The persistent class for the cas_dat/Finaz0f database table.
* 
*/
@Entity(
	name = "Finaz0f"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsFinaz0f.findById",
		query = "SELECT o FROM Finaz0f o WHERE o.id.fndat = :fndat and o.id.fnnum = :fnnum"
	)
	}
)
public class AsFinaz0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsFinaz0fPKey id;
	private Integer fncoc;
	private String fnnoc;
	private String fnloc;
	private String fncfi;
	private Integer fnnur;
	private BigDecimal fnifi;
	private String fncag;
	private String fnnup;
	private Integer fndep;
	private String fnute;
	private String fntab;
	private String fnta2;
	
	public AsFinaz0f(){
	}
	
	public AsFinaz0fPKey getId(){
		return id;
	}
	
	public void setId(AsFinaz0fPKey id){
		this.id = id;
	}
	
	public Integer getFncoc(){
		return fncoc;
	}
	
	public void setFncoc(Integer fncoc){
		this.fncoc = fncoc;
	}
	
	public String getFnnoc(){
		return fnnoc;
	}
	
	public void setFnnoc(String fnnoc){
		this.fnnoc = fnnoc;
	}
	
	public String getFnloc(){
		return fnloc;
	}
	
	public void setFnloc(String fnloc){
		this.fnloc = fnloc;
	}
	
	public String getFncfi(){
		return fncfi;
	}
	
	public void setFncfi(String fncfi){
		this.fncfi = fncfi;
	}
	
	public BigDecimal getFnifi(){
		return fnifi;
	}
	
	public Integer getFnnur(){
		return fnnur;
	}
	
	public void setFnnur(Integer fnnur){
		this.fnnur = fnnur;
	}
	
	public void setFnifi(BigDecimal fnifi){
		this.fnifi = fnifi;
	}
	
	public String getFncag(){
		return fncag;
	}
	
	public void setFncag(String fncag){
		this.fncag = fncag;
	}
	
	public String getFnnup(){
		return fnnup;
	}
	
	public void setFnnup(String fnnup){
		this.fnnup = fnnup;
	}
	
	public Integer getFndep(){
		return fndep;
	}
	
	public void setFndep(Integer fndep){
		this.fndep = fndep;
	}
	
	public String getFnute(){
		return fnute;
	}
	
	public void setFnute(String fnute){
		this.fnute = fnute;
	}
	
	public String getFntab(){
		return fntab;
	}
	
	public void setFntab(String fntab){
		this.fntab = fntab;
	}
	
	public String getFnta2(){
		return fnta2;
	}
	
	public void setFnta2(String fnta2){
		this.fnta2 = fnta2;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fncag == null) ? 0 : fncag.hashCode());
		result = prime * result + ((fncfi == null) ? 0 : fncfi.hashCode());
		result = prime * result + ((fncoc == null) ? 0 : fncoc.hashCode());
		result = prime * result + ((fndep == null) ? 0 : fndep.hashCode());
		result = prime * result + ((fnifi == null) ? 0 : fnifi.hashCode());
		result = prime * result + ((fnloc == null) ? 0 : fnloc.hashCode());
		result = prime * result + ((fnnoc == null) ? 0 : fnnoc.hashCode());
		result = prime * result + ((fnnup == null) ? 0 : fnnup.hashCode());
		result = prime * result + ((fnnur == null) ? 0 : fnnur.hashCode());
		result = prime * result + ((fnta2 == null) ? 0 : fnta2.hashCode());
		result = prime * result + ((fntab == null) ? 0 : fntab.hashCode());
		result = prime * result + ((fnute == null) ? 0 : fnute.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsFinaz0f){
			if(this.id == ((AsFinaz0f)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsFinaz0f [id=" + id + ", fncoc=" + fncoc + ", fnnoc=" + fnnoc + ", fnloc=" + fnloc + ", fncfi=" + fncfi + ", fnnur=" + fnnur + ", fnifi=" + fnifi + ", fncag=" + fncag + ", fnnup=" + fnnup + ", fndep=" + fndep + ", fnute=" + fnute + ", fntab=" + fntab + ", fnta2=" + fnta2 + "]";
	}
}