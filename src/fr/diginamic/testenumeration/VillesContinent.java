package fr.diginamic.testenumeration;

public class VillesContinent implements Comparable<VillesContinent> {

	private String nom;
	private Continent continent;

	public VillesContinent(String nom, Continent continent) {
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

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
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
