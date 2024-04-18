package fr.diginamic.recensement;


import java.util.List;
import java.util.Scanner;

public class PopulationDuneVilleDonnee extends MenuService {
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.print("Veuillez saisir le nom de la ville : ");
		String nomVille = scanner.nextLine();

		// Récupérer la liste des villes du recensement
		List<Ville> villes = recensement.getVilles();

		// Parcourir la liste des villes pour trouver celle correspondant au nom saisi
		boolean villeTrouvee = false;

		for (Ville ville : villes) {

			// est une méthode de la classe String en Java.
			// Elle est utilisée pour comparer deux chaînes de caractères,
			// en ignorant les différences de casse entre majuscules et minuscules.
			if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
				villeTrouvee = true;
				int population = ville.getPopTot();
				System.out.println("Population de " + nomVille + " : " + population+ " habitants");
				break; // Sortir de la boucle une fois que la ville est trouvée
			}
		}

		// Si la ville n'est pas trouvée, afficher un message d'erreur
		if (!villeTrouvee) {
			System.out.println("La ville " + nomVille + " n'a pas été trouvée.");

		}
	}

}