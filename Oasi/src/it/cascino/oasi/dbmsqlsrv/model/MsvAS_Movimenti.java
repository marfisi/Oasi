package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
// import java.time.Timestamp;
import javax.persistence.*;

/**
* The persistent class for the AS_Movimenti database table.
* 
*/
@Entity(
	name = "AS_Movimenti"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvAS_Movimenti.findAll",
		query = "SELECT o FROM AS_Movimenti o WHERE o.rdIdUnivoco != '' order by o.rdIdUnivoco asc"
	), @NamedQuery(
		name = "MsvAS_Movimenti.svuota",
		query = "DELETE FROM AS_Movimenti o WHERE o.rdIdUnivoco != ''"
	)
	}
)
public class MsvAS_Movimenti implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	private Timestamp rdDataReg;
	private String rdCausale;
	private String rdCodCliFor;
	private String rdCodMag;
	private String rdCodArticolo;
	private BigDecimal rdQta;
	private BigDecimal rdPrezzoNetto;
	private String rdTipoPrezzo;
	private String rdCodiceIva;
	private BigDecimal rdCosto;
	private String rdNroDoc;
	private Timestamp rdDataDoc;
	private String rdIdUnivoco;
	
	public MsvAS_Movimenti(){
	}
	
	public Timestamp getRdDataReg(){
		return rdDataReg;
	}
	
	public void setRdDataReg(Timestamp rdDataReg){
		this.rdDataReg = rdDataReg;
	}
	
	public String getRdCausale(){
		return rdCausale;
	}
	
	public void setRdCausale(String rdCausale){
		this.rdCausale = rdCausale;
	}
	
	public String getRdCodCliFor(){
		return rdCodCliFor;
	}
	
	public void setRdCodCliFor(String rdCodCliFor){
		this.rdCodCliFor = rdCodCliFor;
	}
	
	public String getRdCodMag(){
		return rdCodMag;
	}
	
	public void setRdCodMag(String rdCodMag){
		this.rdCodMag = rdCodMag;
	}
	
	public String getRdCodArticolo(){
		return rdCodArticolo;
	}
	
	public void setRdCodArticolo(String rdCodArticolo){
		this.rdCodArticolo = rdCodArticolo;
	}
	
	public BigDecimal getRdQta(){
		return rdQta;
	}
	
	public void setRdQta(BigDecimal rdQta){
		this.rdQta = rdQta;
	}
	
	public BigDecimal getRdPrezzoNetto(){
		return rdPrezzoNetto;
	}
	
	public void setRdPrezzoNetto(BigDecimal rdPrezzoNetto){
		this.rdPrezzoNetto = rdPrezzoNetto;
	}
	
	public String getRdTipoPrezzo(){
		return rdTipoPrezzo;
	}
	
	public void setRdTipoPrezzo(String rdTipoPrezzo){
		this.rdTipoPrezzo = rdTipoPrezzo;
	}
	
	public String getRdCodiceIva(){
		return rdCodiceIva;
	}
	
	public void setRdCodiceIva(String rdCodiceIva){
		this.rdCodiceIva = rdCodiceIva;
	}
	
	public BigDecimal getRdCosto(){
		return rdCosto;
	}
	
	public void setRdCosto(BigDecimal rdCosto){
		this.rdCosto = rdCosto;
	}
	
	public String getRdNroDoc(){
		return rdNroDoc;
	}
	
	public void setRdNroDoc(String rdNroDoc){
		this.rdNroDoc = rdNroDoc;
	}
	
	public Timestamp getRdDataDoc(){
		return rdDataDoc;
	}
	
	public void setRdDataDoc(Timestamp rdDataDoc){
		this.rdDataDoc = rdDataDoc;
	}
	
	@Id
	public String getRdIdUnivoco(){
		return rdIdUnivoco;
	}
	
	public void setRdIdUnivoco(String rdIdUnivoco){
		this.rdIdUnivoco = rdIdUnivoco;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rdCausale == null) ? 0 : rdCausale.hashCode());
		result = prime * result + ((rdCodArticolo == null) ? 0 : rdCodArticolo.hashCode());
		result = prime * result + ((rdCodCliFor == null) ? 0 : rdCodCliFor.hashCode());
		result = prime * result + ((rdCodMag == null) ? 0 : rdCodMag.hashCode());
		result = prime * result + ((rdCodiceIva == null) ? 0 : rdCodiceIva.hashCode());
		result = prime * result + ((rdCosto == null) ? 0 : rdCosto.hashCode());
		result = prime * result + ((rdDataDoc == null) ? 0 : rdDataDoc.hashCode());
		result = prime * result + ((rdDataReg == null) ? 0 : rdDataReg.hashCode());
		result = prime * result + ((rdIdUnivoco == null) ? 0 : rdIdUnivoco.hashCode());
		result = prime * result + ((rdNroDoc == null) ? 0 : rdNroDoc.hashCode());
		result = prime * result + ((rdPrezzoNetto == null) ? 0 : rdPrezzoNetto.hashCode());
		result = prime * result + ((rdQta == null) ? 0 : rdQta.hashCode());
		result = prime * result + ((rdTipoPrezzo == null) ? 0 : rdTipoPrezzo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_Movimenti){
			if(this.rdIdUnivoco == ((MsvAS_Movimenti)obj).rdIdUnivoco){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvAS_Movimenti [rdDataReg=" + rdDataReg + ", rdCausale=" + rdCausale + ", rdCodCliFor=" + rdCodCliFor + ", rdCodMag=" + rdCodMag + ", rdCodArticolo=" + rdCodArticolo + ", rdQta=" + rdQta + ", rdPrezzoNetto=" + rdPrezzoNetto + ", rdTipoPrezzo=" + rdTipoPrezzo + ", rdCodiceIva=" + rdCodiceIva + ", rdCosto=" + rdCosto + ", rdNroDoc=" + rdNroDoc + ", rdDataDoc=" + rdDataDoc + ", rdIdUnivoco=" + rdIdUnivoco + "]";
	}
}