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
	private Integer vdain;
	private Integer vorin;
	private String vcoda;
	private String vdesc;
	private Integer vcocf;
	private Integer vricl;
	private Integer vndep;
	private BigDecimal vquan;
	private BigDecimal vprez;
	private BigDecimal vsco1;
	private BigDecimal vsco2;
	private BigDecimal vsco3;
	private BigDecimal vsco4;
	private String vciva;
	private BigDecimal valiv;
	private BigDecimal vimps;
	private String vcocr;
	private String voven;
	private String vtcve;
	private BigDecimal vcost;
	private String vtpac;
	private String vvkit;
	private String vcusr;
	private String vcven;
	private String vidoa;
	private String vtimo;
	
	public AsMovma0f(){
		this.id = new AsMovma0fPKey();
	}
	
	public AsMovma0fPKey getId(){
		return id;
	}
	
	public void setId(AsMovma0fPKey id){
		this.id = id;
	}

	public Integer getVdain(){
		return vdain;
	}

	public void setVdain(Integer vdain){
		this.vdain = vdain;
	}

	public Integer getVorin(){
		return vorin;
	}

	public void setVorin(Integer vorin){
		this.vorin = vorin;
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

	public Integer getVcocf(){
		return vcocf;
	}

	public void setVcocf(Integer vcocf){
		this.vcocf = vcocf;
	}

	public Integer getVricl(){
		return vricl;
	}

	public void setVricl(Integer vricl){
		this.vricl = vricl;
	}

	public Integer getVndep(){
		return vndep;
	}

	public void setVndep(Integer vndep){
		this.vndep = vndep;
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

	public BigDecimal getVsco4(){
		return vsco4;
	}

	public void setVsco4(BigDecimal vsco4){
		this.vsco4 = vsco4;
	}

	public String getVciva(){
		return vciva;
	}

	public void setVciva(String vciva){
		this.vciva = vciva;
	}

	public BigDecimal getValiv(){
		return valiv;
	}

	public void setValiv(BigDecimal valiv){
		this.valiv = valiv;
	}

	public BigDecimal getVimps(){
		return vimps;
	}

	public void setVimps(BigDecimal vimps){
		this.vimps = vimps;
	}

	public String getVcocr(){
		return vcocr;
	}

	public void setVcocr(String vcocr){
		this.vcocr = vcocr;
	}

	public String getVoven(){
		return voven;
	}

	public void setVoven(String voven){
		this.voven = voven;
	}

	public String getVtcve(){
		return vtcve;
	}

	public void setVtcve(String vtcve){
		this.vtcve = vtcve;
	}

	public BigDecimal getVcost(){
		return vcost;
	}

	public void setVcost(BigDecimal vcost){
		this.vcost = vcost;
	}

	public String getVtpac(){
		return vtpac;
	}

	public void setVtpac(String vtpac){
		this.vtpac = vtpac;
	}

	public String getVvkit(){
		return vvkit;
	}

	public void setVvkit(String vvkit){
		this.vvkit = vvkit;
	}

	public String getVcusr(){
		return vcusr;
	}

	public void setVcusr(String vcusr){
		this.vcusr = vcusr;
	}

	public String getVcven(){
		return vcven;
	}

	public void setVcven(String vcven){
		this.vcven = vcven;
	}

	public String getVidoa(){
		return vidoa;
	}

	public void setVidoa(String vidoa){
		this.vidoa = vidoa;
	}

	public String getVtimo(){
		return vtimo;
	}

	public void setVtimo(String vtimo){
		this.vtimo = vtimo;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((valiv == null) ? 0 : valiv.hashCode());
		result = prime * result + ((vciva == null) ? 0 : vciva.hashCode());
		result = prime * result + ((vcocf == null) ? 0 : vcocf.hashCode());
		result = prime * result + ((vcocr == null) ? 0 : vcocr.hashCode());
		result = prime * result + ((vcoda == null) ? 0 : vcoda.hashCode());
		result = prime * result + ((vcost == null) ? 0 : vcost.hashCode());
		result = prime * result + ((vcusr == null) ? 0 : vcusr.hashCode());
		result = prime * result + ((vcven == null) ? 0 : vcven.hashCode());
		result = prime * result + ((vdain == null) ? 0 : vdain.hashCode());
		result = prime * result + ((vdesc == null) ? 0 : vdesc.hashCode());
		result = prime * result + ((vidoa == null) ? 0 : vidoa.hashCode());
		result = prime * result + ((vimps == null) ? 0 : vimps.hashCode());
		result = prime * result + ((vndep == null) ? 0 : vndep.hashCode());
		result = prime * result + ((vorin == null) ? 0 : vorin.hashCode());
		result = prime * result + ((voven == null) ? 0 : voven.hashCode());
		result = prime * result + ((vprez == null) ? 0 : vprez.hashCode());
		result = prime * result + ((vquan == null) ? 0 : vquan.hashCode());
		result = prime * result + ((vricl == null) ? 0 : vricl.hashCode());
		result = prime * result + ((vsco1 == null) ? 0 : vsco1.hashCode());
		result = prime * result + ((vsco2 == null) ? 0 : vsco2.hashCode());
		result = prime * result + ((vsco3 == null) ? 0 : vsco3.hashCode());
		result = prime * result + ((vsco4 == null) ? 0 : vsco4.hashCode());
		result = prime * result + ((vtcve == null) ? 0 : vtcve.hashCode());
		result = prime * result + ((vtimo == null) ? 0 : vtimo.hashCode());
		result = prime * result + ((vtpac == null) ? 0 : vtpac.hashCode());
		result = prime * result + ((vvkit == null) ? 0 : vvkit.hashCode());
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
		return "AsMovma0f [id=" + id + ", vdain=" + vdain + ", vorin=" + vorin + ", vcoda=" + vcoda + ", vdesc=" + vdesc + ", vcocf=" + vcocf + ", vricl=" + vricl + ", vndep=" + vndep + ", vquan=" + vquan + ", vprez=" + vprez + ", vsco1=" + vsco1 + ", vsco2=" + vsco2 + ", vsco3=" + vsco3 + ", vsco4=" + vsco4 + ", vciva=" + vciva + ", valiv=" + valiv + ", vimps=" + vimps + ", vcocr=" + vcocr + ", voven=" + voven + ", vtcve=" + vtcve + ", vcost=" + vcost + ", vtpac=" + vtpac + ", vvkit=" + vvkit + ", vcusr=" + vcusr + ", vcven=" + vcven + ", vidoa=" + vidoa + ", vtimo=" + vtimo + "]";
	}
}