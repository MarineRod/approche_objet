package fr.diginamic.testenumeration;

public enum Continent {

	EUROPE(1, "Europe"), AMERIQUE(2, "Amérique"), ASIE(3, "Asie"), OCEANIE(4, "Océanie"), AFRIQUE(4, "Afrique");

	private int numeroOrdre;
	private String nom;

	private Continent(int numeroOrdre, String nom) {
		this.numeroOrdre = numeroOrdre;
		this.nom = nom;
	}

	public int getNumeroOrdre() {
		return numeroOrdre;
	}

	public String getNom() {
		return nom;
	}

}
