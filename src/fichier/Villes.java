package fichier;

public class Villes {
	
	protected String Nom;
	protected int codeDepartement;
	protected String NomRegion;
	protected int popToT;
	
		

	
	public Villes(String nom, int codeDepartement, String nomRegion, int popToT) {
		super();
		Nom = nom;
		this.codeDepartement = codeDepartement;
		NomRegion = nomRegion;
		this.popToT = popToT;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public int getCodeDepartement() {
		return codeDepartement;
	}


	public void setCodeDepartement(int codeDepartement) {
		this.codeDepartement = codeDepartement;
	}


	public String getNomRegion() {
		return NomRegion;
	}


	public void setNomRegion(String nomRegion) {
		NomRegion = nomRegion;
	}


	public int getPopToT() {
		return popToT;
	}


	public void setPopToT(int popToT) {
		this.popToT = popToT;
	}


	
	}

