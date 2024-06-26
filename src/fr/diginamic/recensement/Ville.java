package fr.diginamic.recensement;

public class Ville {
	
	private String codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private String codeCommune;
	private String nomCommune;
	private int popTot;
	
	


	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int popTot) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popTot = popTot;
	}
	
	

	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement=" + codeDepartement
				+ ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", popTot=" + popTot + "]";
	}



	


	public String getCodeRegion() {
		return codeRegion;
	}



	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}



	public String getNomRegion() {
		return nomRegion;
	}



	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}



	public String getCodeDepartement() {
		return codeDepartement;
	}



	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}



	public String getCodeCommune() {
		return codeCommune;
	}



	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}



	public String getNomCommune() {
		return nomCommune;
	}



	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}



	public int getPopTot() {
		return popTot;
	}



	public void setPopTot(int popTot) {
		this.popTot = popTot;
	}



	




	
	
	
}