package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the AS_Articoli database table.
* 
*/
@Entity(name="AS_Articoli")
@NamedQueries({
	@NamedQuery(name = "MsvAS_Articoli.findAll", query = "SELECT a FROM AS_Articoli a WHERE a.codArticolo != '' order by a.codArticolo asc"),
	@NamedQuery(name = "MsvAS_Articoli.findByCodArticolo", query = "SELECT a FROM AS_Articoli a WHERE a.codArticolo = :codArticolo"),
	@NamedQuery(name = "MsvAS_Articoli.svuota", query = "DELETE FROM AS_Articoli a WHERE a.codArticolo != ''")
})
public class MsvAS_Articoli implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private String codArticolo;
	private String descrizione;
	private String modello;
	private String codMarchio;
	private String codLivello;
	private String unitaMs;
	private String codFornitore;
	private String codArtFornitore;
	private Integer flagArtIngrosso;
	private String codIva;
	private Integer annullato;

	public MsvAS_Articoli(){
	}
	
	public MsvAS_Articoli(String codArticolo, String descrizione, String modello, String codMarchio, String codLivello, String unitaMs, String codFornitore, String codArtFornitore, Integer flagArtIngrosso, String codIva, Integer annullato){
		super();
		this.codArticolo = codArticolo;
		this.descrizione = descrizione;
		this.modello = modello;
		this.codMarchio = codMarchio;
		this.codLivello = codLivello;
		this.unitaMs = unitaMs;
		this.codFornitore = codFornitore;
		this.codArtFornitore = codArtFornitore;
		this.flagArtIngrosso = flagArtIngrosso;
		this.codIva = codIva;
		this.annullato = annullato;
	}

	@Id
	public String getCodArticolo(){
		return codArticolo;
	}

	public void setCodArticolo(String codArticolo){
		this.codArticolo = codArticolo;
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

	public String getCodMarchio(){
		return codMarchio;
	}

	public void setCodMarchio(String codMarchio){
		this.codMarchio = codMarchio;
	}

	public String getCodLivello(){
		return codLivello;
	}

	public void setCodLivello(String codLivello){
		this.codLivello = codLivello;
	}

	public String getUnitaMs(){
		return unitaMs;
	}

	public void setUnitaMs(String unitaMs){
		this.unitaMs = unitaMs;
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

	public Integer getFlagArtIngrosso(){
		return flagArtIngrosso;
	}

	public void setFlagArtIngrosso(Integer flagArtIngrosso){
		this.flagArtIngrosso = flagArtIngrosso;
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

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annullato == null) ? 0 : annullato.hashCode());
		result = prime * result + ((codArtFornitore == null) ? 0 : codArtFornitore.hashCode());
		result = prime * result + ((codArticolo == null) ? 0 : codArticolo.hashCode());
		result = prime * result + ((codFornitore == null) ? 0 : codFornitore.hashCode());
		result = prime * result + ((codIva == null) ? 0 : codIva.hashCode());
		result = prime * result + ((codLivello == null) ? 0 : codLivello.hashCode());
		result = prime * result + ((codMarchio == null) ? 0 : codMarchio.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((flagArtIngrosso == null) ? 0 : flagArtIngrosso.hashCode());
		result = prime * result + ((modello == null) ? 0 : modello.hashCode());
		result = prime * result + ((unitaMs == null) ? 0 : unitaMs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_Articoli){
			if(this.codArticolo == ((MsvAS_Articoli)obj).codArticolo){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvAS_Articoli [codArticolo=" + codArticolo + ", descrizione=" + descrizione + ", modello=" + modello + ", codMarchio=" + codMarchio + ", codLivello=" + codLivello + ", unitaMs=" + unitaMs + ", codFornitore=" + codFornitore + ", codArtFornitore=" + codArtFornitore + ", flagArtIngrosso=" + flagArtIngrosso + ", codIva=" + codIva + ", annullato=" + annullato + "]";
	}
}