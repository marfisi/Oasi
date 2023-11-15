package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.*;

/**
* The persistent class for the OA_MovimentiTestate database table.
* 
*/
@Entity(
	name = "OA_MovimentiTestate"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvOA_MovimentiTestate.findAll",
		query = "SELECT o FROM OA_MovimentiTestate o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' order by o.dataReg, o.idUnivocoTes"
	), @NamedQuery(
		name = "MsvOA_MovimentiTestate.findByIdUnivocoTes",
		query = "SELECT o FROM OA_MovimentiTestate o WHERE o.idUnivocoTes = :idUnivocoTes"
	), @NamedQuery(
		name = "MsvOA_MovimentiTestate.findByIdPntNReg",
		query = "SELECT o FROM OA_MovimentiTestate o WHERE o.idPntNReg = :idPntNReg"
	), @NamedQuery(
		name = "MsvOA_MovimentiTestate.findByAssistenzeInterne",
		query = "SELECT o FROM OA_MovimentiTestate o WHERE o.tipoOperazione = '*IN' and o.tipoOperazione != 'DEL' and  NroDoc like '%#INT#%' order by o.dataReg desc, o.idUnivocoTes"
	)
	}
)
public class MsvOA_MovimentiTestate implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	private String idUnivocoTes;
	private Timestamp dataReg;
	private String causaleOasi;
	private Integer tipoPrezzo;
	private Integer documAccomp;
	private String codMag;
	private String codCliFor;
	private String idPntNReg;
	private String codIvaTes;
	private String nroDoc;
	private Timestamp dataDoc;
	private String ipaCodiceCIG;
	private String ipaCodiceCUP;
	private String ipaCodiceCommessa;
	private String ipaIdDocumento;
	private Timestamp ipaDataDocumento;
	private String codPagamento;
	private String nMovDdt;
	private BigDecimal valTrasporto;
	private String notaFZ;
	private String notaFN;
	private String tipoOperazione;
	
	public MsvOA_MovimentiTestate(){
	}
	
	@Id
	public String getIdUnivocoTes(){
		return idUnivocoTes;
	}
	
	public void setIdUnivocoTes(String idUnivocoTes){
		this.idUnivocoTes = idUnivocoTes;
	}
	
	public Timestamp getDataReg(){
		return dataReg;
	}
	
	public void setDataReg(Timestamp dataReg){
		this.dataReg = dataReg;
	}
	
	public String getCausaleOasi(){
		return causaleOasi;
	}
	
	public void setCausaleOasi(String causaleOasi){
		this.causaleOasi = causaleOasi;
	}
	
	public Integer getTipoPrezzo(){
		return tipoPrezzo;
	}
	
	public void setTipoPrezzo(Integer tipoPrezzo){
		this.tipoPrezzo = tipoPrezzo;
	}
	
	public Integer getDocumAccomp(){
		return documAccomp;
	}
	
	public void setDocumAccomp(Integer documAccomp){
		this.documAccomp = documAccomp;
	}
	
	public String getCodMag(){
		return codMag;
	}
	
	public void setCodMag(String codMag){
		this.codMag = codMag;
	}
	
	public String getCodCliFor(){
		return codCliFor;
	}
	
	public void setCodCliFor(String codCliFor){
		this.codCliFor = codCliFor;
	}
	
	public String getIdPntNReg(){
		return idPntNReg;
	}
	
	public void setIdPntNReg(String idPntNReg){
		this.idPntNReg = idPntNReg;
	}
	
	public String getCodIvaTes(){
		return codIvaTes;
	}
	
	public void setCodIvaTes(String codIvaTes){
		this.codIvaTes = codIvaTes;
	}
	
	public String getNroDoc(){
		return nroDoc;
	}
	
	public void setNroDoc(String nroDoc){
		this.nroDoc = nroDoc;
	}
	
	public Timestamp getDataDoc(){
		return dataDoc;
	}
	
	public void setDataDoc(Timestamp dataDoc){
		this.dataDoc = dataDoc;
	}
	
	public String getIpaCodiceCIG(){
		return ipaCodiceCIG;
	}
	
	public void setIpaCodiceCIG(String ipaCodiceCIG){
		this.ipaCodiceCIG = ipaCodiceCIG;
	}
	
	public String getIpaCodiceCUP(){
		return ipaCodiceCUP;
	}
	
	public void setIpaCodiceCUP(String ipaCodiceCUP){
		this.ipaCodiceCUP = ipaCodiceCUP;
	}
	
	public String getIpaCodiceCommessa(){
		return ipaCodiceCommessa;
	}
	
	public void setIpaCodiceCommessa(String ipaCodiceCommessa){
		this.ipaCodiceCommessa = ipaCodiceCommessa;
	}
	
	public String getIpaIdDocumento(){
		return ipaIdDocumento;
	}
	
	public void setIpaIdDocumento(String ipaIdDocumento){
		this.ipaIdDocumento = ipaIdDocumento;
	}
	
	public Timestamp getIpaDataDocumento(){
		return ipaDataDocumento;
	}
	
	public void setIpaDataDocumento(Timestamp ipaDataDocumento){
		this.ipaDataDocumento = ipaDataDocumento;
	}
	
	public String getCodPagamento(){
		return codPagamento;
	}
	
	public void setCodPagamento(String codPagamento){
		this.codPagamento = codPagamento;
	}
	
	public String getnMovDdt(){
		return nMovDdt;
	}
	
	public void setnMovDdt(String nMovDdt){
		this.nMovDdt = nMovDdt;
	}
	
	public BigDecimal getValTrasporto(){
		return valTrasporto;
	}
	
	public void setValTrasporto(BigDecimal valTrasporto){
		this.valTrasporto = valTrasporto;
	}
	
	public String getNotaFZ(){
		return notaFZ;
	}
	
	public void setNotaFZ(String notaFZ){
		this.notaFZ = notaFZ;
	}
	
	public String getNotaFN(){
		return notaFN;
	}
	
	public void setNotaFN(String notaFN){
		this.notaFN = notaFN;
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
		result = prime * result + ((causaleOasi == null) ? 0 : causaleOasi.hashCode());
		result = prime * result + ((codCliFor == null) ? 0 : codCliFor.hashCode());
		result = prime * result + ((codIvaTes == null) ? 0 : codIvaTes.hashCode());
		result = prime * result + ((codMag == null) ? 0 : codMag.hashCode());
		result = prime * result + ((codPagamento == null) ? 0 : codPagamento.hashCode());
		result = prime * result + ((dataDoc == null) ? 0 : dataDoc.hashCode());
		result = prime * result + ((dataReg == null) ? 0 : dataReg.hashCode());
		result = prime * result + ((documAccomp == null) ? 0 : documAccomp.hashCode());
		result = prime * result + ((idPntNReg == null) ? 0 : idPntNReg.hashCode());
		result = prime * result + ((idUnivocoTes == null) ? 0 : idUnivocoTes.hashCode());
		result = prime * result + ((ipaCodiceCIG == null) ? 0 : ipaCodiceCIG.hashCode());
		result = prime * result + ((ipaCodiceCUP == null) ? 0 : ipaCodiceCUP.hashCode());
		result = prime * result + ((ipaCodiceCommessa == null) ? 0 : ipaCodiceCommessa.hashCode());
		result = prime * result + ((ipaDataDocumento == null) ? 0 : ipaDataDocumento.hashCode());
		result = prime * result + ((ipaIdDocumento == null) ? 0 : ipaIdDocumento.hashCode());
		result = prime * result + ((nMovDdt == null) ? 0 : nMovDdt.hashCode());
		result = prime * result + ((notaFZ == null) ? 0 : notaFZ.hashCode());
		result = prime * result + ((notaFN == null) ? 0 : notaFN.hashCode());
		result = prime * result + ((nroDoc == null) ? 0 : nroDoc.hashCode());
		result = prime * result + ((tipoOperazione == null) ? 0 : tipoOperazione.hashCode());
		result = prime * result + ((tipoPrezzo == null) ? 0 : tipoPrezzo.hashCode());
		result = prime * result + ((valTrasporto == null) ? 0 : valTrasporto.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_MovimentiTestate){
			if(this.idUnivocoTes == ((MsvOA_MovimentiTestate)obj).idUnivocoTes){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvOA_MovimentiTestate [idUnivocoTes=" + idUnivocoTes + ", dataReg=" + dataReg + ", causaleOasi=" + causaleOasi + ", tipoPrezzo=" + tipoPrezzo + ", documAccomp=" + documAccomp + ", codMag=" + codMag + ", codCliFor=" + codCliFor + ", idPntNReg=" + idPntNReg + ", codIvaTes=" + codIvaTes + ", nroDoc=" + nroDoc + ", dataDoc=" + dataDoc + ", ipaCodiceCIG=" + ipaCodiceCIG + ", ipaCodiceCUP=" + ipaCodiceCUP + ", ipaCodiceCommessa=" + ipaCodiceCommessa + ", ipaIdDocumento=" + ipaIdDocumento + ", ipaDataDocumento=" + ipaDataDocumento + ", codPagamento=" + codPagamento + ", nMovDdt=" + nMovDdt + ", valTrasporto=" + valTrasporto + ", notaFZ=" + notaFZ + ", notaFN=" + notaFN + ", tipoOperazione=" + tipoOperazione + "]";
	}
}