package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvAS_GiacenzePKey;

/**
* The persistent class for the AS_Giacenze database table.
* 
*/
@Entity(name="AS_Giacenze")
@NamedQueries({
	@NamedQuery(name = "MsvAS_Giacenze.findAll", query = "SELECT a FROM AS_Giacenze a WHERE a.id.codArticolo != '' order by a.id.codArticolo asc"),
	@NamedQuery(name = "MsvAS_Giacenze.findByCodArticoloCodDeposito", query = "SELECT a FROM AS_Giacenze a WHERE a.id.codArticolo = :codArticolo and a.id.codDeposito = :codDeposito"),
	@NamedQuery(name = "MsvAS_Giacenze.svuota", query = "DELETE FROM AS_Giacenze a WHERE a.id.codArticolo != ''")
})
public class MsvAS_Giacenze implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	@EmbeddedId
	private MsvAS_GiacenzePKey id;
	private BigDecimal giacenza;
	private BigDecimal disponibilita;
	private BigDecimal difettosi;
	private BigDecimal scorteMin;
	private BigDecimal scorteMax;

	public MsvAS_Giacenze(){
		this.id = new MsvAS_GiacenzePKey();
	}

	public MsvAS_Giacenze(MsvAS_GiacenzePKey id, BigDecimal giacenza, BigDecimal disponibilita, BigDecimal difettosi, BigDecimal scorteMin, BigDecimal scorteMax){
		super();
		this.id = id;
		this.giacenza = giacenza;
		this.disponibilita = disponibilita;
		this.difettosi = difettosi;
		this.scorteMin = scorteMin;
		this.scorteMax = scorteMax;
	}

	public MsvAS_GiacenzePKey getId(){
		return id;
	}

	public void setId(MsvAS_GiacenzePKey id){
		this.id = id;
	}

	public BigDecimal getGiacenza(){
		return giacenza;
	}

	public void setGiacenza(BigDecimal giacenza){
		this.giacenza = giacenza;
	}

	public BigDecimal getDisponibilita(){
		return disponibilita;
	}

	public void setDisponibilita(BigDecimal disponibilita){
		this.disponibilita = disponibilita;
	}

	public BigDecimal getDifettosi(){
		return difettosi;
	}

	public void setDifettosi(BigDecimal difettosi){
		this.difettosi = difettosi;
	}

	public BigDecimal getScorteMin(){
		return scorteMin;
	}

	public void setScorteMin(BigDecimal scorteMin){
		this.scorteMin = scorteMin;
	}

	public BigDecimal getScorteMax(){
		return scorteMax;
	}

	public void setScorteMax(BigDecimal scorteMax){
		this.scorteMax = scorteMax;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((difettosi == null) ? 0 : difettosi.hashCode());
		result = prime * result + ((disponibilita == null) ? 0 : disponibilita.hashCode());
		result = prime * result + ((giacenza == null) ? 0 : giacenza.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((scorteMax == null) ? 0 : scorteMax.hashCode());
		result = prime * result + ((scorteMin == null) ? 0 : scorteMin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_Giacenze){
			if(this.id == ((MsvAS_Giacenze)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvAS_Giacenze [id=" + id + ", giacenza=" + giacenza + ", disponibilita=" + disponibilita + ", difettosi=" + difettosi + ", scorteMin=" + scorteMin + ", scorteMax=" + scorteMax + "]";
	}	
}