package it.cascino.oasi.dbas.model.pkey;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Embeddable;

@Embeddable
public class AsFisca00fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal ficcfo;
	private String fitcfo;

	public AsFisca00fPKey(){
	}

	public BigDecimal getFiccfo(){
		return ficcfo;
	}

	public void setFiccfo(BigDecimal ficcfo){
		this.ficcfo = ficcfo;
	}

	public String getFitcfo(){
		return fitcfo;
	}

	public void setFitcfo(String fitcfo){
		this.fitcfo = fitcfo;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ficcfo == null) ? 0 : ficcfo.hashCode());
		result = prime * result + ((fitcfo == null) ? 0 : fitcfo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsFisca00fPKey){
			if((this.ficcfo == ((AsFisca00fPKey)obj).ficcfo)&&(this.fitcfo == ((AsFisca00fPKey)obj).fitcfo)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsFisca00fPKey [ficcfo=" + ficcfo + ", fitcfo=" + fitcfo + "]";
	}
}
