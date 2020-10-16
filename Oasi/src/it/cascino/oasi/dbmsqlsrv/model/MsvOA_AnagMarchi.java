package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the OA_AnagMarchi database table.
* 
*/
@Entity(
	name = "OA_AnagMarchi"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvOA_AnagMarchi.findAll",
		query = "SELECT o FROM OA_AnagMarchi o WHERE o.mchCodice != '' order by o.mchCodice asc"
	), @NamedQuery(
		name = "MsvOA_AnagMarchi.findByMchCodice",
		query = "SELECT o FROM OA_AnagMarchi o WHERE o.mchCodice = :mchCodice"
	), @NamedQuery(
		name = "MsvOA_AnagMarchi.findByCodiceCascino",
		query = "SELECT o FROM OA_AnagMarchi o WHERE o.codiceCascino = :codiceCascino"
	)
	}
)
public class MsvOA_AnagMarchi implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	private String mchCodice;
	private String mchDescrizione;
	private String codiceCascino;
	
	public MsvOA_AnagMarchi(){
	}
	
	@Id
	public String getMchCodice(){
		return mchCodice;
	}
	
	public void setMchCodice(String mchCodice){
		this.mchCodice = mchCodice;
	}
	
	public String getMchDescrizione(){
		return mchDescrizione;
	}
	
	public void setMchDescrizione(String mchDescrizione){
		this.mchDescrizione = mchDescrizione;
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
		result = prime * result + ((mchCodice == null) ? 0 : mchCodice.hashCode());
		result = prime * result + ((mchDescrizione == null) ? 0 : mchDescrizione.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvOA_AnagMarchi){
			if(this.mchCodice == ((MsvOA_AnagMarchi)obj).mchCodice){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvOA_AnagMarchi [mchCodice=" + mchCodice + ", mchDescrizione=" + mchDescrizione + ", codiceCascino=" + codiceCascino + "]";
	}
}