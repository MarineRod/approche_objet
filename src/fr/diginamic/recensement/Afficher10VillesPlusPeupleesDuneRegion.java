package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Afficher10VillesPlusPeupleesDuneRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.print("Veuillez saisir le nom de la région : ");
		String nomRegion = scanner.nextLine();

		// Liste des villes de la région spécifiée
		List<Ville> villesRegion = new ArrayList<>();
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
				villesRegion.add(ville);
			}
		}

		// Trier les villes de la région par population
		Collections.sort(villesRegion, new Comparator<Ville>() {

			@Override
			public int compare(Ville ville1, Ville ville2) {
				return Integer.compare(ville2.getPopTot(), ville1.getPopTot());
			}
		});

		// Afficher les 10 premières villes de la région
		int count = 0;
		for (Ville ville : villesRegion) {
			System.out.println((count + 1) + ". " + ville.getNomCommune() + " - Population : " + ville.getPopTot()+ " habitants");
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
