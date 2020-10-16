package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
* The persistent class for the OA_Clienti database table.
* 
*/
@Entity(
	name = "OA_Clienti"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvOA_Clienti.findAll",
		query = "SELECT o FROM OA_Clienti o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' and o.codice != '' order by o.codice asc"
	), @NamedQuery(
		name = "MsvOA_Clienti.findByCodice",
		query = "SELECT o FROM OA_Clienti o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' and o.codice = :codice"
	), @NamedQuery(
		name = "MsvOA_Clienti.svuota",
		query = "DELETE FROM OA_Clienti o WHERE substring(o.tipoOperazione, 1, 1) = '*' and o.tipoOperazione != 'DEL' and o.codice != ''"
	)
	}
)
public class MsvOA_Clienti implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	private String codice;
	private String ragSoc1;
	private String ragSoc2;
	private String indirizzo;
	private String cap;
	private String localita;
	private String provincia;
	private String codiceFiscale;
	private String partitaIva;
	private String telefono;
	private String fax;
	private String cellulare;
	private String email;
	private Integer grossista;
	private String codIntermed;
	private String codPa;
	private String flagSplitPaym;
	private String emailPec;
	private String classeSconto;
	private String nomignolo;
	private String nazione;
	private String codicePagamento;
	private Integer speseIncasso;
	private String documentoAccompagnamento;
	private Integer reverseCharge;
	private BigDecimal speseTrasportoImporto;
	private BigDecimal speseTrasportoPercentuale;
	private String cognome;
	private String nome;
	private String tipoOperazione;
	
	public MsvOA_Clienti(){
	}
	
	@Id
	public String getCodice(){
		return codice;
	}
	
	public void setCodice(String codice){
		this.codice = codice;
	}
	
	public String getRagSoc1(){
		return ragSoc1;
	}
	
	public void setRagSoc1(String ragSoc1){
		this.ragSoc1 = ragSoc1;
	}
	
	public String getRagSoc2(){
		return ragSoc2;
	}
	
	public void setRagSoc2(String ragSoc2){
		this.ragSoc2 = ragSoc2;
	}
	
	public String getIndirizzo(){
		return indirizzo;
	}
	
	public void setIndirizzo(String indirizzo){
		this.indirizzo = indirizzo;
	}
	
	public String getCap(){
		return cap;
	}
	
	public void setCap(String cap){
		this.cap = cap;
	}
	
	public String getLocalita(){
		return localita;
	}
	
	public void setLocalita(String localita){
		this.localita = localita;
	}
	
	public String getProvincia(){
		return provincia;
	}
	
	public void setProvincia(String provincia){
		this.provincia = provincia;
	}
	
	public String getCodiceFiscale(){
		return codiceFiscale;
	}
	
	public void setCodiceFiscale(String codiceFiscale){
		this.codiceFiscale = codiceFiscale;
	}
	
	public String getPartitaIva(){
		return partitaIva;
	}
	
	public void setPartitaIva(String partitaIva){
		this.partitaIva = partitaIva;
	}
	
	public String getTelefono(){
		return telefono;
	}
	
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}
	
	public String getFax(){
		return fax;
	}
	
	public void setFax(String fax){
		this.fax = fax;
	}
	
	public String getCellulare(){
		return cellulare;
	}
	
	public void setCellulare(String cellulare){
		this.cellulare = cellulare;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public Integer getGrossista(){
		return grossista;
	}
	
	public void setGrossista(Integer grossista){
		this.grossista = grossista;
	}
	
	public String getCodIntermed(){
		return codIntermed;
	}
	
	public void setCodIntermed(String codIntermed){
		this.codIntermed = codIntermed;
	}
	
	public String getCodPa(){
		return codPa;
	}
	
	public void setCodPa(String codPa){
		this.codPa = codPa;
	}
	
	public String getFlagSplitPaym(){
		return flagSplitPaym;
	}
	
	public void setFlagSplitPaym(String flagSplitPaym){
		this.flagSplitPaym = flagSplitPaym;
	}
	
	public String getEmailPec(){
		return emailPec;
	}
	
	public void setEmailPec(String emailPec){
		this.emailPec = emailPec;
	}
	
	public String getClasseSconto(){
		return classeSconto;
	}
	
	public void setClasseSconto(String classeSconto){
		this.classeSconto = classeSconto;
	}
	
	public String getNomignolo(){
		return nomignolo;
	}
	
	public void setNomignolo(String nomignolo){
		this.nomignolo = nomignolo;
	}
	
	public String getNazione(){
		return nazione;
	}
	
	public void setNazione(String nazione){
		this.nazione = nazione;
	}
	
	public String getCodicePagamento(){
		return codicePagamento;
	}
	
	public void setCodicePagamento(String codicePagamento){
		this.codicePagamento = codicePagamento;
	}
	
	public Integer getSpeseIncasso(){
		return speseIncasso;
	}
	
	public void setSpeseIncasso(Integer speseIncasso){
		this.speseIncasso = speseIncasso;
	}
	
	public String getDocumentoAccompagnamento(){
		return documentoAccompagnamento;
	}
	
	public void setDocumentoAccompagnamento(String documentoAccompagnamento){
		this.documentoAccompagnamento = documentoAccompagnamento;
	}
	
	public Integer getReverseCharge(){
		return reverseCharge;
	}
	
	public void setReverseCharge(Integer reverseCharge){
		this.reverseCharge = reverseCharge;
	}
	
	public BigDecimal getSpeseTrasportoImporto(){
		return speseTrasportoImporto;
	}
	
	public void setSpeseTrasportoImporto(BigDecimal speseTrasportoImporto){
		this.speseTrasportoImporto = speseTrasportoImporto;
	}
	
	public BigDecimal getSpeseTrasportoPercentuale(){
		return speseTrasportoPercentuale;
	}
	
	public void setSpeseTrasportoPercentuale(BigDecimal speseTrasportoPercentuale){
		this.speseTrasportoPercentuale = speseTrasportoPercentuale;
	}
	
	public String getCognome(){
		return cognome;
	}
	
	public void setCognome(String cognome){
		this.cognome = cognome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
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
		result = prime * result + ((cap == null) ? 0 : cap.hashCode());
		result = prime * result + ((cellulare == null) ? 0 : cellulare.hashCode());
		result = prime * result + ((classeSconto == null) ? 0 : classeSconto.hashCode());
		result = prime * result + ((codIntermed == null) ? 0 : codIntermed.hashCode());
		result = prime * result + ((codPa == null) ? 0 : codPa.hashCode());
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
		result = prime * result + ((codicePagamento == null) ? 0 : codicePagamento.hashCode());
		result = prime * result + ((documentoAccompagnamento == null) ? 0 : documentoAccompagnamento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((emailPec == null) ? 0 : emailPec.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((flagSplitPaym == null) ? 0 : flagSplitPaym.hashCode());
		result = prime * result + ((grossista == null) ? 0 : grossista.hashCode());
		result = prime * result + ((indirizzo == null) ? 0 : indirizzo.hashCode());
		result = prime * result + ((localita == null) ? 0 : localita.hashCode());
		result = prime * result + ((nazione == null) ? 0 : nazione.hashCode());
		result = prime * result + ((nomignolo == null) ? 0 : nomignolo.hashCode());
		result = prime * result + ((partitaIva == null) ? 0 : partitaIva.hashCode());
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
		result = prime * result + ((ragSoc1 == null) ? 0 : ragSoc1.hashCode());
		result = prime * result + ((ragSoc2 == null) ? 0 : ragSoc2.hashCode());
		result = prime * result + ((reverseCharge == null) ? 0 : reverseCharge.hashCode());
		result = prime * result + ((speseIncasso == null) ? 0 : speseIncasso.hashCode());
		result = prime * result + ((speseTrasportoImporto == null) ? 0 : speseTrasportoImporto.hashCode());
		result = prime * result + ((speseTrasportoPercentuale == null) ? 0 : speseTrasportoPercentuale.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipoOperazione == null) ? 0 : tipoOperazione.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_Clienti){
			if(this.codice == ((MsvOA_Clienti)obj).codice){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvOA_Clienti [codice=" + codice + ", ragSoc1=" + ragSoc1 + ", ragSoc2=" + ragSoc2 + ", indirizzo=" + indirizzo + ", cap=" + cap + ", localita=" + localita + ", provincia=" + provincia + ", codiceFiscale=" + codiceFiscale + ", partitaIva=" + partitaIva + ", telefono=" + telefono + ", fax=" + fax + ", cellulare=" + cellulare + ", email=" + email + ", grossista=" + grossista + ", codIntermed=" + codIntermed + ", codPa=" + codPa + ", flagSplitPaym=" + flagSplitPaym + ", emailPec=" + emailPec + ", classeSconto=" + classeSconto + ", nomignolo=" + nomignolo + ", nazione=" + nazione + ", codicePagamento=" + codicePagamento + ", speseIncasso=" + speseIncasso + ", documentoAccompagnamento=" + documentoAccompagnamento + ", reverseCharge=" + reverseCharge + ", speseTrasportoImporto=" + speseTrasportoImporto + ", speseTrasportoPercentuale=" + speseTrasportoPercentuale + ", cognome=" + cognome + ", nome=" + nome + ", tipoOperazione=" + tipoOperazione + "]";
	}
}