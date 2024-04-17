package fr.diginamic.testenumeration;

public enum Continent {

	EUROPE("Europe"), AMERIQUE("Amérique"), ASIE("Asie"), OCEANIE("Océanie"), AFRIQUE("Afrique");

	private String nom;

	private Continent(String nom) {

		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

}
