package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale(2, "Impasse Guillaume Brune", 85000, "La Roche sur Yon");

		Personne pers1 = new Personne("Rodriguez", "Marine", adr1);

		Personne pers2 = new Personne("Dupont", "Clément",
				new AdressePostale(3, "Rue Maréchal Geoffres", 07200, "Aubenas"));

		System.out.println(pers1.adressePostale.numRue);

		// Accéder aux informations de la personne
		String nom = pers1.getNom();
		String prenom = pers1.getPrenom();
		AdressePostale adressePersonne = pers1.getAdresse();

		// Afficher les informations
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
		System.out.println(
				"Adresse : " + adressePersonne.numRue + " " + adressePersonne.libellRue + " " + adressePersonne.ville);
		
		//Modifier nom
		pers1.modifierNom("Lala");
		// Afficher le prénom après modification
        System.out.println("Le nouveau nom de" +" "+ pers1.prenom + " " + "est : " + pers1.nom);
        
        pers1.afficherNom();

	}

}
