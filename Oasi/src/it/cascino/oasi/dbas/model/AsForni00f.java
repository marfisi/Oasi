package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import javax.persistence.*;

/**
* The persistent class for the $$libfca/forni00f database table.
* 
*/
@Entity(name="Forni00f")
@Table(name="Forni00f", schema="$$libfca")
@NamedQueries({
	@NamedQuery(name = "AsForni00f.findAll", query = "SELECT a FROM Forni00f a order by a.focfor"),
	@NamedQuery(name = "AsForni00f.findByFocfor", query = "SELECT a FROM Forni00f a WHERE a.focfor = :focfor"),
	@NamedQuery(name = "AsForni00f.findAggiornatiDopo", query = "SELECT a FROM Forni00f a WHERE a.fouins > :fouins or (a.fouins = :fouins and a.fohins > :fohins) order by a.focfor")
})
public class AsForni00f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer focfor;
	private String fodrso;
	private String fodrsa;
	private String fodind;
	private String foccap;
	private String fodloc;
	private String focprv;
	private String focfis;
	private String focpiv;
	private String fonprt;
	private String fontel;
	private String fonprf;
	private String fonfax;
	private String fontex;
	private String fodema;
	private String focf08;
	private String fodalt;
	private String focnaz;
	private String focpag;
	private String focusr;
	private Integer fouins;
	private Integer fohins;
	
	public AsForni00f(){
	}

	public AsForni00f(Integer focfor, String fodrso, String fodrsa, String fodind, String foccap, String fodloc, String focprv, String focfis, String focpiv, String fonprt, String fontel, String fonprf, String fonfax, String fontex, String fodema, String focf08, String foccme, String fodalt, String focnaz, String focpag, String focusr, Integer fouins, Integer fohins){
		super();
		this.focfor = focfor;
		this.fodrso = fodrso;
		this.fodrsa = fodrsa;
		this.fodind = fodind;
		this.foccap = foccap;
		this.fodloc = fodloc;
		this.focprv = focprv;
		this.focfis = focfis;
		this.focpiv = focpiv;
		this.fonprt = fonprt;
		this.fontel = fontel;
		this.fonprf = fonprf;
		this.fonfax = fonfax;
		this.fontex = fontex;
		this.fodema = fodema;
		this.focf08 = focf08;
		this.fodalt = fodalt;
		this.focnaz = focnaz;
		this.focpag = focpag;
		this.focusr = focusr;
		this.fouins = fouins;
		this.fohins = fohins;
	}

	@Id
	public Integer getFocfor(){
		return focfor;
	}

	public void setFocfor(Integer focfor){
		this.focfor = focfor;
	}

	public String getFodrso(){
		return fodrso;
	}

	public void setFodrso(String fodrso){
		this.fodrso = fodrso;
	}

	public String getFodrsa(){
		return fodrsa;
	}

	public void setFodrsa(String fodrsa){
		this.fodrsa = fodrsa;
	}

	public String getFodind(){
		return fodind;
	}

	public void setFodind(String fodind){
		this.fodind = fodind;
	}

	public String getFoccap(){
		return foccap;
	}

	public void setFoccap(String foccap){
		this.foccap = foccap;
	}

	public String getFodloc(){
		return fodloc;
	}

	public void setFodloc(String fodloc){
		this.fodloc = fodloc;
	}

	public String getFocprv(){
		return focprv;
	}

	public void setFocprv(String focprv){
		this.focprv = focprv;
	}

	public String getFocfis(){
		return focfis;
	}

	public void setFocfis(String focfis){
		this.focfis = focfis;
	}

	public String getFocpiv(){
		return focpiv;
	}

	public void setFocpiv(String focpiv){
		this.focpiv = focpiv;
	}

	public String getFonprt(){
		return fonprt;
	}

	public void setFonprt(String fonprt){
		this.fonprt = fonprt;
	}

	public String getFontel(){
		return fontel;
	}

	public void setFontel(String fontel){
		this.fontel = fontel;
	}

	public String getFonprf(){
		return fonprf;
	}

	public void setFonprf(String fonprf){
		this.fonprf = fonprf;
	}

	public String getFonfax(){
		return fonfax;
	}

	public void setFonfax(String fonfax){
		this.fonfax = fonfax;
	}

	public String getFontex(){
		return fontex;
	}

	public void setFontex(String fontex){
		this.fontex = fontex;
	}

	public String getFodema(){
		return fodema;
	}

	public void setFodema(String fodema){
		this.fodema = fodema;
	}

	public String getFocf08(){
		return focf08;
	}

	public void setFocf08(String focf08){
		this.focf08 = focf08;
	}

	public String getFodalt(){
		return fodalt;
	}

	public void setFodalt(String fodalt){
		this.fodalt = fodalt;
	}

	public String getFocnaz(){
		return focnaz;
	}

	public void setFocnaz(String focnaz){
		this.focnaz = focnaz;
	}

	public String getFocpag(){
		return focpag;
	}

	public void setFocpag(String focpag){
		this.focpag = focpag;
	}

	public String getFocusr(){
		return focusr;
	}

	public void setFocusr(String focusr){
		this.focusr = focusr;
	}

	public Integer getFouins(){
		return fouins;
	}

	public void setFouins(Integer fouins){
		this.fouins = fouins;
	}

	public Integer getFohins(){
		return fohins;
	}

	public void setFohins(Integer fohins){
		this.fohins = fohins;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foccap == null) ? 0 : foccap.hashCode());
		result = prime * result + ((focf08 == null) ? 0 : focf08.hashCode());
		result = prime * result + ((focfis == null) ? 0 : focfis.hashCode());
		result = prime * result + ((focfor == null) ? 0 : focfor.hashCode());
		result = prime * result + ((focnaz == null) ? 0 : focnaz.hashCode());
		result = prime * result + ((focpag == null) ? 0 : focpag.hashCode());
		result = prime * result + ((focpiv == null) ? 0 : focpiv.hashCode());
		result = prime * result + ((focprv == null) ? 0 : focprv.hashCode());
		result = prime * result + ((focusr == null) ? 0 : focusr.hashCode());
		result = prime * result + ((fodalt == null) ? 0 : fodalt.hashCode());
		result = prime * result + ((fodema == null) ? 0 : fodema.hashCode());
		result = prime * result + ((fodind == null) ? 0 : fodind.hashCode());
		result = prime * result + ((fodloc == null) ? 0 : fodloc.hashCode());
		result = prime * result + ((fodrsa == null) ? 0 : fodrsa.hashCode());
		result = prime * result + ((fodrso == null) ? 0 : fodrso.hashCode());
		result = prime * result + ((fohins == null) ? 0 : fohins.hashCode());
		result = prime * result + ((fonfax == null) ? 0 : fonfax.hashCode());
		result = prime * result + ((fonprf == null) ? 0 : fonprf.hashCode());
		result = prime * result + ((fonprt == null) ? 0 : fonprt.hashCode());
		result = prime * result + ((fontel == null) ? 0 : fontel.hashCode());
		result = prime * result + ((fontex == null) ? 0 : fontex.hashCode());
		result = prime * result + ((fouins == null) ? 0 : fouins.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsForni00f) {
			if(this.focfor == ((AsForni00f)obj).focfor){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return "AsForni00f [focfor=" + focfor + ", fodrso=" + fodrso + ", fodrsa=" + fodrsa + ", fodind=" + fodind + ", foccap=" + foccap + ", fodloc=" + fodloc + ", focprv=" + focprv + ", focfis=" + focfis + ", focpiv=" + focpiv + ", fonprt=" + fonprt + ", fontel=" + fontel + ", fonprf=" + fonprf + ", fonfax=" + fonfax + ", fontex=" + fontex + ", fodema=" + fodema + ", focf08=" + focf08 + ", fodalt=" + fodalt + ", focnaz=" + focnaz + ", focpag=" + focpag + ", focusr=" + focusr + ", fouins=" + fouins + ", fohins=" + fohins + "]";
	}
}