package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import it.cascino.oasi.dbas.model.pkey.AsFatem0fPKey;

/**
* The persistent class for the cas_dat/Fatem0f database table.
* 
*/
@Entity(name = "Fatem0f")
@NamedQueries({
	@NamedQuery(name = "AsFatem0f.findAll", query = "SELECT o FROM Fatem0f o"),
	@NamedQuery(name = "AsFatem0f.findById", query = "SELECT o FROM Fatem0f o WHERE o.id.fdatd = :fdatd and o.id.fnura = :fnura and o.id.fnumd = :fnumd"),
	@NamedQuery(name = "AsFatem0f.findByFdatdFnumdFcocl", query = "SELECT o FROM Fatem0f o WHERE o.id.fdatd = :fdatd and o.id.fnumd = :fnumd and o.fcocl = :fcocl")
})
public class AsFatem0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AsFatem0fPKey id;
	private BigDecimal fcocl;
	private BigDecimal fndep;
	private String ftifa;
	private Integer fcopa;
	private BigDecimal fimpf;
	private BigDecimal fmer1;
	private BigDecimal fmer2;
	private BigDecimal fmer3;
	private BigDecimal fmer4;
	private BigDecimal fmer5;
	private String fcos1;
	private BigDecimal fisp1;
	private String fcos2;
	private BigDecimal fisp2;
	private String fcos3;
	private BigDecimal fisp3;
	private String fciv1;
	private BigDecimal fimp1;
	private BigDecimal fiva1;
	private String fciv2;
	private BigDecimal fimp2;
	private BigDecimal fiva2;
	private String fciv3;
	private BigDecimal fimp3;
	private BigDecimal fiva3;
	private String fciv4;
	private BigDecimal fimp4;
	private BigDecimal fiva4;
	private String fciv5;
	private BigDecimal fimp5;
	private BigDecimal fiva5;
	private String fces1;
	private BigDecimal fime1;
	private String fces2;
	private BigDecimal fime2;
	private BigDecimal fipos;
	private BigDecimal fnupa;
	private BigDecimal fanpa;
	private String futen;
	private String fcauc;
	private String fcapa;
	private String fccam;
	
	public AsFatem0f(){
	}
	
	public AsFatem0f(AsFatem0fPKey id, BigDecimal fcocl, BigDecimal fndep, String ftifa, Integer fcopa, BigDecimal fimpf, BigDecimal fmer1, BigDecimal fmer2, BigDecimal fmer3, BigDecimal fmer4, BigDecimal fmer5, String fcos1, BigDecimal fisp1, String fcos2, BigDecimal fisp2, String fcos3, BigDecimal fisp3, String fciv1, BigDecimal fimp1, BigDecimal fiva1, String fciv2, BigDecimal fimp2, BigDecimal fiva2, String fciv3, BigDecimal fimp3, BigDecimal fiva3, String fciv4, BigDecimal fimp4, BigDecimal fiva4, String fciv5, BigDecimal fimp5, BigDecimal fiva5, String fces1, BigDecimal fime1, String fces2, BigDecimal fime2, BigDecimal fipos, BigDecimal fnupa, BigDecimal fanpa, String futen, String fcauc, String fcapa, String fccam){
		super();
		this.id = id;
		this.fcocl = fcocl;
		this.fndep = fndep;
		this.ftifa = ftifa;
		this.fcopa = fcopa;
		this.fimpf = fimpf;
		this.fmer1 = fmer1;
		this.fmer2 = fmer2;
		this.fmer3 = fmer3;
		this.fmer4 = fmer4;
		this.fmer5 = fmer5;
		this.fcos1 = fcos1;
		this.fisp1 = fisp1;
		this.fcos2 = fcos2;
		this.fisp2 = fisp2;
		this.fcos3 = fcos3;
		this.fisp3 = fisp3;
		this.fciv1 = fciv1;
		this.fimp1 = fimp1;
		this.fiva1 = fiva1;
		this.fciv2 = fciv2;
		this.fimp2 = fimp2;
		this.fiva2 = fiva2;
		this.fciv3 = fciv3;
		this.fimp3 = fimp3;
		this.fiva3 = fiva3;
		this.fciv4 = fciv4;
		this.fimp4 = fimp4;
		this.fiva4 = fiva4;
		this.fciv5 = fciv5;
		this.fimp5 = fimp5;
		this.fiva5 = fiva5;
		this.fces1 = fces1;
		this.fime1 = fime1;
		this.fces2 = fces2;
		this.fime2 = fime2;
		this.fipos = fipos;
		this.fnupa = fnupa;
		this.fanpa = fanpa;
		this.futen = futen;
		this.fcauc = fcauc;
		this.fcapa = fcapa;
		this.fccam = fccam;
	}

	public AsFatem0fPKey getId(){
		return id;
	}

	public void setId(AsFatem0fPKey id){
		this.id = id;
	}

	public BigDecimal getFcocl(){
		return fcocl;
	}

	public void setFcocl(BigDecimal fcocl){
		this.fcocl = fcocl;
	}

	public BigDecimal getFndep(){
		return fndep;
	}

	public void setFndep(BigDecimal fndep){
		this.fndep = fndep;
	}

	public String getFtifa(){
		return ftifa;
	}

	public void setFtifa(String ftifa){
		this.ftifa = ftifa;
	}

	public Integer getFcopa(){
		return fcopa;
	}

	public void setFcopa(Integer fcopa){
		this.fcopa = fcopa;
	}

	public BigDecimal getFimpf(){
		return fimpf;
	}

	public void setFimpf(BigDecimal fimpf){
		this.fimpf = fimpf;
	}

	public BigDecimal getFmer1(){
		return fmer1;
	}

	public void setFmer1(BigDecimal fmer1){
		this.fmer1 = fmer1;
	}

	public BigDecimal getFmer2(){
		return fmer2;
	}

	public void setFmer2(BigDecimal fmer2){
		this.fmer2 = fmer2;
	}

	public BigDecimal getFmer3(){
		return fmer3;
	}

	public void setFmer3(BigDecimal fmer3){
		this.fmer3 = fmer3;
	}

	public BigDecimal getFmer4(){
		return fmer4;
	}

	public void setFmer4(BigDecimal fmer4){
		this.fmer4 = fmer4;
	}

	public BigDecimal getFmer5(){
		return fmer5;
	}

	public void setFmer5(BigDecimal fmer5){
		this.fmer5 = fmer5;
	}

	public String getFcos1(){
		return fcos1;
	}

	public void setFcos1(String fcos1){
		this.fcos1 = fcos1;
	}

	public BigDecimal getFisp1(){
		return fisp1;
	}

	public void setFisp1(BigDecimal fisp1){
		this.fisp1 = fisp1;
	}

	public String getFcos2(){
		return fcos2;
	}

	public void setFcos2(String fcos2){
		this.fcos2 = fcos2;
	}

	public BigDecimal getFisp2(){
		return fisp2;
	}

	public void setFisp2(BigDecimal fisp2){
		this.fisp2 = fisp2;
	}

	public String getFcos3(){
		return fcos3;
	}

	public void setFcos3(String fcos3){
		this.fcos3 = fcos3;
	}

	public BigDecimal getFisp3(){
		return fisp3;
	}

	public void setFisp3(BigDecimal fisp3){
		this.fisp3 = fisp3;
	}

	public String getFciv1(){
		return fciv1;
	}

	public void setFciv1(String fciv1){
		this.fciv1 = fciv1;
	}

	public BigDecimal getFimp1(){
		return fimp1;
	}

	public void setFimp1(BigDecimal fimp1){
		this.fimp1 = fimp1;
	}

	public BigDecimal getFiva1(){
		return fiva1;
	}

	public void setFiva1(BigDecimal fiva1){
		this.fiva1 = fiva1;
	}

	public String getFciv2(){
		return fciv2;
	}

	public void setFciv2(String fciv2){
		this.fciv2 = fciv2;
	}

	public BigDecimal getFimp2(){
		return fimp2;
	}

	public void setFimp2(BigDecimal fimp2){
		this.fimp2 = fimp2;
	}

	public BigDecimal getFiva2(){
		return fiva2;
	}

	public void setFiva2(BigDecimal fiva2){
		this.fiva2 = fiva2;
	}

	public String getFciv3(){
		return fciv3;
	}

	public void setFciv3(String fciv3){
		this.fciv3 = fciv3;
	}

	public BigDecimal getFimp3(){
		return fimp3;
	}

	public void setFimp3(BigDecimal fimp3){
		this.fimp3 = fimp3;
	}

	public BigDecimal getFiva3(){
		return fiva3;
	}

	public void setFiva3(BigDecimal fiva3){
		this.fiva3 = fiva3;
	}

	public String getFciv4(){
		return fciv4;
	}

	public void setFciv4(String fciv4){
		this.fciv4 = fciv4;
	}

	public BigDecimal getFimp4(){
		return fimp4;
	}

	public void setFimp4(BigDecimal fimp4){
		this.fimp4 = fimp4;
	}

	public BigDecimal getFiva4(){
		return fiva4;
	}

	public void setFiva4(BigDecimal fiva4){
		this.fiva4 = fiva4;
	}

	public String getFciv5(){
		return fciv5;
	}

	public void setFciv5(String fciv5){
		this.fciv5 = fciv5;
	}

	public BigDecimal getFimp5(){
		return fimp5;
	}

	public void setFimp5(BigDecimal fimp5){
		this.fimp5 = fimp5;
	}

	public BigDecimal getFiva5(){
		return fiva5;
	}

	public void setFiva5(BigDecimal fiva5){
		this.fiva5 = fiva5;
	}

	public String getFces1(){
		return fces1;
	}

	public void setFces1(String fces1){
		this.fces1 = fces1;
	}

	public BigDecimal getFime1(){
		return fime1;
	}

	public void setFime1(BigDecimal fime1){
		this.fime1 = fime1;
	}

	public String getFces2(){
		return fces2;
	}

	public void setFces2(String fces2){
		this.fces2 = fces2;
	}

	public BigDecimal getFime2(){
		return fime2;
	}

	public void setFime2(BigDecimal fime2){
		this.fime2 = fime2;
	}

	public BigDecimal getFipos(){
		return fipos;
	}

	public void setFipos(BigDecimal fipos){
		this.fipos = fipos;
	}

	public BigDecimal getFnupa(){
		return fnupa;
	}

	public void setFnupa(BigDecimal fnupa){
		this.fnupa = fnupa;
	}

	public BigDecimal getFanpa(){
		return fanpa;
	}

	public void setFanpa(BigDecimal fanpa){
		this.fanpa = fanpa;
	}

	public String getFuten(){
		return futen;
	}

	public void setFuten(String futen){
		this.futen = futen;
	}

	public String getFcauc(){
		return fcauc;
	}

	public void setFcauc(String fcauc){
		this.fcauc = fcauc;
	}

	public String getFcapa(){
		return fcapa;
	}

	public void setFcapa(String fcapa){
		this.fcapa = fcapa;
	}

	public String getFccam(){
		return fccam;
	}

	public void setFccam(String fccam){
		this.fccam = fccam;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fanpa == null) ? 0 : fanpa.hashCode());
		result = prime * result + ((fcapa == null) ? 0 : fcapa.hashCode());
		result = prime * result + ((fcauc == null) ? 0 : fcauc.hashCode());
		result = prime * result + ((fces1 == null) ? 0 : fces1.hashCode());
		result = prime * result + ((fces2 == null) ? 0 : fces2.hashCode());
		result = prime * result + ((fciv1 == null) ? 0 : fciv1.hashCode());
		result = prime * result + ((fciv2 == null) ? 0 : fciv2.hashCode());
		result = prime * result + ((fciv3 == null) ? 0 : fciv3.hashCode());
		result = prime * result + ((fciv4 == null) ? 0 : fciv4.hashCode());
		result = prime * result + ((fciv5 == null) ? 0 : fciv5.hashCode());
		result = prime * result + ((fcocl == null) ? 0 : fcocl.hashCode());
		result = prime * result + ((fcopa == null) ? 0 : fcopa.hashCode());
		result = prime * result + ((fcos1 == null) ? 0 : fcos1.hashCode());
		result = prime * result + ((fcos2 == null) ? 0 : fcos2.hashCode());
		result = prime * result + ((fcos3 == null) ? 0 : fcos3.hashCode());
		result = prime * result + ((fime1 == null) ? 0 : fime1.hashCode());
		result = prime * result + ((fime2 == null) ? 0 : fime2.hashCode());
		result = prime * result + ((fimp1 == null) ? 0 : fimp1.hashCode());
		result = prime * result + ((fimp2 == null) ? 0 : fimp2.hashCode());
		result = prime * result + ((fimp3 == null) ? 0 : fimp3.hashCode());
		result = prime * result + ((fimp4 == null) ? 0 : fimp4.hashCode());
		result = prime * result + ((fimp5 == null) ? 0 : fimp5.hashCode());
		result = prime * result + ((fimpf == null) ? 0 : fimpf.hashCode());
		result = prime * result + ((fipos == null) ? 0 : fipos.hashCode());
		result = prime * result + ((fisp1 == null) ? 0 : fisp1.hashCode());
		result = prime * result + ((fisp2 == null) ? 0 : fisp2.hashCode());
		result = prime * result + ((fisp3 == null) ? 0 : fisp3.hashCode());
		result = prime * result + ((fiva1 == null) ? 0 : fiva1.hashCode());
		result = prime * result + ((fiva2 == null) ? 0 : fiva2.hashCode());
		result = prime * result + ((fiva3 == null) ? 0 : fiva3.hashCode());
		result = prime * result + ((fiva4 == null) ? 0 : fiva4.hashCode());
		result = prime * result + ((fiva5 == null) ? 0 : fiva5.hashCode());
		result = prime * result + ((fmer1 == null) ? 0 : fmer1.hashCode());
		result = prime * result + ((fmer2 == null) ? 0 : fmer2.hashCode());
		result = prime * result + ((fmer3 == null) ? 0 : fmer3.hashCode());
		result = prime * result + ((fmer4 == null) ? 0 : fmer4.hashCode());
		result = prime * result + ((fmer5 == null) ? 0 : fmer5.hashCode());
		result = prime * result + ((fndep == null) ? 0 : fndep.hashCode());
		result = prime * result + ((fnupa == null) ? 0 : fnupa.hashCode());
		result = prime * result + ((ftifa == null) ? 0 : ftifa.hashCode());
		result = prime * result + ((futen == null) ? 0 : futen.hashCode());
		result = prime * result + ((fccam == null) ? 0 : fccam.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsFatem0f) {
			if(this.id == ((AsFatem0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsFatem0f [id=" + id + ", fcocl=" + fcocl + ", fndep=" + fndep + ", ftifa=" + ftifa + ", fcopa=" + fcopa + ", fimpf=" + fimpf + ", fmer1=" + fmer1 + ", fmer2=" + fmer2 + ", fmer3=" + fmer3 + ", fmer4=" + fmer4 + ", fmer5=" + fmer5 + ", fcos1=" + fcos1 + ", fisp1=" + fisp1 + ", fcos2=" + fcos2 + ", fisp2=" + fisp2 + ", fcos3=" + fcos3 + ", fisp3=" + fisp3 + ", fciv1=" + fciv1 + ", fimp1=" + fimp1 + ", fiva1=" + fiva1 + ", fciv2=" + fciv2 + ", fimp2=" + fimp2 + ", fiva2=" + fiva2 + ", fciv3=" + fciv3 + ", fimp3=" + fimp3 + ", fiva3=" + fiva3 + ", fciv4=" + fciv4 + ", fimp4=" + fimp4 + ", fiva4=" + fiva4 + ", fciv5=" + fciv5 + ", fimp5=" + fimp5 + ", fiva5=" + fiva5 + ", fces1=" + fces1 + ", fime1=" + fime1 + ", fces2=" + fces2 + ", fime2=" + fime2 + ", fipos=" + fipos + ", fnupa=" + fnupa + ", fanpa=" + fanpa + ", futen=" + futen + ", fcauc=" + fcauc + ", fcapa=" + fcapa + ", fccam=" + fccam + "]";
	}
}