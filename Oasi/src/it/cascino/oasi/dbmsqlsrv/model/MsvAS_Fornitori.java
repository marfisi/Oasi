package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the AS_Fornitori database table.
* 
*/
@Entity(name="AS_Fornitori")
@NamedQueries({
	@NamedQuery(name = "MsvAS_Fornitori.findAll", query = "SELECT a FROM AS_Fornitori a WHERE a.codice != '' order by a.codice asc"),
	@NamedQuery(name = "MsvAS_Fornitori.findByCodice", query = "SELECT a FROM AS_Fornitori a WHERE a.codice = :codice"),
	@NamedQuery(name = "MsvAS_Fornitori.svuota", query = "DELETE FROM AS_Fornitori a WHERE a.codice != ''")
})
public class MsvAS_Fornitori implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
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
	private String emailPec;
	private String nomignolo;
	private String nazione;
	private String codicePagamento;
	
	public MsvAS_Fornitori(){
	}
	
	public MsvAS_Fornitori(String codice, String ragSoc1, String ragSoc2, String indirizzo, String cap, String localita, String provincia, String codiceFiscale, String partitaIva, String telefono, String fax, String cellulare, String email, String emailPec, String nomignolo, String nazione, String codicePagamento){
		super();
		this.codice = codice;
		this.ragSoc1 = ragSoc1;
		this.ragSoc2 = ragSoc2;
		this.indirizzo = indirizzo;
		this.cap = cap;
		this.localita = localita;
		this.provincia = provincia;
		this.codiceFiscale = codiceFiscale;
		this.partitaIva = partitaIva;
		this.telefono = telefono;
		this.fax = fax;
		this.cellulare = cellulare;
		this.email = email;
		this.emailPec = emailPec;
		this.nomignolo = nomignolo;
		this.nazione = nazione;
		this.codicePagamento = codicePagamento;
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

	public String getEmailPec(){
		return emailPec;
	}

	public void setEmailPec(String emailPec){
		this.emailPec = emailPec;
	}

//	public String getClasseSconto(){
//		return classeSconto;
//	}
//
//	public void setClasseSconto(String classeSconto){
//		this.classeSconto = classeSconto;
//	}

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

//	public Integer getSpeseIncasso(){
//		return speseIncasso;
//	}
//
//	public void setSpeseIncasso(Integer speseIncasso){
//		this.speseIncasso = speseIncasso;
//	}
//
//	public String getDocumentoAccompagnamento(){
//		return documentoAccompagnamento;
//	}
//
//	public void setDocumentoAccompagnamento(String documentoAccompagnamento){
//		this.documentoAccompagnamento = documentoAccompagnamento;
//	}
//
//	public Integer getReverseCharge(){
//		return reverseCharge;
//	}
//
//	public void setReverseCharge(Integer reverseCharge){
//		this.reverseCharge = reverseCharge;
//	}
//
//	public String getSpeseTrasporto(){
//		return speseTrasporto;
//	}
//
//	public void setSpeseTrasporto(String speseTrasporto){
//		this.speseTrasporto = speseTrasporto;
//	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cap == null) ? 0 : cap.hashCode());
		result = prime * result + ((cellulare == null) ? 0 : cellulare.hashCode());
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((emailPec == null) ? 0 : emailPec.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((indirizzo == null) ? 0 : indirizzo.hashCode());
		result = prime * result + ((localita == null) ? 0 : localita.hashCode());
		result = prime * result + ((nazione == null) ? 0 : nazione.hashCode());
		result = prime * result + ((nomignolo == null) ? 0 : nomignolo.hashCode());
		result = prime * result + ((partitaIva == null) ? 0 : partitaIva.hashCode());
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
		result = prime * result + ((ragSoc1 == null) ? 0 : ragSoc1.hashCode());
		result = prime * result + ((ragSoc2 == null) ? 0 : ragSoc2.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_Fornitori){
			if(this.codice == ((MsvAS_Fornitori)obj).codice){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvAS_Fornitori [codice=" + codice + ", ragSoc1=" + ragSoc1 + ", ragSoc2=" + ragSoc2 + ", indirizzo=" + indirizzo + ", cap=" + cap + ", localita=" + localita + ", provincia=" + provincia + ", codiceFiscale=" + codiceFiscale + ", partitaIva=" + partitaIva + ", telefono=" + telefono + ", fax=" + fax + ", cellulare=" + cellulare + ", email=" + email + ", emailPec=" + emailPec + ", nomignolo=" + nomignolo + ", nazione=" + nazione + "]";
	}
}