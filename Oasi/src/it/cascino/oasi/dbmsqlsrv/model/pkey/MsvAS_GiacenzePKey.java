package it.cascino.oasi.dbmsqlsrv.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class MsvAS_GiacenzePKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String codArticolo;
	private String codDeposito;

	public MsvAS_GiacenzePKey(){
	}

	public MsvAS_GiacenzePKey(String codArticolo, String codDeposito){
		super();
		this.codArticolo = codArticolo;
		this.codDeposito = codDeposito;
	}

	public String getCodArticolo(){
		return codArticolo;
	}

	public void setCodArticolo(String codArticolo){
		this.codArticolo = codArticolo;
	}

	public String getCodDeposito(){
		return codDeposito;
	}

	public void setCodDeposito(String codDeposito){
		this.codDeposito = codDeposito;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codArticolo == null) ? 0 : codArticolo.hashCode());
		result = prime * result + ((codDeposito == null) ? 0 : codDeposito.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof MsvAS_GiacenzePKey){
			if((this.codArticolo == ((MsvAS_GiacenzePKey)obj).codArticolo)&&(this.codDeposito == ((MsvAS_GiacenzePKey)obj).codDeposito)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "MsvAS_GiacenzePKey [codArticolo=" + codArticolo + ", codDeposito=" + codDeposito + "]";
	}
}