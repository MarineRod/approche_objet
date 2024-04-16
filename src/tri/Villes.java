package tri;

public class Villes implements Comparable<Villes> {

	protected String nom;
	protected String codeDepartement;
	protected String NomRegion;
	protected int popTot;

	public Villes(String nom, String codeDepartement, String nomRegion, int popTot) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		NomRegion = nomRegion;
		this.popTot = popTot;
	}

	@Override
	public int compareTo(Villes autre) {

		return this.nom.compareTo(autre.getNom());
	}

	@Override
	public String toString() {
		return "Villes [Nom=" + nom + ", codeDepartement=" + codeDepartement + ", NomRegion=" + NomRegion + ", popToT="
				+ popTot + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomRegion() {
		return NomRegion;
	}

	public void setNomRegion(String nomRegion) {
		NomRegion = nomRegion;
	}

	public int getPopTot() {
		return popTot;
	}

	public void setPopTot(int popTot) {
		this.popTot = popTot;
	}

}
