package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the AS_Barcode database table.
* 
*/
@Entity(name="AS_Barcode")
@NamedQueries({
	@NamedQuery(name = "MsvAS_Barcode.findAll", query = "SELECT a FROM AS_Barcode a WHERE a.barcode != '' order by a.articolo, a.barcode asc"),
	@NamedQuery(name = "MsvAS_Barcode.findByCodArticoloBarcode", query = "SELECT a FROM AS_Barcode a WHERE a.articolo = :articolo and a.barcode = :barcode"),
	@NamedQuery(name = "MsvAS_Barcode.svuota", query = "DELETE FROM AS_Barcode a WHERE a.barcode != ''")
})
public class MsvAS_Barcode implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private String articolo;
	private String barcode;

	public MsvAS_Barcode(){
	}
	
	public MsvAS_Barcode(String articolo, String barcode){
		super();
		this.articolo = articolo;
		this.barcode = barcode;
	}

	public String getArticolo(){
		return articolo;
	}

	public void setArticolo(String articolo){
		this.articolo = articolo;
	}

	@Id
	public String getBarcode(){
		return barcode;
	}

	public void setBarcode(String barcode){
		this.barcode = barcode;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((articolo == null) ? 0 : articolo.hashCode());
		result = prime * result + ((barcode == null) ? 0 : barcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_Barcode){
			if(this.barcode == ((MsvAS_Barcode)obj).barcode){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvAS_Barcode [articolo=" + articolo + ", barcode=" + barcode + "]";
	}
}