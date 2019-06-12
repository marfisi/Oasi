package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvOA_PrimaNota_RighePKey;

/**
* The persistent class for the OA_PrimaNota_Righe database table.
* 
*/
@Entity(name="OA_PrimaNota_Righe")
@NamedQueries({
	@NamedQuery(name = "MsvOA_PrimaNota_Righe.findAll", query = "SELECT o FROM OA_PrimaNota_Righe o WHERE o.tipoOperazione != 'ELB' order by o.id.nReg,  o.id.nRiga"),
	@NamedQuery(name = "MsvOA_PrimaNota_Righe.findById", query = "SELECT o FROM OA_PrimaNota_Righe o WHERE o.tipoOperazione != 'ELB' and o.id.nReg = :nReg and o.id.nRiga = :nRiga"),
	@NamedQuery(name = "MsvOA_PrimaNota_Righe.findByNReg", query = "SELECT o FROM OA_PrimaNota_Righe o WHERE o.tipoOperazione != 'ELB' and o.id.nReg = :nReg order by o.id.nRiga")
})
public class MsvOA_PrimaNota_Righe implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	@EmbeddedId
	private MsvOA_PrimaNota_RighePKey id;
	private String tipoConto;
	private String cliFor;
	private BigDecimal dare;
	private BigDecimal avere;
	private String nota1;
	private String nota2;
	private String tipoOperazione;

	public MsvOA_PrimaNota_Righe(){
	}

	public MsvOA_PrimaNota_Righe(MsvOA_PrimaNota_RighePKey id, String tipoConto, String cliFor, BigDecimal dare, BigDecimal avere, String nota1, String nota2, String tipoOperazione){
		super();
		this.id = id;
		this.tipoConto = tipoConto;
		this.cliFor = cliFor;
		this.dare = dare;
		this.avere = avere;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.tipoOperazione = tipoOperazione;
	}

	public MsvOA_PrimaNota_RighePKey getId(){
		return id;
	}

	public void setId(MsvOA_PrimaNota_RighePKey id){
		this.id = id;
	}

	public String getTipoConto(){
		return tipoConto;
	}

	public void setTipoConto(String tipoConto){
		this.tipoConto = tipoConto;
	}

	public String getCliFor(){
		return cliFor;
	}

	public void setCliFor(String cliFor){
		this.cliFor = cliFor;
	}

	public BigDecimal getDare(){
		return dare;
	}

	public void setDare(BigDecimal dare){
		this.dare = dare;
	}

	public BigDecimal getAvere(){
		return avere;
	}

	public void setAvere(BigDecimal avere){
		this.avere = avere;
	}

	public String getNota1(){
		return nota1;
	}

	public void setNota1(String nota1){
		this.nota1 = nota1;
	}

	public String getNota2(){
		return nota2;
	}

	public void setNota2(String nota2){
		this.nota2 = nota2;
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
		result = prime * result + ((avere == null) ? 0 : avere.hashCode());
		result = prime * result + ((cliFor == null) ? 0 : cliFor.hashCode());
		result = prime * result + ((dare == null) ? 0 : dare.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nota1 == null) ? 0 : nota1.hashCode());
		result = prime * result + ((nota2 == null) ? 0 : nota2.hashCode());
		result = prime * result + ((tipoConto == null) ? 0 : tipoConto.hashCode());
		result = prime * result + ((tipoOperazione == null) ? 0 : tipoOperazione.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_PrimaNota_Righe){
			if(this.id == ((MsvOA_PrimaNota_Righe)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvOA_PrimaNota_Righe [id=" + id + ", tipoConto=" + tipoConto + ", cliFor=" + cliFor + ", dare=" + dare + ", avere=" + avere + ", nota1=" + nota1 + ", nota2=" + nota2 + ", tipoOperazione=" + tipoOperazione + "]";
	}
}