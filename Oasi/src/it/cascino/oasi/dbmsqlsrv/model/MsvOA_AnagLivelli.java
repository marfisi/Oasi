package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the OA_AnagLivelli database table.
* 
*/
@Entity(name="OA_AnagLivelli")
@NamedQueries({
	@NamedQuery(name = "MsvOA_AnagLivelli.findAll", query = "SELECT o FROM OA_AnagLivelli o WHERE o.lvmCodice != '' order by o.lvmCodice asc"),
	@NamedQuery(name = "MsvOA_AnagLivelli.findByLvmCodice", query = "SELECT o FROM OA_AnagLivelli o WHERE o.lvmCodice = :lvmCodice"),
	@NamedQuery(name = "MsvOA_AnagLivelli.findByCodiceCascino", query = "SELECT o FROM OA_AnagLivelli o WHERE o.codiceCascino = :codiceCascino")
})
public class MsvOA_AnagLivelli implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private String lvmCodice;
	private String lvmDescrizione;
	private String codiceCascino;

	public MsvOA_AnagLivelli(){
	}
	
	public MsvOA_AnagLivelli(String lvmCodice, String lvmDescrizione, String codiceCascino){
		super();
		this.lvmCodice = lvmCodice;
		this.lvmDescrizione = lvmDescrizione;
		this.codiceCascino = codiceCascino;
	}

	@Id
	public String getLvmCodice(){
		return lvmCodice;
	}

	public void setLvmCodice(String lvmCodice){
		this.lvmCodice = lvmCodice;
	}

	public String getLvmDescrizione(){
		return lvmDescrizione;
	}

	public void setLvmDescrizione(String lvmDescrizione){
		this.lvmDescrizione = lvmDescrizione;
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
		result = prime * result + ((lvmCodice == null) ? 0 : lvmCodice.hashCode());
		result = prime * result + ((lvmDescrizione == null) ? 0 : lvmDescrizione.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_AnagLivelli){
			if(this.lvmCodice == ((MsvOA_AnagLivelli)obj).lvmCodice){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvOA_AnagLivelli[lvmCodice=" + lvmCodice + ", lvmDescrizione=" + lvmDescrizione + ", codiceCascino=" + codiceCascino + "]";
	}
}