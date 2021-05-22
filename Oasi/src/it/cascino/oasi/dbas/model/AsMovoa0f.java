package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the cas_dat/anma20f database table.
* 
*/
@Entity(
	name = "Movoa0f"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsMovoa0f.findAll",
		query = "SELECT o FROM Movoa0f o order by o.vidoa asc"
	), @NamedQuery(
		name = "AsMovoa0f.findById",
		query = "SELECT o FROM Movoa0f o WHERE o.vidoa = :vidoa"
	)
	}
)
public class AsMovoa0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	private String vidoa;
	private String voaca;
	private String voanm;
	private String voads;
	private Integer voadd;
	
	public AsMovoa0f(){
	}
	
	@Id
	public String getVidoa(){
		return vidoa;
	}
	
	public void setVidoa(String vidoa){
		this.vidoa = vidoa;
	}
	
	public String getVoaca(){
		return voaca;
	}
	
	public void setVoaca(String voaca){
		this.voaca = voaca;
	}
	
	public String getVoanm(){
		return voanm;
	}
	
	public void setVoanm(String voanm){
		this.voanm = voanm;
	}
	
	public String getVoads(){
		return voads;
	}
	
	public void setVoads(String voads){
		this.voads = voads;
	}
	
	public Integer getVoadd(){
		return voadd;
	}
	
	public void setVoadd(Integer voadd){
		this.voadd = voadd;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vidoa == null) ? 0 : vidoa.hashCode());
		result = prime * result + ((voaca == null) ? 0 : voaca.hashCode());
		result = prime * result + ((voadd == null) ? 0 : voadd.hashCode());
		result = prime * result + ((voads == null) ? 0 : voads.hashCode());
		result = prime * result + ((voanm == null) ? 0 : voanm.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsMovoa0f){
			if(this.vidoa == ((AsMovoa0f)obj).vidoa){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsMovoa0f [vidoa=" + vidoa + ", voaca=" + voaca + ", voanm=" + voanm + ", voads=" + voads + ", voadd=" + voadd + "]";
	}
}