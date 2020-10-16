package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvOA_MovimentiRighePKey;

/**
* The persistent class for the OA_MovimentiRighe database table.
* 
*/
@Entity(
	name = "OA_MovimentiRighe"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvOA_MovimentiRighe.findAll",
		query = "SELECT o FROM OA_MovimentiRighe o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' order by o.id.idUnivocoTes, o.id.idUnivocoRiga"
	), @NamedQuery(
		name = "MsvOA_MovimentiRighe.findByIdUnivocoTes",
		query = "SELECT o FROM OA_MovimentiRighe o WHERE o.id.idUnivocoTes = :idUnivocoTes order by o.id.idUnivocoRiga"
	), @NamedQuery(
		name = "MsvOA_MovimentiRighe.findByIdUnivocoTesNonElaborate",
		query = "SELECT o FROM OA_MovimentiRighe o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' and o.id.idUnivocoTes = :idUnivocoTes order by o.id.idUnivocoRiga"
	), @NamedQuery(
		name = "MsvOA_MovimentiRighe.findByIdUnivocoTesElaborate",
		query = "SELECT o FROM OA_MovimentiRighe o WHERE substring(o.tipoOperazione, 1, 1) = '*' and o.tipoOperazione != 'DEL' and o.id.idUnivocoTes = :idUnivocoTes order by o.id.idUnivocoRiga"
	), @NamedQuery(
		name = "MsvOA_MovimentiRighe.findByIdUnivocoTesIdUnivocoRiga",
		query = "SELECT o FROM OA_MovimentiRighe o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' and o.id.idUnivocoTes = :idUnivocoTes and o.id.idUnivocoRiga = :idUnivocoRiga"
	)
	}
)
public class MsvOA_MovimentiRighe implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	@EmbeddedId
	private MsvOA_MovimentiRighePKey id;
	private String codArticoloOasi;
	private String codLungoOasi;
	private String codArticoloCascino;
	private BigDecimal qta;
	private BigDecimal prezzoNetto;
	private BigDecimal prezzoNettoIvaTes;
	private String codIvaRiga;
	private BigDecimal costo;
	private String codOperatore;
	private String tipoOperazione;
	
	public MsvOA_MovimentiRighe(){
	}
	
	public MsvOA_MovimentiRighePKey getId(){
		return id;
	}
	
	public void setId(MsvOA_MovimentiRighePKey id){
		this.id = id;
	}
	
	public String getCodArticoloOasi(){
		return codArticoloOasi;
	}
	
	public void setCodArticoloOasi(String codArticoloOasi){
		this.codArticoloOasi = codArticoloOasi;
	}
	
	public String getCodLungoOasi(){
		return codLungoOasi;
	}
	
	public void setCodLungoOasi(String codLungoOasi){
		this.codLungoOasi = codLungoOasi;
	}
	
	public String getCodArticoloCascino(){
		return codArticoloCascino;
	}
	
	public void setCodArticoloCascino(String codArticoloCascino){
		this.codArticoloCascino = codArticoloCascino;
	}
	
	public BigDecimal getQta(){
		return qta;
	}
	
	public void setQta(BigDecimal qta){
		this.qta = qta;
	}
	
	public BigDecimal getPrezzoNetto(){
		return prezzoNetto;
	}
	
	public void setPrezzoNetto(BigDecimal prezzoNetto){
		this.prezzoNetto = prezzoNetto;
	}
	
	public BigDecimal getPrezzoNettoIvaTes(){
		return prezzoNettoIvaTes;
	}
	
	public void setPrezzoNettoIvaTes(BigDecimal prezzoNettoIvaTes){
		this.prezzoNettoIvaTes = prezzoNettoIvaTes;
	}
	
	public String getCodIvaRiga(){
		return codIvaRiga;
	}
	
	public void setCodIvaRiga(String codIvaRiga){
		this.codIvaRiga = codIvaRiga;
	}
	
	public BigDecimal getCosto(){
		return costo;
	}
	
	public void setCosto(BigDecimal costo){
		this.costo = costo;
	}
	
	public String getCodOperatore(){
		return codOperatore;
	}
	
	public void setCodOperatore(String codOperatore){
		this.codOperatore = codOperatore;
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
		result = prime * result + ((codArticoloCascino == null) ? 0 : codArticoloCascino.hashCode());
		result = prime * result + ((codArticoloOasi == null) ? 0 : codArticoloOasi.hashCode());
		result = prime * result + ((codIvaRiga == null) ? 0 : codIvaRiga.hashCode());
		result = prime * result + ((codLungoOasi == null) ? 0 : codLungoOasi.hashCode());
		result = prime * result + ((codOperatore == null) ? 0 : codOperatore.hashCode());
		result = prime * result + ((costo == null) ? 0 : costo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((prezzoNetto == null) ? 0 : prezzoNetto.hashCode());
		result = prime * result + ((prezzoNettoIvaTes == null) ? 0 : prezzoNettoIvaTes.hashCode());
		result = prime * result + ((qta == null) ? 0 : qta.hashCode());
		result = prime * result + ((tipoOperazione == null) ? 0 : tipoOperazione.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_MovimentiRighe){
			if(this.id == ((MsvOA_MovimentiRighe)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvOA_MovimentiRighe [id=" + id + ", codArticoloOasi=" + codArticoloOasi + ", codLungoOasi=" + codLungoOasi + ", codArticoloCascino=" + codArticoloCascino + ", qta=" + qta + ", prezzoNetto=" + prezzoNetto + ", prezzoNettoIvaTes=" + prezzoNettoIvaTes + ", codIvaRiga=" + codIvaRiga + ", costo=" + costo + ", codOperatore=" + codOperatore + ", tipoOperazione=" + tipoOperazione + "]";
	}
}