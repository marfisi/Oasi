package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsScocr0fPKey;

/**
* The persistent class for the cas_dat/Scocr0f database table.
* 
*/
@Entity(name = "Scocr0f")
@NamedQueries({
	@NamedQuery(name = "AsScocr0f.findAll", query = "SELECT o FROM Scocr0f o"),
	@NamedQuery(name = "AsScocr0f.findById", query = "SELECT o FROM Scocr0f o WHERE o.id.scdat = :scdat and o.id.scnuz = :scnuz and o.id.scnum = :scnum")
})
public class AsScocr0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsScocr0fPKey id;
	private String sccau;
	private Integer scnzs;
	private Integer scnus;
	private Integer scdep;
	private Integer sccoc;
	private BigDecimal scims;
	private String sctpc;
	private Integer scdaf;
	private Integer scnuf;
	private String scute;
	private String scnot;
	private String sccag;
	
	public AsScocr0f(){
	}
	
	public AsScocr0fPKey getId(){
		return id;
	}

	public void setId(AsScocr0fPKey id){
		this.id = id;
	}

	public String getSccau(){
		return sccau;
	}

	public void setSccau(String sccau){
		this.sccau = sccau;
	}

	public Integer getScnzs(){
		return scnzs;
	}

	public void setScnzs(Integer scnzs){
		this.scnzs = scnzs;
	}

	public Integer getScnus(){
		return scnus;
	}

	public void setScnus(Integer scnus){
		this.scnus = scnus;
	}

	public Integer getScdep(){
		return scdep;
	}

	public void setScdep(Integer scdep){
		this.scdep = scdep;
	}

	public Integer getSccoc(){
		return sccoc;
	}

	public void setSccoc(Integer sccoc){
		this.sccoc = sccoc;
	}

	public BigDecimal getScims(){
		return scims;
	}

	public void setScims(BigDecimal scims){
		this.scims = scims;
	}

	public String getSctpc(){
		return sctpc;
	}

	public void setSctpc(String sctpc){
		this.sctpc = sctpc;
	}

	public Integer getScdaf(){
		return scdaf;
	}

	public void setScdaf(Integer scdaf){
		this.scdaf = scdaf;
	}

	public Integer getScnuf(){
		return scnuf;
	}

	public void setScnuf(Integer scnuf){
		this.scnuf = scnuf;
	}

	public String getScute(){
		return scute;
	}

	public void setScute(String scute){
		this.scute = scute;
	}

	public String getScnot(){
		return scnot;
	}

	public void setScnot(String scnot){
		this.scnot = scnot;
	}

	public String getSccag(){
		return sccag;
	}

	public void setSccag(String sccag){
		this.sccag = sccag;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sccag == null) ? 0 : sccag.hashCode());
		result = prime * result + ((sccau == null) ? 0 : sccau.hashCode());
		result = prime * result + ((sccoc == null) ? 0 : sccoc.hashCode());
		result = prime * result + ((scdaf == null) ? 0 : scdaf.hashCode());
		result = prime * result + ((scdep == null) ? 0 : scdep.hashCode());
		result = prime * result + ((scims == null) ? 0 : scims.hashCode());
		result = prime * result + ((scnot == null) ? 0 : scnot.hashCode());
		result = prime * result + ((scnuf == null) ? 0 : scnuf.hashCode());
		result = prime * result + ((scnus == null) ? 0 : scnus.hashCode());
		result = prime * result + ((scnzs == null) ? 0 : scnzs.hashCode());
		result = prime * result + ((sctpc == null) ? 0 : sctpc.hashCode());
		result = prime * result + ((scute == null) ? 0 : scute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsScocr0f) {
			if(this.id == ((AsScocr0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsScocr0f [id=" + id + ", sccau=" + sccau + ", scnzs=" + scnzs + ", scnus=" + scnus + ", scdep=" + scdep + ", sccoc=" + sccoc + ", scims=" + scims + ", sctpc=" + sctpc + ", scdaf=" + scdaf + ", scnuf=" + scnuf + ", scute=" + scute + ", scnot=" + scnot + ", sccag=" + sccag + "]";
	}
}