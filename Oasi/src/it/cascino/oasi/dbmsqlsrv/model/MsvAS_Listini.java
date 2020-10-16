package it.cascino.oasi.dbmsqlsrv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvAS_ListiniPKey;

/**
* The persistent class for the AS_Listini database table.
* 
*/
@Entity(
	name = "AS_Listini"
)
@NamedQueries(
	{@NamedQuery(
		name = "MsvAS_Listini.findAll",
		query = "SELECT o FROM AS_Listini o WHERE o.id.tipoListino != '' order by o.id.codArticolo asc, o.id.tipoListino asc"
	), @NamedQuery(
		name = "MsvAS_Listini.findByCodArticoloTipoListino",
		query = "SELECT o FROM AS_Listini o WHERE o.id.codArticolo = :codArticolo and o.id.tipoListino = :tipoListino"
	), @NamedQuery(
		name = "MsvAS_Listini.svuota",
		query = "DELETE FROM AS_Listini o WHERE o.id.tipoListino != ''"
	)
	}
)
public class MsvAS_Listini implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	@EmbeddedId
	private MsvAS_ListiniPKey id;
	private BigDecimal prezzoNonIvato;
	private BigDecimal sconto1;
	private BigDecimal sconto2;
	private BigDecimal sconto3;
	
	public MsvAS_Listini(){
		this.id = new MsvAS_ListiniPKey();
	}
	
	public MsvAS_ListiniPKey getId(){
		return id;
	}
	
	public void setId(MsvAS_ListiniPKey id){
		this.id = id;
	}
	
	public BigDecimal getPrezzoNonIvato(){
		return prezzoNonIvato;
	}
	
	public void setPrezzoNonIvato(BigDecimal prezzoNonIvato){
		this.prezzoNonIvato = prezzoNonIvato;
	}
	
	public BigDecimal getSconto1(){
		return sconto1;
	}
	
	public void setSconto1(BigDecimal sconto1){
		this.sconto1 = sconto1;
	}
	
	public BigDecimal getSconto2(){
		return sconto2;
	}
	
	public void setSconto2(BigDecimal sconto2){
		this.sconto2 = sconto2;
	}
	
	public BigDecimal getSconto3(){
		return sconto3;
	}
	
	public void setSconto3(BigDecimal sconto3){
		this.sconto3 = sconto3;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((prezzoNonIvato == null) ? 0 : prezzoNonIvato.hashCode());
		result = prime * result + ((sconto1 == null) ? 0 : sconto1.hashCode());
		result = prime * result + ((sconto2 == null) ? 0 : sconto2.hashCode());
		result = prime * result + ((sconto3 == null) ? 0 : sconto3.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_Listini){
			if(this.id == ((MsvAS_Listini)obj).id){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "MsvAS_Listini [id=" + id + ", prezzoNonIvato=" + prezzoNonIvato + ", sconto1=" + sconto1 + ", sconto2=" + sconto2 + ", sconto3=" + sconto3 + "]";
	}
	
}