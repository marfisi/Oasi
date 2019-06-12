package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvOA_PrimaNota_IvaPKey;

/**
* The persistent class for the OA_PrimaNota_Iva database table.
* 
*/
@Entity(name="OA_PrimaNota_Iva")
@NamedQueries({
	@NamedQuery(name = "MsvOA_PrimaNota_Iva.findAll", query = "SELECT o FROM OA_PrimaNota_Iva o WHERE o.tipoOperazione != 'ELB' order by o.id.nReg,  o.id.nRiga"),
	@NamedQuery(name = "MsvOA_PrimaNota_Iva.findByNReg", query = "SELECT o FROM OA_PrimaNota_Iva o WHERE o.tipoOperazione != 'ELB' and o.id.nReg = :nReg order by o.id.nRiga"),
	@NamedQuery(name = "MsvOA_PrimaNota_Iva.findByNRegNriga", query = "SELECT o FROM OA_PrimaNota_Iva o WHERE o.tipoOperazione != 'ELB' and o.id.nReg = :nReg and o.id.nRiga = :nRiga")
})
public class MsvOA_PrimaNota_Iva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	@EmbeddedId
	private MsvOA_PrimaNota_IvaPKey id;
	private String codIva;
	private BigDecimal imponibile;
	private BigDecimal imposta;
	private BigDecimal indetraibile;
	private String tipoOperazione;

	public MsvOA_PrimaNota_Iva(){
	}
	
	public MsvOA_PrimaNota_Iva(MsvOA_PrimaNota_IvaPKey id, String codIva, BigDecimal imponibile, BigDecimal imposta, BigDecimal indetraibile, String tipoOperazione){
		super();
		this.id = id;
		this.codIva = codIva;
		this.imponibile = imponibile;
		this.imposta = imposta;
		this.indetraibile = indetraibile;
		this.tipoOperazione = tipoOperazione;
	}

	public MsvOA_PrimaNota_IvaPKey getId(){
		return id;
	}

	public void setId(MsvOA_PrimaNota_IvaPKey id){
		this.id = id;
	}

	public String getCodIva(){
		return codIva;
	}

	public void setCodIva(String codIva){
		this.codIva = codIva;
	}

	public BigDecimal getImponibile(){
		return imponibile;
	}

	public void setImponibile(BigDecimal imponibile){
		this.imponibile = imponibile;
	}

	public BigDecimal getImposta(){
		return imposta;
	}

	public void setImposta(BigDecimal imposta){
		this.imposta = imposta;
	}

	public BigDecimal getIndetraibile(){
		return indetraibile;
	}

	public void setIndetraibile(BigDecimal indetraibile){
		this.indetraibile = indetraibile;
	}

	public String getTipoOperazione(){
		return tipoOperazione;
	}

	public void setTipoOperazione(String tipoOperazione){
		this.tipoOperazione = tipoOperazione;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codIva == null) ? 0 : codIva.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imponibile == null) ? 0 : imponibile.hashCode());
		result = prime * result + ((imposta == null) ? 0 : imposta.hashCode());
		result = prime * result + ((indetraibile == null) ? 0 : indetraibile.hashCode());
		result = prime * result + ((tipoOperazione == null) ? 0 : tipoOperazione.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_PrimaNota_Iva){
			if(this.id == ((MsvOA_PrimaNota_Iva)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvOA_PrimaNota_Iva [id=" + id + ", codIva=" + codIva + ", imponibile=" + imponibile + ", imposta=" + imposta + ", indetraibile=" + indetraibile + ", tipoOperazione=" + tipoOperazione + "]";
	}
}