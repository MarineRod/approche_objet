package fr.diginamic.salaire;

public abstract class Intervenant {

	private String statut;
	private String nom;
	private String prenom;


	public Intervenant(String statut, String nom, String prenom) {
		super();
		this.statut = statut;
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	
	public abstract String getStatut();

	public void afficherDonnees() {

		System.out.println("Nom : " + nom + " Prenom : " + prenom + "Status : " + statut + " Salaire : " + getSalaire());
	};

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
