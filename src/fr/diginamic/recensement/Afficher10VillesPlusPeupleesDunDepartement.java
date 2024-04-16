package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Afficher10VillesPlusPeupleesDunDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.print("Veuillez saisir le nom du département : ");
		String codeDepartement = scanner.nextLine();

		// Liste des villes de la région spécifiée
		List<Ville> villesDepartement = new ArrayList<>();
		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
				villesDepartement.add(ville);
			}
		}

		// Trier les villes de la région par population
		Collections.sort(villesDepartement, new Comparator<Ville>() {
        
			// les villes avec la population la plus élevée seront placées en premier dans la liste triée
			@Override
			public int compare(Ville ville1, Ville ville2) {
				return Integer.compare(ville2.getPopTot(), ville1.getPopTot());
			}
		});

		// Afficher les 10 premières villes de la région
		int count = 0;
		for (Ville ville : villesDepartement) {
			System.out.println((count + 1) + ". " + ville.getNomCommune() + " - Population : " + ville.getPopTot());
			count++;
			if (count >= 10) {
				break;
			}

		}

		if (count == 0) {
			System.out.println("Aucune ville trouvée pour la région spécifiée.");
		}
	}

}


