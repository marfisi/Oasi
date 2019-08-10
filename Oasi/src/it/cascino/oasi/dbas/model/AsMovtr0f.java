package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsMovtr0fPKey;

/**
* The persistent class for the cas_dat/Movtr0f database table.
* 
*/
@Entity(name = "Movtr0f")
@NamedQueries({
	@NamedQuery(name = "AsMovtr0f.findAll", query = "SELECT o FROM Movtr0f o"),
	@NamedQuery(name = "AsMovtr0f.findById", query = "SELECT o FROM Movtr0f o WHERE o.id.mtdat = :mtdat and o.id.mtnuz = :mtnuz and o.id.mtnum = :mtnum and o.id.mtnur = :mtnur"),
	@NamedQuery(name = "AsMovtr0f.findByMtdatMtdpaMtute", query = "SELECT o FROM Movtr0f o WHERE o.id.mtdat = :mtdat and o.mtdpp = :mtdpp and o.mtute = :mtute"),
	@NamedQuery(name = "AsMovtr0f.findByMtdatMtdppMtdpaMtuteMtcod", query = "SELECT o FROM Movtr0f o WHERE o.id.mtdat >= :mtdat and o.mtdpp = :mtdpp and o.mtdpa = :mtdpa and o.mtute = :mtute and o.mtcod = :mtcod and o.mtsta = '' order by o.id.mtnur asc")
})
public class AsMovtr0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	@EmbeddedId
	private AsMovtr0fPKey id;
	private String mtcod;
	private BigDecimal mtqua;
	private BigDecimal mtqri; 
	private Integer mtdpp;
	private Integer mtdpa; 
	private Integer mtime;
	private String mtute;
	private String mtutr;
	private String mtsta;
	private Integer mtdar;
	private Integer mtimr;
	private String mtumi;
	
	public AsMovtr0f(){
		this.id = new AsMovtr0fPKey();
	}

	public AsMovtr0f(AsMovtr0fPKey id, String mtcod, BigDecimal mtqua, BigDecimal mtqri, Integer mtdpp, Integer mtdpa, Integer mtime, String mtute, String mtutr, String mtsta, Integer mtdar, Integer mtimr, String mtumi){
		super();
		this.id = id;
		this.mtcod = mtcod;
		this.mtqua = mtqua;
		this.mtqri = mtqri;
		this.mtdpp = mtdpp;
		this.mtdpa = mtdpa;
		this.mtime = mtime;
		this.mtute = mtute;
		this.mtutr = mtutr;
		this.mtsta = mtsta;
		this.mtdar = mtdar;
		this.mtimr = mtimr;
		this.mtumi = mtumi;
	}

	public AsMovtr0fPKey getId(){
		return id;
	}

	public void setId(AsMovtr0fPKey id){
		this.id = id;
	}

	public String getMtcod(){
		return mtcod;
	}

	public void setMtcod(String mtcod){
		this.mtcod = mtcod;
	}

	public BigDecimal getMtqua(){
		return mtqua;
	}

	public void setMtqua(BigDecimal mtqua){
		this.mtqua = mtqua;
	}

	public BigDecimal getMtqri(){
		return mtqri;
	}

	public void setMtqri(BigDecimal mtqri){
		this.mtqri = mtqri;
	}

	public Integer getMtdpp(){
		return mtdpp;
	}

	public void setMtdpp(Integer mtdpp){
		this.mtdpp = mtdpp;
	}

	public Integer getMtdpa(){
		return mtdpa;
	}

	public void setMtdpa(Integer mtdpa){
		this.mtdpa = mtdpa;
	}

	public Integer getMtime(){
		return mtime;
	}

	public void setMtime(Integer mtime){
		this.mtime = mtime;
	}

	public String getMtute(){
		return mtute;
	}

	public void setMtute(String mtute){
		this.mtute = mtute;
	}

	public String getMtutr(){
		return mtutr;
	}

	public void setMtutr(String mtutr){
		this.mtutr = mtutr;
	}

	public String getMtsta(){
		return mtsta;
	}

	public void setMtsta(String mtsta){
		this.mtsta = mtsta;
	}

	public Integer getMtdar(){
		return mtdar;
	}

	public void setMtdar(Integer mtdar){
		this.mtdar = mtdar;
	}

	public Integer getMtimr(){
		return mtimr;
	}

	public void setMtimr(Integer mtimr){
		this.mtimr = mtimr;
	}

	public String getMtumi(){
		return mtumi;
	}

	public void setMtumi(String mtumi){
		this.mtumi = mtumi;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mtcod == null) ? 0 : mtcod.hashCode());
		result = prime * result + ((mtdar == null) ? 0 : mtdar.hashCode());
		result = prime * result + ((mtdpa == null) ? 0 : mtdpa.hashCode());
		result = prime * result + ((mtdpp == null) ? 0 : mtdpp.hashCode());
		result = prime * result + ((mtime == null) ? 0 : mtime.hashCode());
		result = prime * result + ((mtimr == null) ? 0 : mtimr.hashCode());
		result = prime * result + ((mtqri == null) ? 0 : mtqri.hashCode());
		result = prime * result + ((mtqua == null) ? 0 : mtqua.hashCode());
		result = prime * result + ((mtsta == null) ? 0 : mtsta.hashCode());
		result = prime * result + ((mtute == null) ? 0 : mtute.hashCode());
		result = prime * result + ((mtutr == null) ? 0 : mtutr.hashCode());
		result = prime * result + ((mtumi == null) ? 0 : mtumi.hashCode());
			return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsMovtr0f) {
			if(this.id == ((AsMovtr0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsMovtr0f [id=" + id + ", mtcod=" + mtcod + ", mtqua=" + mtqua + ", mtqri=" + mtqri + ", mtdpp=" + mtdpp + ", mtdpa=" + mtdpa + ", mtime=" + mtime + ", mtute=" + mtute + ", mtutr=" + mtutr + ", mtsta=" + mtsta + ", mtdar=" + mtdar + ", mtimr=" + mtimr + ", mtumi=" + mtumi + "]";
	}
}