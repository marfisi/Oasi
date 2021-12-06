package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the OA_AnagCausCont database table.
* 
*/
@Entity(
	name = "OA_AnagCausCont"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvOA_AnagCausCont.findAll",
		query = "SELECT o FROM OA_AnagCausCont o WHERE o.catCodice != '' order by o.catCodice asc"
	), @NamedQuery(
		name = "MsvOA_AnagCausCont.findByCatCodice",
		query = "SELECT o FROM OA_AnagCausCont o WHERE o.catCodice = :catCodice"
	)
	}
)
public class MsvOA_AnagCausCont implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	private String catCodice;
	private String catDescrizione;
	
	public MsvOA_AnagCausCont(){
	}
	
	@Id
	public String getCatCodice(){
		return catCodice;
	}
	
	public void setCatCodice(String catCodice){
		this.catCodice = catCodice;
	}
	
	public String getCatDescrizione(){
		return catDescrizione;
	}
	
	public void setCatDescrizione(String catDescrizione){
		this.catDescrizione = catDescrizione;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catCodice == null) ? 0 : catCodice.hashCode());
		result = prime * result + ((catDescrizione == null) ? 0 : catDescrizione.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_AnagCausCont){
			if(this.catCodice == ((MsvOA_AnagCausCont)obj).catCodice){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvOA_AnagCausCont[catCodice=" + catCodice + ", catDescrizione=" + catDescrizione + "]";
	}
}