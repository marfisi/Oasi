package it.cascino.oasi.dbmsqlsrv.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class MsvAS_ListiniPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String tipoListino;
	private String codArticolo;

	public MsvAS_ListiniPKey(){
	}

	public MsvAS_ListiniPKey(String tipoListino, String codArticolo){
		super();
		this.tipoListino = tipoListino;
		this.codArticolo = codArticolo;
	}

	public String getTipoListino(){
		return tipoListino;
	}

	public void setTipoListino(String tipoListino){
		this.tipoListino = tipoListino;
	}

	public String getCodArticolo(){
		return codArticolo;
	}

	public void setCodArticolo(String codArticolo){
		this.codArticolo = codArticolo;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codArticolo == null) ? 0 : codArticolo.hashCode());
		result = prime * result + ((tipoListino == null) ? 0 : tipoListino.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_ListiniPKey){
			if((this.codArticolo == ((MsvAS_ListiniPKey)obj).codArticolo)&&(this.tipoListino == ((MsvAS_ListiniPKey)obj).tipoListino)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvAS_ListiniPKey [tipoListino=" + tipoListino + ", codArticolo=" + codArticolo + "]";
	}
}