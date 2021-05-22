package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
// import java.time.Timestamp;
import javax.persistence.*;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvAS_Vendite008PKey;

/**
* The persistent class for the AS_Vendite008 database table.
* 
*/
@Entity(
	name = "AS_Vendite008"
)
public class MsvAS_Vendite008 implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	@EmbeddedId
	private MsvAS_Vendite008PKey id;
	private Timestamp dataReg;
	private String codCliente;
	private String nroFattura;
	private Timestamp dataFattura;
	private String codArticolo;
	private BigDecimal qta;
	private BigDecimal prezzoNettoUnitario;
	
	public MsvAS_Vendite008(){
		this.id = new MsvAS_Vendite008PKey();
	}
	
	public MsvAS_Vendite008PKey getId(){
		return id;
	}
	
	public void setId(MsvAS_Vendite008PKey id){
		this.id = id;
	}

	public Timestamp getDataReg(){
		return dataReg;
	}

	public void setDataReg(Timestamp dataReg){
		this.dataReg = dataReg;
	}

	public String getCodCliente(){
		return codCliente;
	}

	public void setCodCliente(String codCliente){
		this.codCliente = codCliente;
	}

	public String getNroFattura(){
		return nroFattura;
	}

	public void setNroFattura(String nroFattura){
		this.nroFattura = nroFattura;
	}

	public Timestamp getDataFattura(){
		return dataFattura;
	}

	public void setDataFattura(Timestamp dataFattura){
		this.dataFattura = dataFattura;
	}

	public String getCodArticolo(){
		return codArticolo;
	}

	public void setCodArticolo(String codArticolo){
		this.codArticolo = codArticolo;
	}

	public BigDecimal getQta(){
		return qta;
	}

	public void setQta(BigDecimal qta){
		this.qta = qta;
	}

	public BigDecimal getPrezzoNettoUnitario(){
		return prezzoNettoUnitario;
	}

	public void setPrezzoNettoUnitario(BigDecimal prezzoNettoUnitario){
		this.prezzoNettoUnitario = prezzoNettoUnitario;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codArticolo == null) ? 0 : codArticolo.hashCode());
		result = prime * result + ((codCliente == null) ? 0 : codCliente.hashCode());
		result = prime * result + ((dataFattura == null) ? 0 : dataFattura.hashCode());
		result = prime * result + ((dataReg == null) ? 0 : dataReg.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nroFattura == null) ? 0 : nroFattura.hashCode());
		result = prime * result + ((prezzoNettoUnitario == null) ? 0 : prezzoNettoUnitario.hashCode());
		result = prime * result + ((qta == null) ? 0 : qta.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_Vendite008){
			if(this.id == ((MsvAS_Vendite008)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvAS_Vendite008 [id=" + id + ", dataReg=" + dataReg + ", codCliente=" + codCliente + ", nroFattura=" + nroFattura + ", dataFattura=" + dataFattura + ", codArticolo=" + codArticolo + ", qta=" + qta + ", prezzoNettoUnitario=" + prezzoNettoUnitario + "]";
	}
}
	