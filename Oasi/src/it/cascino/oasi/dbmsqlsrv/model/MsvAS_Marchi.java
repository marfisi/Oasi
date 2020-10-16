package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the AS_Marchi database table.
* 
*/
@Entity(
	name = "AS_Marchi"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvAS_Marchi.findAll",
		query = "SELECT o FROM AS_Marchi o WHERE o.codice != '' order by o.codice asc"
	), @NamedQuery(
		name = "MsvAS_Marchi.svuota",
		query = "DELETE FROM AS_Marchi o WHERE o.codice != ''"
	)
	}
)
public class MsvAS_Marchi implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	private String codice;
	private String descrizione;
	
	public MsvAS_Marchi(){
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
		if(obj instanceof MsvAS_Marchi){
			if(this.codice == ((MsvAS_Marchi)obj).codice){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvAS_Marchi [codice=" + codice + ", descrizione=" + descrizione + "]";
	}
}