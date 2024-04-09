package entites2;

import entites.AdressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adressePostale;

	public Personne(String nom, String prenom, AdressePostale adressePostale) {

		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;

	}

	// méthode pour afficher

	public void afficherNom() {
		String nomEnMajuscules = nom.toUpperCase();
		System.out.println(nomEnMajuscules+" "+prenom);

	}

	// modifier le nom
	public void modifierNom(String nouveauNom) {
		nom = nouveauNom;
	}

	// modifier le prénom
	public void modifierPrenom(String nouveauPrenom) {
		prenom = nouveauPrenom;
	}

	// modifier adresse
	public void modifierAdresse(AdressePostale nouvelAdresse) {
		adressePostale = nouvelAdresse;
	}

	// méthode qui retourne nom
	public String getNom(){
		return nom;
		
	}
	
	// méthode qui retourne prénom
		public String getPrenom(){
			return prenom;
			
		}
		
		// méthode qui retourne adresse
				public AdressePostale getAdresse(){
					return adressePostale;
					
				}

}