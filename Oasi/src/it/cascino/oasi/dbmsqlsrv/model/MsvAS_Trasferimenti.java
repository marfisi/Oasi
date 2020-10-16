package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.*;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvAS_TrasferimentiPKey;

/**
* The persistent class for the AS_Trasferimenti database table.
* 
*/
@Entity(
	name = "AS_Trasferimenti"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvAS_Trasferimenti.findAll",
		query = "SELECT o FROM AS_Trasferimenti o WHERE o.codArticolo != '' order by o.id.idTes asc, o.id.idRig asc"
	), @NamedQuery(
		name = "MsvAS_Trasferimenti.svuota",
		query = "DELETE FROM AS_Trasferimenti o WHERE o.codArticolo != ''"
	)
	}
)
public class MsvAS_Trasferimenti implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	private Timestamp data;
	@EmbeddedId
	private MsvAS_TrasferimentiPKey id;
	private String codArticolo;
	private BigDecimal qta;
	private String codMagPartenza;
	private String codMagDestinazione;
	private String nota;
	
	public MsvAS_Trasferimenti(){
	}
	
	public Timestamp getData(){
		return data;
	}
	
	public void setData(Timestamp data){
		this.data = data;
	}
	
	public MsvAS_TrasferimentiPKey getId(){
		return id;
	}
	
	public void setId(MsvAS_TrasferimentiPKey id){
		this.id = id;
	}
	
	public String getCodArticolo(){
		return codArticolo;
	}
	
	public void setCodArticolo(String codArticolo){
		this.codArticolo = codArticolo;
	}
	
	public BigDecimal getQta(){
		return qta;
	}
	
	public void setQta(BigDecimal qta){
		this.qta = qta;
	}
	
	public String getCodMagPartenza(){
		return codMagPartenza;
	}
	
	public void setCodMagPartenza(String codMagPartenza){
		this.codMagPartenza = codMagPartenza;
	}
	
	public String getCodMagDestinazione(){
		return codMagDestinazione;
	}
	
	public void setCodMagDestinazione(String codMagDestinazione){
		this.codMagDestinazione = codMagDestinazione;
	}
	
	public String getNota(){
		return nota;
	}
	
	public void setNota(String nota){
		this.nota = nota;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codArticolo == null) ? 0 : codArticolo.hashCode());
		result = prime * result + ((codMagDestinazione == null) ? 0 : codMagDestinazione.hashCode());
		result = prime * result + ((codMagPartenza == null) ? 0 : codMagPartenza.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nota == null) ? 0 : nota.hashCode());
		result = prime * result + ((qta == null) ? 0 : qta.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_Trasferimenti){
			if(this.id == ((MsvAS_Trasferimenti)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvAS_Trasferimenti [data=" + data + ", id=" + id + ", codArticolo=" + codArticolo + ", qta=" + qta + ", codMagPartenza=" + codMagPartenza + ", codMagDestinazione=" + codMagDestinazione + ", nota=" + nota + "]";
	}
}