package CapitalesClases;

public class Pais{

	private String pais;
	private String capital;
	
	public Pais(String pais,String capital){
		super();
		this.pais = pais;
		this.capital = capital;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	@Override
	public boolean equals(Object obj){
		  if(this.pais.equals(((Pais) obj).pais)) {
			  return true;
		  }
		  else {
			  return false;
		  }
	}
}
