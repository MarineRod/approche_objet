package fr.diginamic.recensement;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Afficher10RegionsPlusPeuplees extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub

		// Récupérer la liste des villes du recensement
		List<Ville> villes = recensement.getVilles();

		// HashMap pour stocker la population associée à chaque région
		HashMap<String, Integer> populationParRegion = new HashMap<>();

		// Calculer la population totale de chaque région
		for (Ville ville : villes) {
			String nomRegion = ville.getNomRegion();
			// populationParRegion.getOrDefault(nomRegion, 0) : Cette méthode getOrDefault()
			// de la classe HashMap récupère
			// la valeur associée à la clé spécifiée (nomRegion) dans la HashMap. Si la clé
			// est présente dans la HashMap,
			// elle renvoie la valeur correspondante. Sinon, elle renvoie la valeur par
			// défaut spécifiée (0 dans ce cas).
			int populationRegion = populationParRegion.getOrDefault(nomRegion, 0);
			populationRegion += ville.getPopTot();
			populationParRegion.put(nomRegion, populationRegion);

			// Trier les régions par population décroissante
			// Convertir la HashMap en liste d'entrées (région, population)

			// La méthode entrySet() est une méthode de l'interface Map en Java.
			// Elle est utilisée pour récupérer un ensemble (Set) de toutes les entrées
			// (clé-valeur) présentes dans la Map.
			List<Map.Entry<String, Integer>> entries = new ArrayList<>(populationParRegion.entrySet());
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
