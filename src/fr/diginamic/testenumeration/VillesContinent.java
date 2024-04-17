package fr.diginamic.testenumeration;

public class VillesContinent implements Comparable<VillesContinent> {

	private String nom;
	private String continent;

	public VillesContinent(String nom, String continent) {
		super();
		this.nom = nom;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "VillesContinent [nom=" + nom + ", continent=" + continent + "]";
	}

	@Override
	public int compareTo(VillesContinent o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
