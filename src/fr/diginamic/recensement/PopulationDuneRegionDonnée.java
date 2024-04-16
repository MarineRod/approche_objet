package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class PopulationDuneRegionDonnée extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.print("Veuillez saisir le nom de la région : ");
		String nomRegion = scanner.nextLine();

		// Récupérer la liste des villes du recensement
		List<Ville> villes = recensement.getVilles();

		// Parcourir la liste des villes pour trouver celle correspondant au nom saisi

		int popRegion = 0;

		for (Ville ville : villes) {

			if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {

				popRegion += ville.getPopTot();

			}
		}

		System.out.println("Population de la région " + nomRegion + " : " + popRegion);

	}
}
