package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Afficher10DepartementsPlusPeuples extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		

		// Récupérer la liste des villes du recensement
		List<Ville> villes = recensement.getVilles();

		// HashMap pour stocker la population associée à chaque région
		HashMap<String, Integer> populationParDepartement = new HashMap<>();

		// Calculer la population totale de chaque région
		for (Ville ville : villes) {
			String codeDepartement = ville.getCodeDepartement();
			
			int populationDepartement = populationParDepartement.getOrDefault(codeDepartement, 0);
			populationDepartement += ville.getPopTot();
			populationParDepartement.put(codeDepartement, populationDepartement);

			
			List<Map.Entry<String, Integer>> entries = new ArrayList<>(populationParDepartement.entrySet());
			entries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

			// Afficher les 10 régions les plus peuplées
			System.out.println("Les 10 régions les plus peuplées de France :");
			int count = 0;
			for (Map.Entry<String, Integer> entry : entries) {
				System.out.println(entry.getKey() + " : " + entry.getValue() + " habitants");
				count++;
				if (count >= 10) {
					break;
				}
			}
		}
	}
}


