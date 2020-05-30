package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
* The persistent class for the cas_dat/anmag0f database table.
* 
*/
@Entity(name="Anmag0f")
@NamedQueries({
	@NamedQuery(name = "AsAnmag0f.findAll", query = "SELECT a FROM Anmag0f a WHERE a.atama != 'A' and a.atama != 'S' order by a.mcoda asc"),
	@NamedQuery(name = "AsAnmag0f.findByMcoda", query = "SELECT a FROM Anmag0f a WHERE a.atama != 'S' and a.mcoda = :mcoda "),
	@NamedQuery(name = "AsAnmag0f.findAllIngrosso", query = "SELECT a FROM Anmag0f a WHERE a.atama in (' ', 'A') and ((a.mdepi = 1) or (a.mdepi = 3)) order by a.mcoda asc"),
	@NamedQuery(name = "AsAnmag0f.findAttivi", query = "SELECT a FROM Anmag0f a WHERE a.atama = ' ' order by a.mcoda asc"),
	@NamedQuery(name = "AsAnmag0f.findByMoalu", query = "SELECT a FROM Anmag0f a WHERE a.atama != 'S' and a.moalu = :moalu ")
})
public class AsAnmag0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private String atama;
	private String mcoda;
	private String mdesc;
	private String mumis;
	private BigDecimal mconf;
	private Integer mdepi;
	private String madiv;
	private String magru;
	private String masot;
	private String mafam;
	private String mastf;
	private String mast1;
	private String march;
	private String model;
	private Integer mcofo;
	private String mcoaf;
	private String mciva;
	private String mckit;
	private String moalu;
	private String mclin;
	
	public AsAnmag0f(){
	}

	public String getAtama(){
		return atama;
	}

	public void setAtama(String atama){
		this.atama = atama;
	}

	@Id
	public String getMcoda(){
		return mcoda;
	}

	public void setMcoda(String mcoda){
		this.mcoda = mcoda;
	}
	
	public String getMdesc(){
		return mdesc;
	}

	public void setMdesc(String mdesc){
		this.mdesc = mdesc;
	}

	public String getMumis(){
		return mumis;
	}

	public void setMumis(String mumis){
		this.mumis = mumis;
	}
	
	public BigDecimal getMconf(){
		return mconf;
	}

	public void setMconf(BigDecimal mconf){
		this.mconf = mconf;
	}

	public Integer getMdepi(){
		return mdepi;
	}

	public void setMdepi(Integer mdepi){
		this.mdepi = mdepi;
	}

	public String getMadiv(){
		return madiv;
	}

	public void setMadiv(String madiv){
		this.madiv = madiv;
	}
	
	public String getMagru(){
		return magru;
	}

	public void setMagru(String magru){
		this.magru = magru;
	}

	public String getMasot(){
		return masot;
	}

	public void setMasot(String masot){
		this.masot = masot;
	}

	public String getMafam(){
		return mafam;
	}

	public void setMafam(String mafam){
		this.mafam = mafam;
	}

	public String getMastf(){
		return mastf;
	}

	public void setMastf(String mastf){
		this.mastf = mastf;
	}
	
	public String getMast1(){
		return mast1;
	}

	public void setMast1(String mast1){
		this.mast1 = mast1;
	}

	public String getMarch(){
		return march;
	}

	public void setMarch(String march){
		this.march = march;
	}

	public String getModel(){
		return model;
	}

	public void setModel(String model){
		this.model = model;
	}
	
	public Integer getMcofo(){
		return mcofo;
	}

	public void setMcofo(Integer mcofo){
		this.mcofo = mcofo;
	}

	public String getMcoaf(){
		return mcoaf;
	}

	public void setMcoaf(String mcoaf){
		this.mcoaf =mcoaf;
	}

	public String getMciva(){
		return mciva;
	}

	public void setMciva(String mciva){
		this.mciva = mciva;
	}

	public String getMckit(){
		return mckit;
	}

	public void setMckit(String mckit){
		this.mckit = mckit;
	}

	public String getMoalu(){
		return moalu;
	}

	public void setMoalu(String moalu){
		this.moalu = moalu;
	}

	public String getMclin(){
		return mclin;
	}

	public void setMclin(String mclin){
		this.mclin = mclin;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atama == null) ? 0 : atama.hashCode());
		result = prime * result + ((madiv == null) ? 0 : madiv.hashCode());
		result = prime * result + ((mafam == null) ? 0 : mafam.hashCode());
		result = prime * result + ((magru == null) ? 0 : magru.hashCode());
		result = prime * result + ((march == null) ? 0 : march.hashCode());
		result = prime * result + ((masot == null) ? 0 : masot.hashCode());
		result = prime * result + ((mast1 == null) ? 0 : mast1.hashCode());
		result = prime * result + ((mastf == null) ? 0 : mastf.hashCode());
		result = prime * result + ((mcoaf == null) ? 0 : mcoaf.hashCode());
		result = prime * result + ((mcoda == null) ? 0 : mcoda.hashCode());
		result = prime * result + ((mcofo == null) ? 0 : mcofo.hashCode());
		result = prime * result + ((mconf == null) ? 0 : mconf.hashCode());
		result = prime * result + ((mdepi == null) ? 0 : mdepi.hashCode());
		result = prime * result + ((mdesc == null) ? 0 : mdesc.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((mumis == null) ? 0 : mumis.hashCode());
		result = prime * result + ((mciva == null) ? 0 : mciva.hashCode());
		result = prime * result + ((moalu == null) ? 0 : moalu.hashCode());
		result = prime * result + ((mclin == null) ? 0 : mclin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsAnmag0f){
			if(this.mcoda == ((AsAnmag0f)obj).mcoda){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsAnmag0f [atama=" + atama + ", mcoda=" + mcoda + ", mdesc=" + mdesc + ", mumis=" + mumis + ",  mconf=" + mconf + ", mdepi=" + mdepi + ", madiv=" + madiv + ", magru=" + magru + ", masot=" + masot + ", mafam=" + mafam + ", mastf=" + mastf + ", mast1=" + mast1 + ", march=" + march + ", model=" + model + ", mcofo=" + mcofo + ", mcoaf=" + mcoaf + ", mciva=" + mciva + ", mckit=" + mckit + ", moalu=" + moalu  + ", mclin=" + mclin + "]";
	}	
}