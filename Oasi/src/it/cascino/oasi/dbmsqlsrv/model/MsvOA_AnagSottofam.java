package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the OA_AnagSottofam database table.
* 
*/
@Entity(name="OA_AnagSottofam")
@NamedQueries({
	@NamedQuery(name = "MsvOA_AnagSottofam.findAll", query = "SELECT o FROM OA_AnagSottofam o WHERE o.sotCodice != '' order by o.sotCodice asc"),
	@NamedQuery(name = "MsvOA_AnagSottofam.findBySotCodice", query = "SELECT o FROM OA_AnagSottofam o WHERE o.sotCodice = :sotCodice"),
	@NamedQuery(name = "MsvOA_AnagSottofam.findBySotFamiglia", query = "SELECT o FROM OA_AnagSottofam o WHERE o.sotFamiglia = :sotFamiglia")
})
public class MsvOA_AnagSottofam implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private String sotCodice;
	private String sotDescrizione;
	private String sotFamiglia;
	private String codiceCascino;

	public MsvOA_AnagSottofam(){
	}
	
	public MsvOA_AnagSottofam(String sotCodice, String sotDescrizione, String sotFamiglia, String codiceCascino){
		super();
		this.sotCodice = sotCodice;
		this.sotDescrizione = sotDescrizione;
		this.sotFamiglia = sotFamiglia;
		this.codiceCascino = codiceCascino;
	}

	@Id
	public String getSotCodice(){
		return sotCodice;
	}

	public void setSotCodice(String sotCodice){
		this.sotCodice = sotCodice;
	}

	public String getSotDescrizione(){
		return sotDescrizione;
	}

	public void setSotDescrizione(String sotDescrizione){
		this.sotDescrizione = sotDescrizione;
	}

	public String getSotFamiglia(){
		return sotFamiglia;
	}

	public void setSotFamiglia(String sotFamiglia){
		this.sotFamiglia = sotFamiglia;
	}
	
	public String getCodiceCascino(){
		return codiceCascino;
	}

	public void setCodiceCascino(String codiceCascino){
		this.codiceCascino = codiceCascino;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceCascino == null) ? 0 : codiceCascino.hashCode());
		result = prime * result + ((sotCodice == null) ? 0 : sotCodice.hashCode());
		result = prime * result + ((sotDescrizione == null) ? 0 : sotDescrizione.hashCode());
		result = prime * result + ((sotFamiglia == null) ? 0 : sotFamiglia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_AnagSottofam){
			if(this.sotCodice == ((MsvOA_AnagSottofam)obj).sotCodice){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvOA_AnagSottofam[sotCodice=" + sotCodice + ", sotDescrizione=" + sotDescrizione + ", sotFamiglia=" + sotFamiglia + ", codiceCascino=" + codiceCascino + "]";
	}
}