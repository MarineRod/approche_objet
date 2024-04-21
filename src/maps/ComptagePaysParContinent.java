package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		ArrayList<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("France", 65000000, "Europe"));
		listePays.add(new Pays("Allemagne", 80000000, "Europe"));
		listePays.add(new Pays("Belgique", 10000000, "Europe"));
		listePays.add(new Pays("Russie", 150000000, "Asie"));
		listePays.add(new Pays("Chine", 1400000000, "Asie"));
		listePays.add(new Pays("Indonésie", 220000000, "Océanie"));
		listePays.add(new Pays("Australie", 20000000, "Océanie"));

		// La HashMap appelée comptage va stocker les compteurs (Integer) par continent
		// (String)
		HashMap<String, Integer> comptage = new HashMap<>();

		// Parcours de la listePays pour le comptage
		Iterator<Pays> iterPays = listePays.iterator();
		// Cette boucle se poursuivra tant qu'il y aura
		// des éléments non parcourus dans la carte
		while (iterPays.hasNext()) {
			Pays pays = iterPays.next(); // récupère l'élément Pays suivant à partir de l'itérateur

			String continent = pays.getContinent();
			Integer compteur = comptage.get(continent);
          
			//la variable compteur contiendra le nombre de pays pour le continent spécifié par la variable continent, ou null 
			//s'il n'y a pas encore de pays enregistrés pour ce continent dans la HashMap comptage.
			if (compteur == null) {
				comptage.put(continent, 1);
			} else {
				compteur++;
				comptage.put(continent, compteur);
			}
		}

		System.out.println(comptage);

	}

}