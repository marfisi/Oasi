package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ArdepArren")
public class AsArdepArren implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String articolo;
	private Integer deposito;
	private BigDecimal dgiac;
	private BigDecimal dgdif;
	private BigDecimal arsmi;
	private BigDecimal arsmx;
	
	public AsArdepArren(){
	}

	public AsArdepArren(String articolo, Integer deposito, BigDecimal dgiac, BigDecimal dgdif, BigDecimal arsmi, BigDecimal arsmx){
		super();
		this.articolo = articolo;
		this.deposito = deposito;
		this.dgiac = dgiac;
		this.dgdif = dgdif;
		this.arsmi = arsmi;
		this.arsmx = arsmx;
	}

	public String getArticolo(){
		return articolo;
	}

	public void setArticolo(String articolo){
		this.articolo = articolo;
	}

	@Id
	public Integer getDeposito(){
		return deposito;
	}

	public void setDeposito(Integer deposito){
		this.deposito = deposito;
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

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arsmi == null) ? 0 : arsmi.hashCode());
		result = prime * result + ((arsmx == null) ? 0 : arsmx.hashCode());
		result = prime * result + ((articolo == null) ? 0 : articolo.hashCode());
		result = prime * result + ((deposito == null) ? 0 : deposito.hashCode());
		result = prime * result + ((dgdif == null) ? 0 : dgdif.hashCode());
		result = prime * result + ((dgiac == null) ? 0 : dgiac.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsArdepArren) {
			if(this.deposito == ((AsArdepArren)obj).deposito) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsArdepArren [articolo=" + articolo + ", deposito=" + deposito + ", dgiac=" + dgiac + ", dgdif=" + dgdif + ", arsmi=" + arsmi + ", arsmx=" + arsmx + "]";
	}
}