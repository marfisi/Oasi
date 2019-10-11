package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsBolem0fPKey;

/**
* The persistent class for the cas_dat/Bolem0f database table.
* 
*/
@Entity(name = "Bolem0f")
@NamedQueries({
	@NamedQuery(name = "AsBolem0f.findAll", query = "SELECT o FROM Bolem0f o"),
	@NamedQuery(name = "AsBolem0f.findById", query = "SELECT o FROM Bolem0f o WHERE o.id.bdatd = :bdatd and o.id.bnura = :bnura and o.id.bnumd = :bnumd"),
	@NamedQuery(name = "AsBolem0f.findByBnote", query = "SELECT o FROM Bolem0f o WHERE o.bnote = :bnote")
})
public class AsBolem0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsBolem0fPKey id;
	private String btide;
	private BigDecimal bcodi;
	private String bcaus;
	private BigDecimal bimpb;
	private String bfatt;
	private String bpaga;
	private String bcatr;
	private String bcons;
	private String buten;
	private String bccup;
	private String bccig;
	private String bprot;
	private BigDecimal bdpro;
	private String bragg;
	private String bnote;
	
	public AsBolem0f(){
	}
	
	public AsBolem0fPKey getId(){
		return id;
	}

	public void setId(AsBolem0fPKey id){
		this.id = id;
	}

	public String getBtide(){
		return btide;
	}

	public void setBtide(String btide){
		this.btide = btide;
	}

	public BigDecimal getBcodi(){
		return bcodi;
	}

	public void setBcodi(BigDecimal bcodi){
		this.bcodi = bcodi;
	}

	public String getBcaus(){
		return bcaus;
	}

	public void setBcaus(String bcaus){
		this.bcaus = bcaus;
	}

	public BigDecimal getBimpb(){
		return bimpb;
	}

	public void setBimpb(BigDecimal bimpb){
		this.bimpb = bimpb;
	}

	public String getBfatt(){
		return bfatt;
	}

	public void setBfatt(String bfatt){
		this.bfatt = bfatt;
	}

	public String getBpaga(){
		return bpaga;
	}

	public void setBpaga(String bpaga){
		this.bpaga = bpaga;
	}

	public String getBcatr(){
		return bcatr;
	}

	public void setBcatr(String bcatr){
		this.bcatr = bcatr;
	}

	public String getBcons(){
		return bcons;
	}

	public void setBcons(String bcons){
		this.bcons = bcons;
	}

	public String getButen(){
		return buten;
	}

	public void setButen(String buten){
		this.buten = buten;
	}

	public String getBccup(){
		return bccup;
	}

	public void setBccup(String bccup){
		this.bccup = bccup;
	}

	public String getBccig(){
		return bccig;
	}

	public void setBccig(String bccig){
		this.bccig = bccig;
	}

	public String getBprot(){
		return bprot;
	}

	public void setBprot(String bprot){
		this.bprot = bprot;
	}

	public BigDecimal getBdpro(){
		return bdpro;
	}

	public void setBdpro(BigDecimal bdpro){
		this.bdpro = bdpro;
	}
	
	public String getBragg(){
		return bragg;
	}

	public void setBragg(String bragg){
		this.bragg = bragg;
	}

	public String getBnote(){
		return bnote;
	}

	public void setBnote(String bnote){
		this.bnote = bnote;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bcatr == null) ? 0 : bcatr.hashCode());
		result = prime * result + ((bcaus == null) ? 0 : bcaus.hashCode());
		result = prime * result + ((bccig == null) ? 0 : bccig.hashCode());
		result = prime * result + ((bccup == null) ? 0 : bccup.hashCode());
		result = prime * result + ((bcodi == null) ? 0 : bcodi.hashCode());
		result = prime * result + ((bcons == null) ? 0 : bcons.hashCode());
		result = prime * result + ((bdpro == null) ? 0 : bdpro.hashCode());
		result = prime * result + ((bfatt == null) ? 0 : bfatt.hashCode());
		result = prime * result + ((bimpb == null) ? 0 : bimpb.hashCode());
		result = prime * result + ((bnote == null) ? 0 : bnote.hashCode());
		result = prime * result + ((bpaga == null) ? 0 : bpaga.hashCode());
		result = prime * result + ((bprot == null) ? 0 : bprot.hashCode());
		result = prime * result + ((bragg == null) ? 0 : bragg.hashCode());
		result = prime * result + ((btide == null) ? 0 : btide.hashCode());
		result = prime * result + ((buten == null) ? 0 : buten.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsBolem0f) {
			if(this.id == ((AsBolem0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsBolem0f [id=" + id + ", btide=" + btide + ", bcodi=" + bcodi + ", bcaus=" + bcaus + ", bimpb=" + bimpb + ", bfatt=" + bfatt + ", bpaga=" + bpaga + ", bcatr=" + bcatr + ", bcons=" + bcons + ", buten=" + buten + ", bccup=" + bccup + ", bccig=" + bccig + ", bprot=" + bprot + ", bdpro=" + bdpro + ", bragg=" + bragg + ", bnote=" + bnote + "]";
	}
}