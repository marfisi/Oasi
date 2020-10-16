package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the AS_AlberoMerc database table.
* 
*/
@Entity(
	name = "AS_AlberoMerc"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvAS_AlberoMerc.findAll",
		query = "SELECT o FROM AS_AlberoMerc o WHERE o.codice != 'A' order by o.codice asc"
	), @NamedQuery(
		name = "MsvAS_AlberoMerc.svuota",
		query = "DELETE FROM AS_AlberoMerc o WHERE o.codice != ''"
	)
	}
)
public class MsvAS_AlberoMerc implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	private String codice;
	private String descrizione;
	
	public MsvAS_AlberoMerc(){
	}
	
	@Id
	public String getCodice(){
		return codice;
	}
	
	public void setCodice(String codice){
		this.codice = codice;
	}
	
	public String getDescrizione(){
		return descrizione;
	}
	
	public void setDescrizione(String descrizione){
		this.descrizione = descrizione;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_AlberoMerc){
			if(this.descrizione == ((MsvAS_AlberoMerc)obj).descrizione){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvAS_AlberoMerc [codice=" + codice + ", descrizione=" + descrizione + "]";
	}
}