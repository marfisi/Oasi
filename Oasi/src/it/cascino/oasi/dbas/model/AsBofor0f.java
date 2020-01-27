package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsBofor0fPKey;

/**
* The persistent class for the cas_dat/Bofor0f database table.
* 
*/
@Entity(name = "Bofor0f")
@NamedQueries({
	@NamedQuery(name = "AsBofor0f.findAll", query = "SELECT o FROM Bofor0f o"),
	@NamedQuery(name = "AsBofor0f.findById", query = "SELECT o FROM Bofor0f o WHERE o.id.bfdat = :bfdat and o.id.bfnuz = :bfnuz and o.id.bfnum = :bfnum"),
	@NamedQuery(name = "AsBofor0f.findByBfdatBfcofBfido", query = "SELECT o FROM Bofor0f o WHERE o.id.bfdat = :bfdat and o.bfcof = :bfcof and o.bfido = :bfido")
})
public class AsBofor0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsBofor0fPKey id;
	private BigDecimal bfcof;
	private BigDecimal bfftr;
	private String bfpag;
	private String bfcau;
	private Integer bfdep;
	private Integer bfdbf;
	private String bfnbf;
	private String bfnom;
	private String bfute;
	private String bfnot;
	private String bfido;
	
	public AsBofor0f(){
	}
	
	public AsBofor0fPKey getId(){
		return id;
	}

	public void setId(AsBofor0fPKey id){
		this.id = id;
	}

	public BigDecimal getBfcof(){
		return bfcof;
	}

	public void setBfcof(BigDecimal bfcof){
		this.bfcof = bfcof;
	}

	public BigDecimal getBfftr(){
		return bfftr;
	}

	public void setBfftr(BigDecimal bfftr){
		this.bfftr = bfftr;
	}

	public String getBfpag(){
		return bfpag;
	}

	public void setBfpag(String bfpag){
		this.bfpag = bfpag;
	}

	public String getBfcau(){
		return bfcau;
	}

	public void setBfcau(String bfcau){
		this.bfcau = bfcau;
	}

	public Integer getBfdep(){
		return bfdep;
	}

	public void setBfdep(Integer bfdep){
		this.bfdep = bfdep;
	}

	public Integer getBfdbf(){
		return bfdbf;
	}

	public void setBfdbf(Integer bfdbf){
		this.bfdbf = bfdbf;
	}

	public String getBfnbf(){
		return bfnbf;
	}

	public void setBfnbf(String bfnbf){
		this.bfnbf = bfnbf;
	}

	public String getBfnom(){
		return bfnom;
	}

	public void setBfnom(String bfnom){
		this.bfnom = bfnom;
	}

	public String getBfute(){
		return bfute;
	}

	public void setBfute(String bfute){
		this.bfute = bfute;
	}

	public String getBfnot(){
		return bfnot;
	}

	public void setBfnot(String bfnot){
		this.bfnot = bfnot;
	}

	public String getBfido(){
		return bfido;
	}

	public void setBfido(String bfido){
		this.bfido = bfido;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bfcau == null) ? 0 : bfcau.hashCode());
		result = prime * result + ((bfcof == null) ? 0 : bfcof.hashCode());
		result = prime * result + ((bfdbf == null) ? 0 : bfdbf.hashCode());
		result = prime * result + ((bfdep == null) ? 0 : bfdep.hashCode());
		result = prime * result + ((bfftr == null) ? 0 : bfftr.hashCode());
		result = prime * result + ((bfnbf == null) ? 0 : bfnbf.hashCode());
		result = prime * result + ((bfnom == null) ? 0 : bfnom.hashCode());
		result = prime * result + ((bfnot == null) ? 0 : bfnot.hashCode());
		result = prime * result + ((bfpag == null) ? 0 : bfpag.hashCode());
		result = prime * result + ((bfute == null) ? 0 : bfute.hashCode());
		result = prime * result + ((bfido == null) ? 0 : bfido.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsBofor0f) {
			if(this.id == ((AsBofor0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsBofor0f [id=" + id + ", bfcof=" + bfcof + ", bfftr=" + bfftr + ", bfpag=" + bfpag + ", bfcau=" + bfcau + ", bfdep=" + bfdep + ", bfdbf=" + bfdbf + ", bfnbf=" + bfnbf + ", bfnom=" + bfnom + ", bfute=" + bfute + ", bfnot=" + bfnot + ", bfido=" + bfido + "]";
	}
}