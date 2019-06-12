package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;

/**
* The persistent class for the OA_PrimaNota_Tes database table.
* 
*/
@Entity(name="OA_PrimaNota_Tes")
@NamedQueries({
	@NamedQuery(name = "MsvOA_PrimaNota_Tes.findAll", query = "SELECT o FROM OA_PrimaNota_Tes o WHERE o.tipoOperazione != 'ELB' order by o.nReg asc"),
	@NamedQuery(name = "MsvOA_PrimaNota_Tes.findByNReg", query = "SELECT o FROM OA_PrimaNota_Tes o WHERE  o.tipoOperazione != 'ELB' and o.nReg = :nReg"),
	@NamedQuery(name = "MsvOA_PrimaNota_Tes.findByRegIva", query = "SELECT o FROM OA_PrimaNota_Tes o WHERE  o.tipoOperazione != 'ELB' and o.regIva = :regIva order by o.nReg asc")
})
public class MsvOA_PrimaNota_Tes implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private String nReg;
	private String causale;		
	private Timestamp dataReg;
	private Timestamp dataComp;
	private String regIva;
	private String sezionale;
	private String protocollo;
	private String tipoConto;	
	private String conto;
	private Timestamp dataDoc;
	private String documento;
	private Integer segnoDoc;
	private Timestamp dataLiquidazione;
	private String fPagamento;
	private Integer fSplitPayment;
	private String  tipoOperazione;

	public MsvOA_PrimaNota_Tes(){
	}
	
	@Id
	public String getnReg(){
		return nReg;
	}

	public void setnReg(String nReg){
		this.nReg = nReg;
	}

	public String getCausale(){
		return causale;
	}

	public void setCausale(String causale){
		this.causale = causale;
	}

	public Timestamp getDataReg(){
		return dataReg;
	}

	public void setDataReg(Timestamp dataReg){
		this.dataReg = dataReg;
	}

	public Timestamp getDataComp(){
		return dataComp;
	}

	public void setDataComp(Timestamp dataComp){
		this.dataComp = dataComp;
	}

	public String getRegIva(){
		return regIva;
	}

	public void setRegIva(String regIva){
		this.regIva = regIva;
	}

	public String getSezionale(){
		return sezionale;
	}

	public void setSezionale(String sezionale){
		this.sezionale = sezionale;
	}

	public String getProtocollo(){
		return protocollo;
	}

	public void setProtocollo(String protocollo){
		this.protocollo = protocollo;
	}

	public String getTipoConto(){
		return tipoConto;
	}

	public void setTipoConto(String tipoConto){
		this.tipoConto = tipoConto;
	}

	public String getConto(){
		return conto;
	}

	public void setConto(String conto){
		this.conto = conto;
	}

	public Timestamp getDataDoc(){
		return dataDoc;
	}

	public void setDataDoc(Timestamp dataDoc){
		this.dataDoc = dataDoc;
	}

	public String getDocumento(){
		return documento;
	}

	public void setDocumento(String documento){
		this.documento = documento;
	}

	public Integer getSegnoDoc(){
		return segnoDoc;
	}

	public void setSegnoDoc(Integer segnoDoc){
		this.segnoDoc = segnoDoc;
	}

	public Timestamp getDataLiquidazione(){
		return dataLiquidazione;
	}

	public void setDataLiquidazione(Timestamp dataLiquidazione){
		this.dataLiquidazione = dataLiquidazione;
	}

	public String getfPagamento(){
		return fPagamento;
	}

	public void setfPagamento(String fPagamento){
		this.fPagamento = fPagamento;
	}

	public Integer getfSplitPayment(){
		return fSplitPayment;
	}

	public void setfSplitPayment(Integer fSplitPayment){
		this.fSplitPayment = fSplitPayment;
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
		result = prime * result + ((causale == null) ? 0 : causale.hashCode());
		result = prime * result + ((conto == null) ? 0 : conto.hashCode());
		result = prime * result + ((dataComp == null) ? 0 : dataComp.hashCode());
		result = prime * result + ((dataDoc == null) ? 0 : dataDoc.hashCode());
		result = prime * result + ((dataLiquidazione == null) ? 0 : dataLiquidazione.hashCode());
		result = prime * result + ((dataReg == null) ? 0 : dataReg.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((fPagamento == null) ? 0 : fPagamento.hashCode());
		result = prime * result + ((fSplitPayment == null) ? 0 : fSplitPayment.hashCode());
		result = prime * result + ((nReg == null) ? 0 : nReg.hashCode());
		result = prime * result + ((protocollo == null) ? 0 : protocollo.hashCode());
		result = prime * result + ((regIva == null) ? 0 : regIva.hashCode());
		result = prime * result + ((segnoDoc == null) ? 0 : segnoDoc.hashCode());
		result = prime * result + ((sezionale == null) ? 0 : sezionale.hashCode());
		result = prime * result + ((tipoConto == null) ? 0 : tipoConto.hashCode());
		result = prime * result + ((tipoOperazione == null) ? 0 : tipoOperazione.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_PrimaNota_Tes){
			if(this.nReg == ((MsvOA_PrimaNota_Tes)obj).nReg){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvOA_PrimaNota_Tes [nReg=" + nReg + ", causale=" + causale + ", dataReg=" + dataReg + ", dataComp=" + dataComp + ", regIva=" + regIva + ", sezionale=" + sezionale + ", protocollo=" + protocollo + ", tipoConto=" + tipoConto + ", conto=" + conto + ", dataDoc=" + dataDoc + ", documento=" + documento + ", segnoDoc=" + segnoDoc + ", dataLiquidazione=" + dataLiquidazione + ", fPagamento=" + fPagamento + ", fSplitPayment=" + fSplitPayment + ", tipoOperazione=" + tipoOperazione + "]";
	}
}