package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the cas_dat/anma20f database table.
* 
*/
@Entity(name="Anma20f")
@NamedQueries({
	@NamedQuery(name = "AsAnma20f.findAll", query = "SELECT o FROM Anma20f o order by o.m2cod asc"),
	@NamedQuery(name = "AsAnma20f.findByM2cod", query = "SELECT o FROM Anma20f o WHERE o.m2cod = :m2cod"),
	@NamedQuery(name = "AsAnma20f.findByM2oas", query = "SELECT o FROM Anma20f o WHERE o.m2oas = :m2oas order by o.m2cod asc")
})
public class AsAnma20f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private String m2cod;
	private String m2div;
	private String m2gru;
	private String m2sot;
	private String m2fam;
	private String m2stf;
	private String m2st1;
	private String m2b2b;
	private String m2cat;
	private String m2aag;
	private String m2oas;
	private String m2kas;
	
	public AsAnma20f(){
	}
	
	@Id
	public String getM2cod(){
		return m2cod;
	}

	public void setM2cod(String m2cod){
		this.m2cod = m2cod;
	}

	public String getM2div(){
		return m2div;
	}

	public void setM2div(String m2div){
		this.m2div = m2div;
	}

	public String getM2gru(){
		return m2gru;
	}

	public void setM2gru(String m2gru){
		this.m2gru = m2gru;
	}

	public String getM2sot(){
		return m2sot;
	}

	public void setM2sot(String m2sot){
		this.m2sot = m2sot;
	}

	public String getM2fam(){
		return m2fam;
	}

	public void setM2fam(String m2fam){
		this.m2fam = m2fam;
	}

	public String getM2stf(){
		return m2stf;
	}

	public void setM2stf(String m2stf){
		this.m2stf = m2stf;
	}

	public String getM2st1(){
		return m2st1;
	}

	public void setM2st1(String m2st1){
		this.m2st1 = m2st1;
	}

	public String getM2b2b(){
		return m2b2b;
	}

	public void setM2b2b(String m2b2b){
		this.m2b2b = m2b2b;
	}

	public String getM2cat(){
		return m2cat;
	}

	public void setM2cat(String m2cat){
		this.m2cat = m2cat;
	}

	public String getM2aag(){
		return m2aag;
	}

	public void setM2aag(String m2aag){
		this.m2aag = m2aag;
	}
	
	public String getM2oas(){
		return m2oas;
	}

	public void setM2oas(String m2oas){
		this.m2oas = m2oas;
	}

	public String getM2kas(){
		return m2kas;
	}

	public void setM2kas(String m2kas){
		this.m2kas = m2kas;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m2aag == null) ? 0 : m2aag.hashCode());
		result = prime * result + ((m2b2b == null) ? 0 : m2b2b.hashCode());
		result = prime * result + ((m2cat == null) ? 0 : m2cat.hashCode());
		result = prime * result + ((m2cod == null) ? 0 : m2cod.hashCode());
		result = prime * result + ((m2div == null) ? 0 : m2div.hashCode());
		result = prime * result + ((m2fam == null) ? 0 : m2fam.hashCode());
		result = prime * result + ((m2gru == null) ? 0 : m2gru.hashCode());
		result = prime * result + ((m2sot == null) ? 0 : m2sot.hashCode());
		result = prime * result + ((m2st1 == null) ? 0 : m2st1.hashCode());
		result = prime * result + ((m2stf == null) ? 0 : m2stf.hashCode());
		result = prime * result + ((m2oas == null) ? 0 : m2oas.hashCode());
		result = prime * result + ((m2kas == null) ? 0 : m2kas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsAnma20f){
			if(this.m2cod == ((AsAnma20f)obj).m2cod){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsAnma20f [m2cod=" + m2cod + ", m2div=" + m2div + ", m2gru=" + m2gru + ", m2sot=" + m2sot + ", m2fam=" + m2fam + ", m2stf=" + m2stf + ", m2st1=" + m2st1 + ", m2b2b=" + m2b2b + ", m2cat=" + m2cat + ", m2aag=" + m2aag + ", m2oas=" + m2oas + ", m2kas=" + m2kas + "]";
	}
}