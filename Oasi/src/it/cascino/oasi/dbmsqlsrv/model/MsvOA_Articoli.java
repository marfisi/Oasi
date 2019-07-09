package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the OA_Articoli database table.
* 
*/
@Entity(name="OA_Articoli")
@NamedQueries({
	@NamedQuery(name = "MsvOA_Articoli.findAll", query = "SELECT o FROM OA_Articoli o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' and o.codBreveOasi != '' order by o.codBreveOasi asc"),
	@NamedQuery(name = "MsvOA_Articoli.findByCodBreveOasi", query = "SELECT o FROM OA_Articoli o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' and o.codBreveOasi = :codBreveOasi"),
	@NamedQuery(name = "MsvOA_Articoli.findByCodArticoloCascino", query = "SELECT o FROM OA_Articoli o WHERE substring(o.tipoOperazione, 1, 1) != '*' and o.tipoOperazione != 'DEL' and o.codArticoloCascino = :codArticoloCascino"),
	@NamedQuery(name = "MsvOA_Articoli.svuota", query = "DELETE FROM OA_Articoli o WHERE substring(o.tipoOperazione, 1, 1) = '*' and o.tipoOperazione != 'DEL' and o.codBreveOasi != ''")
})
public class MsvOA_Articoli implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private String codBreveOasi;
	private String codLungoOasi;
	private String descrizione;
	private String modello;
	private String tipoArticolo;
	private String codMarchio;
	private String codSottofam;
	private String unitaMs;
	private String codIva;
	private Integer annullato;
	private String codArticoloCascino;
	private String codFornitore;
	private String codArtFornitore;
	private String tipoOperazione;

	public MsvOA_Articoli(){
	}
	
	public MsvOA_Articoli(String codBreveOasi, String codLungoOasi, String descrizione, String modello, String tipoArticolo, String codMarchio, String codSottofam, String unitaMs, String codIva, Integer annullato, String codArticoloCascino, String codFornitore, String codArtFornitore, String tipoOperazione){
		super();
		this.codBreveOasi = codBreveOasi;
		this.codLungoOasi = codLungoOasi;
		this.descrizione = descrizione;
		this.modello = modello;
		this.tipoArticolo = tipoArticolo;
		this.codMarchio = codMarchio;
		this.codSottofam = codSottofam;
		this.unitaMs = unitaMs;
		this.codIva = codIva;
		this.annullato = annullato;
		this.codArticoloCascino = codArticoloCascino;
		this.codFornitore = codFornitore;
		this.codArtFornitore = codArtFornitore;
		this.tipoOperazione = tipoOperazione;
	}

	@Id
	public String getCodBreveOasi(){
		return codBreveOasi;
	}

	public void setCodBreveOasi(String codBreveOasi){
		this.codBreveOasi = codBreveOasi;
	}

	public String getCodLungoOasi(){
		return codLungoOasi;
	}

	public void setCodLungoOasi(String codLungoOasi){
		this.codLungoOasi = codLungoOasi;
	}

	public String getDescrizione(){
		return descrizione;
	}

	public void setDescrizione(String descrizione){
		this.descrizione = descrizione;
	}

	public String getModello(){
		return modello;
	}

	public void setModello(String modello){
		this.modello = modello;
	}

	public String getTipoArticolo(){
		return tipoArticolo;
	}

	public void setTipoArticolo(String tipoArticolo){
		this.tipoArticolo = tipoArticolo;
	}

	public String getCodMarchio(){
		return codMarchio;
	}

	public void setCodMarchio(String codMarchio){
		this.codMarchio = codMarchio;
	}

	public String getCodSottofam(){
		return codSottofam;
	}

	public void setCodSottofam(String codSottofam){
		this.codSottofam = codSottofam;
	}

	public String getUnitaMs(){
		return unitaMs;
	}

	public void setUnitaMs(String unitaMs){
		this.unitaMs = unitaMs;
	}

	public String getCodIva(){
		return codIva;
	}

	public void setCodIva(String codIva){
		this.codIva = codIva;
	}

	public Integer getAnnullato(){
		return annullato;
	}

	public void setAnnullato(Integer annullato){
		this.annullato = annullato;
	}

	public String getCodArticoloCascino(){
		return codArticoloCascino;
	}

	public void setCodArticoloCascino(String codArticoloCascino){
		this.codArticoloCascino = codArticoloCascino;
	}

	public String getCodFornitore(){
		return codFornitore;
	}

	public void setCodFornitore(String codFornitore){
		this.codFornitore = codFornitore;
	}

	public String getCodArtFornitore(){
		return codArtFornitore;
	}

	public void setCodArtFornitore(String codArtFornitore){
		this.codArtFornitore = codArtFornitore;
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
		result = prime * result + ((annullato == null) ? 0 : annullato.hashCode());
		result = prime * result + ((codArticoloCascino == null) ? 0 : codArticoloCascino.hashCode());
		result = prime * result + ((codBreveOasi == null) ? 0 : codBreveOasi.hashCode());
		result = prime * result + ((codIva == null) ? 0 : codIva.hashCode());
		result = prime * result + ((codLungoOasi == null) ? 0 : codLungoOasi.hashCode());
		result = prime * result + ((codMarchio == null) ? 0 : codMarchio.hashCode());
		result = prime * result + ((codSottofam == null) ? 0 : codSottofam.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((modello == null) ? 0 : modello.hashCode());
		result = prime * result + ((tipoArticolo == null) ? 0 : tipoArticolo.hashCode());
		result = prime * result + ((tipoOperazione == null) ? 0 : tipoOperazione.hashCode());
		result = prime * result + ((unitaMs == null) ? 0 : unitaMs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_Articoli){
			if(this.codBreveOasi == ((MsvOA_Articoli)obj).codBreveOasi){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvOA_Articoli [codBreveOasi=" + codBreveOasi + ", codLungoOasi=" + codLungoOasi + ", descrizione=" + descrizione + ", modello=" + modello + ", tipoArticolo=" + tipoArticolo + ", codMarchio=" + codMarchio + ", codSottofam=" + codSottofam + ", unitaMs=" + unitaMs + ", codIva=" + codIva + ", annullato=" + annullato + ", codArticoloCascino=" + codArticoloCascino + ", codFornitore=" + codFornitore + ", codArtFornitore=" + codArtFornitore + ", tipoOperazione=" + tipoOperazione + "]";
	}
}