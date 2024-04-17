package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS(1, "Printemps"), ETE(2, "Ete"), AUTOMNE(3, "Automne"), HIVER(4, "Hiver");

	private int numeroOrdre;
	private String nom;

	private Saison(int numeroOrdre, String nom) {
		this.numeroOrdre = numeroOrdre;
		this.nom = nom;
	}

	public int getNumeroOrdre() {
		return numeroOrdre;
	}

	public String getNom() {
		return nom;
	}

	// Méthode pour récupérer une instance de Saison à partir du libellé
	public static Saison getSaisonByLibelle(String nom) {
		for (Saison saison : Saison.values()) {
			if (saison.nom.equals(nom)) {
				return saison;
			}
		}
		return null; // Retourne null si aucun libellé correspondant n'est trouvé
	}

}
