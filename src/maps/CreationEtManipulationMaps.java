package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class CreationEtManipulationMaps {

	public static void main(String args[]) {
		// Integer gère numéros (à revoir)
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		// Ajout des informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// Affichage de la map après l'ajout des nouvelles villes
		System.out.println("mapVilles après ajout des nouvelles villes : " + mapVilles);

		// Mettre en place une boucle pour afficher l'ensemble des clés contenues dans
		// la map
		Set<Integer> listekeys = mapVilles.keySet();
		for (Integer key : listekeys) {
			System.out.println(key);
		}

		// Mettre en place une boucle pour afficher l'ensemble des valeurs contenues
		// dans la map
		Collection<String> listeValues = mapVilles.values();
		for (String key : listeValues) {
			System.out.println(key);
		}
		
		// Afficher la taille de la map
		System.out.println(mapVilles.size());
	}
	
	
}