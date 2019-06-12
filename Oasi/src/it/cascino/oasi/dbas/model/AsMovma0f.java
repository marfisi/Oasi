package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsMovma0fPKey;

/**
* The persistent class for the cas_dat/Movma0f database table.
* 
*/
@Entity(name = "Movma0f")
@NamedQueries({
	@NamedQuery(name = "AsMovma0f.findAll", query = "SELECT o FROM Movma0f o"),
	@NamedQuery(name = "AsMovma0f.findById", query = "SELECT o FROM Movma0f o WHERE o.id.vdatr = :vdatr and o.id.vcaus = :vcaus and o.id.vnura = :vnura and o.id.vnumd = :vnumd and o.id.vprog = :vprog")
})
public class AsMovma0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	@EmbeddedId
	private AsMovma0fPKey id;
	private String vcoda;
	private String vdesc;
	private BigDecimal vquan;
	private BigDecimal vprez;
	private BigDecimal vsco1;
	private BigDecimal vsco2;
	private BigDecimal vsco3;
	private BigDecimal vcost;
	private String vciva;
	private Integer vtime;
	private Integer vcocf;
	private Integer vndep;
	private String vstgi;
	private String atamov;
	
	public AsMovma0f(){
		this.id = new AsMovma0fPKey();
	}
	
	public AsMovma0fPKey getId(){
		return id;
	}
	
	public void setId(AsMovma0fPKey id){
		this.id = id;
	}
	
	public String getVcoda(){
		return vcoda;
	}
	
	public void setVcoda(String vcoda){
		this.vcoda = vcoda;
	}
	
	public String getVdesc(){
		return vdesc;
	}
	
	public void setVdesc(String vdesc){
		this.vdesc = vdesc;
	}
	
	public BigDecimal getVquan(){
		return vquan;
	}
	
	public void setVquan(BigDecimal vquan){
		this.vquan = vquan;
	}
	
	public BigDecimal getVprez(){
		return vprez;
	}
	
	public void setVprez(BigDecimal vprez){
		this.vprez = vprez;
	}
	
	public BigDecimal getVsco1(){
		return vsco1;
	}
	
	public void setVsco1(BigDecimal vsco1){
		this.vsco1 = vsco1;
	}
	
	public BigDecimal getVsco2(){
		return vsco2;
	}
	
	public void setVsco2(BigDecimal vsco2){
		this.vsco2 = vsco2;
	}
	
	public BigDecimal getVsco3(){
		return vsco3;
	}
	
	public void setVsco3(BigDecimal vsco3){
		this.vsco3 = vsco3;
	}
	
	public BigDecimal getVcost(){
		return vcost;
	}

	public void setVcost(BigDecimal vcost){
		this.vcost = vcost;
	}

	public String getVciva(){
		return vciva;
	}
	
	public void setVciva(String vciva){
		this.vciva = vciva;
	}
	
	public Integer getVtime(){
		return vtime;
	}

	public void setVtime(Integer vtime){
		this.vtime = vtime;
	}
	
	public Integer getVcocf(){
		return vcocf;
	}

	public void setVcocf(Integer vcocf){
		this.vcocf = vcocf;
	}
	
	public Integer getVndep(){
		return vndep;
	}

	public void setVndep(Integer vndep){
		this.vndep = vndep;
	}

	public String getVstgi(){
		return vstgi;
	}

	public void setVstgi(String vstgi){
		this.vstgi = vstgi;
	}

	public String getAtamov(){
		return atamov;
	}

	public void setAtamov(String atamov){
		this.atamov = atamov;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((vciva == null) ? 0 : vciva.hashCode());
		result = prime * result + ((vcoda == null) ? 0 : vcoda.hashCode());
		result = prime * result + ((vdesc == null) ? 0 : vdesc.hashCode());
		result = prime * result + ((vprez == null) ? 0 : vprez.hashCode());
		result = prime * result + ((vquan == null) ? 0 : vquan.hashCode());
		result = prime * result + ((vsco1 == null) ? 0 : vsco1.hashCode());
		result = prime * result + ((vsco2 == null) ? 0 : vsco2.hashCode());
		result = prime * result + ((vsco3 == null) ? 0 : vsco3.hashCode());	
		result = prime * result + ((vcost == null) ? 0 : vcost.hashCode());	
		result = prime * result + ((vtime == null) ? 0 : vtime.hashCode());
		result = prime * result + ((vcocf == null) ? 0 : vcocf.hashCode());
		result = prime * result + ((vndep == null) ? 0 : vndep.hashCode());
		result = prime * result + ((vstgi == null) ? 0 : vstgi.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsMovma0f) {
			if(this.id == ((AsMovma0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsMovma0f [id=" + id + ", vcoda=" + vcoda + ", vdesc=" + vdesc + ", vquan=" + vquan + ", vprez=" + vprez + ", vsco1=" + vsco1 + ", vsco2=" + vsco2 + ", vsco3=" + vsco3 + ", vcost=" + vcost + ", vciva=" + vciva + ", vtime=" + vtime + ", vcocf=" + vcocf + ", vndep=" + vndep + ", vstgi=" + vstgi + ", atamov=" + atamov + "]";
	}
}