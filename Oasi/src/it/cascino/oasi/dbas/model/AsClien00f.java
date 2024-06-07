package it.cascino.oasi.dbas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
* The persistent class for the $$libfca/clien00f database table.
* 
*/
@Entity(
	name = "Clien00f"
)
@Table(
	name = "Clien00f",
	schema = "$$libfca"
)
@NamedQueries(
	{@NamedQuery(
		name = "AsClien00f.findAll",
		query = "SELECT a FROM Clien00f a order by a.clccli"
	), @NamedQuery(
		name = "AsClien00f.findByClccli",
		query = "SELECT a FROM Clien00f a WHERE a.clccli = :clccli"
	), @NamedQuery(
		name = "AsClien00f.findAggiornatiDopo",
		query = "SELECT a FROM Clien00f a WHERE a.cluins > :cluins or (a.cluins = :cluins and a.clhins > :clhins) order by a.clccli"
	)
	}
)
public class AsClien00f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal clccli;
	private String clfann;
	private String cltcli;
	private String cldrso;
	private String cldrsa;
	private String cldind;
	private String clccap;
	private String cldloc;
	private String clcprv;
	private String clcfis;
	private BigDecimal clcpiv;
	private String clnprt;
	private String clntel;
	private String clnprf;
	private String clnfax;
	private String clntex;
	private String cldema;
	private String clcag1;
	private String clcf08;	// COD.USO FUTURO 08                                  A    10 (codice SDI)
	private String clfisp;
	private String clccme;
	private String cldalt;
	private String clcnaz;
	private BigDecimal clcpag;
	private String clfasi;
	private String cltdoc;
	private String clcpor;
	private String clcusr;
	private BigDecimal cluins;
	private BigDecimal clhins;
	private String clcnor;
	private String clfl14;	// FLAG USI FUTURI 14                                 A     1 (se e' PA)
	
	public AsClien00f(){
	}
	
	@Id
	public BigDecimal getClccli(){
		return clccli;
	}
	
	public void setClccli(BigDecimal clccli){
		this.clccli = clccli;
	}
	
	public String getClfann(){
		return clfann;
	}
	
	public void setClfann(String clfann){
		this.clfann = clfann;
	}
	
	public String getCltcli(){
		return cltcli;
	}
	
	public void setCltcli(String cltcli){
		this.cltcli = cltcli;
	}
	
	public String getCldrso(){
		return cldrso;
	}
	
	public void setCldrso(String cldrso){
		this.cldrso = cldrso;
	}
	
	public String getCldrsa(){
		return cldrsa;
	}
	
	public void setCldrsa(String cldrsa){
		this.cldrsa = cldrsa;
	}
	
	public String getCldind(){
		return cldind;
	}
	
	public void setCldind(String cldind){
		this.cldind = cldind;
	}
	
	public String getClccap(){
		return clccap;
	}
	
	public void setClccap(String clccap){
		this.clccap = clccap;
	}
	
	public String getCldloc(){
		return cldloc;
	}
	
	public void setCldloc(String cldloc){
		this.cldloc = cldloc;
	}
	
	public String getClcprv(){
		return clcprv;
	}
	
	public void setClcprv(String clcprv){
		this.clcprv = clcprv;
	}
	
	public String getClcfis(){
		return clcfis;
	}
	
	public void setClcfis(String clcfis){
		this.clcfis = clcfis;
	}
	
	public BigDecimal getClcpiv(){
		return clcpiv;
	}
	
	public void setClcpiv(BigDecimal clcpiv){
		this.clcpiv = clcpiv;
	}
	
	public String getClnprt(){
		return clnprt;
	}
	
	public void setClnprt(String clnprt){
		this.clnprt = clnprt;
	}
	
	public String getClntel(){
		return clntel;
	}
	
	public void setClntel(String clntel){
		this.clntel = clntel;
	}
	
	public String getClnprf(){
		return clnprf;
	}
	
	public void setClnprf(String clnprf){
		this.clnprf = clnprf;
	}
	
	public String getClnfax(){
		return clnfax;
	}
	
	public void setClnfax(String clnfax){
		this.clnfax = clnfax;
	}
	
	public String getClntex(){
		return clntex;
	}
	
	public void setClntex(String clntex){
		this.clntex = clntex;
	}
	
	public String getCldema(){
		return cldema;
	}
	
	public void setCldema(String cldema){
		this.cldema = cldema;
	}
	
	public String getClcag1(){
		return clcag1;
	}
	
	public void setClcag1(String clcag1){
		this.clcag1 = clcag1;
	}
	
	public String getClcf08(){
		return clcf08;
	}
	
	public void setClcf08(String clcf08){
		this.clcf08 = clcf08;
	}
	
	public String getClfisp(){
		return clfisp;
	}
	
	public void setClfisp(String clfisp){
		this.clfisp = clfisp;
	}
	
	public String getClccme(){
		return clccme;
	}
	
	public void setClccme(String clccme){
		this.clccme = clccme;
	}
	
	public String getCldalt(){
		return cldalt;
	}
	
	public void setCldalt(String cldalt){
		this.cldalt = cldalt;
	}
	
	public String getClcnaz(){
		return clcnaz;
	}
	
	public void setClcnaz(String clcnaz){
		this.clcnaz = clcnaz;
	}
	
	public BigDecimal getClcpag(){
		return clcpag;
	}
	
	public void setClcpag(BigDecimal clcpag){
		this.clcpag = clcpag;
	}
	
	public String getClfasi(){
		return clfasi;
	}
	
	public void setClfasi(String clfasi){
		this.clfasi = clfasi;
	}
	
	public String getCltdoc(){
		return cltdoc;
	}
	
	public void setCltdoc(String cltdoc){
		this.cltdoc = cltdoc;
	}
	
	public String getClcpor(){
		return clcpor;
	}
	
	public void setClcpor(String clcpor){
		this.clcpor = clcpor;
	}
	
	public String getClcusr(){
		return clcusr;
	}
	
	public void setClcusr(String clcusr){
		this.clcusr = clcusr;
	}
	
	public BigDecimal getCluins(){
		return cluins;
	}
	
	public void setCluins(BigDecimal cluins){
		this.cluins = cluins;
	}
	
	public BigDecimal getClhins(){
		return clhins;
	}
	
	public void setClhins(BigDecimal clhins){
		this.clhins = clhins;
	}
	
	public String getClcnor(){
		return clcnor;
	}
	
	public void setClcnor(String clcnor){
		this.clcnor = clcnor;
	}
	
	public String getClfl14(){
		return clfl14;
	}

	public void setClfl14(String clfl14){
		this.clfl14 = clfl14;
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clcag1 == null) ? 0 : clcag1.hashCode());
		result = prime * result + ((clccap == null) ? 0 : clccap.hashCode());
		result = prime * result + ((clccli == null) ? 0 : clccli.hashCode());
		result = prime * result + ((clccme == null) ? 0 : clccme.hashCode());
		result = prime * result + ((clcf08 == null) ? 0 : clcf08.hashCode());
		result = prime * result + ((clcfis == null) ? 0 : clcfis.hashCode());
		result = prime * result + ((clcnaz == null) ? 0 : clcnaz.hashCode());
		result = prime * result + ((clcpag == null) ? 0 : clcpag.hashCode());
		result = prime * result + ((clcpiv == null) ? 0 : clcpiv.hashCode());
		result = prime * result + ((clcpor == null) ? 0 : clcpor.hashCode());
		result = prime * result + ((clcprv == null) ? 0 : clcprv.hashCode());
		result = prime * result + ((clcusr == null) ? 0 : clcusr.hashCode());
		result = prime * result + ((cldalt == null) ? 0 : cldalt.hashCode());
		result = prime * result + ((cldema == null) ? 0 : cldema.hashCode());
		result = prime * result + ((cldind == null) ? 0 : cldind.hashCode());
		result = prime * result + ((cldloc == null) ? 0 : cldloc.hashCode());
		result = prime * result + ((cldrsa == null) ? 0 : cldrsa.hashCode());
		result = prime * result + ((cldrso == null) ? 0 : cldrso.hashCode());
		result = prime * result + ((clfasi == null) ? 0 : clfasi.hashCode());
		result = prime * result + ((clfisp == null) ? 0 : clfisp.hashCode());
		result = prime * result + ((clhins == null) ? 0 : clhins.hashCode());
		result = prime * result + ((clnfax == null) ? 0 : clnfax.hashCode());
		result = prime * result + ((clnprf == null) ? 0 : clnprf.hashCode());
		result = prime * result + ((clnprt == null) ? 0 : clnprt.hashCode());
		result = prime * result + ((clntel == null) ? 0 : clntel.hashCode());
		result = prime * result + ((clntex == null) ? 0 : clntex.hashCode());
		result = prime * result + ((cltdoc == null) ? 0 : cltdoc.hashCode());
		result = prime * result + ((cluins == null) ? 0 : cluins.hashCode());
		result = prime * result + ((clcnor == null) ? 0 : clcnor.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsClien00f){
			if(this.clccli == ((AsClien00f)obj).clccli){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "AsClien00f [clccli=" + clccli + ", clfann=" + clfann + ", cltcli=" + cltcli + ", cldrso=" + cldrso + ", cldrsa=" + cldrsa + ", cldind=" + cldind + ", clccap=" + clccap + ", cldloc=" + cldloc + ", clcprv=" + clcprv + ", clcfis=" + clcfis + ", clcpiv=" + clcpiv + ", clnprt=" + clnprt + ", clntel=" + clntel + ", clnprf=" + clnprf + ", clnfax=" + clnfax + ", clntex=" + clntex + ", cldema=" + cldema + ", clcag1=" + clcag1 + ", clcf08=" + clcf08 + ", clfisp=" + clfisp + ", clccme=" + clccme + ", cldalt=" + cldalt + ", clcnaz=" + clcnaz + ", clcpag=" + clcpag + ", clfasi=" + clfasi + ", cltdoc=" + cltdoc + ", clcpor=" + clcpor + ", clcusr=" + clcusr + ", cluins=" + cluins + ", clhins=" + clhins + ", clcnor=" + clcnor + ", clfl14=" + clfl14 + "]";
	}
}