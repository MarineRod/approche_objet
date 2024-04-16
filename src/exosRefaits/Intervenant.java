package exosRefaits;

public abstract class Intervenant {

	private String nom;
	private String prenom;

	public Intervenant(String nom, String prenom, String statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;

	}

	public abstract String getStatut();

	public abstract double getSalaire();

	public void afficherDonnees() {

		System.out.println(
				"Nom : " + nom + " Prénom : " + prenom + " Statut : " + getStatut() + " Salaire: " + getSalaire());

	}

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
