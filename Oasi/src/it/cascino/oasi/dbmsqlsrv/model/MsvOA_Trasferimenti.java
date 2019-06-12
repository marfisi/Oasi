package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.*;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvOA_TrasferimentiPKey;

/**
* The persistent class for the OA_Trasferimenti database table.
* 
*/
@Entity(name="OA_Trasferimenti")
@NamedQueries({
	@NamedQuery(name = "MsvOA_Trasferimenti.findAll", query = "SELECT o FROM OA_Trasferimenti o order by o.data, o.id.idTes asc, o.id.idRig asc")
})
public class MsvOA_Trasferimenti implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private Timestamp data;
	@EmbeddedId
	private MsvOA_TrasferimentiPKey id;
	private String codBreveOasi;
	private String codLungoOasi;
	private String codCascino;
	private BigDecimal qta;
	private String codMagPartenza;
	private String codMagDestinazione;
	private String nota;

	public MsvOA_Trasferimenti(){		
	}

	public MsvOA_Trasferimenti(Timestamp data, MsvOA_TrasferimentiPKey id, String codBreveOasi, String codLungoOasi, String codCascino, BigDecimal qta, String codMagPartenza, String codMagDestinazione, String nota){
		super();
		this.data = data;
		this.id = id;
		this.codBreveOasi = codBreveOasi;
		this.codLungoOasi = codLungoOasi;
		this.codCascino = codCascino;
		this.qta = qta;
		this.codMagPartenza = codMagPartenza;
		this.codMagDestinazione = codMagDestinazione;
		this.nota = nota;
	}

	public Timestamp getData(){
		return data;
	}

	public void setData(Timestamp data){
		this.data = data;
	}

	public MsvOA_TrasferimentiPKey getId(){
		return id;
	}

	public void setId(MsvOA_TrasferimentiPKey id){
		this.id = id;
	}

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

	public String getCodCascino(){
		return codCascino;
	}

	public void setCodCascino(String codCascino){
		this.codCascino = codCascino;
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
		result = prime * result + ((codBreveOasi == null) ? 0 : codBreveOasi.hashCode());
		result = prime * result + ((codCascino == null) ? 0 : codCascino.hashCode());
		result = prime * result + ((codLungoOasi == null) ? 0 : codLungoOasi.hashCode());
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
		if(obj instanceof MsvOA_Trasferimenti){
			if(this.id == ((MsvOA_Trasferimenti)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvOA_Trasferimenti [data=" + data + ", id=" + id + ", codBreveOasi=" + codBreveOasi + ", codLungoOasi=" + codLungoOasi + ", codCascino=" + codCascino + ", qta=" + qta + ", codMagPartenza=" + codMagPartenza + ", codMagDestinazione=" + codMagDestinazione + ", nota=" + nota + "]";
	}
}