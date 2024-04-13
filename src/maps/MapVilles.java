package maps;

import java.util.Collection;
import java.util.HashMap;

import java.util.Set;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {

		HashMap<String, Ville> mapVilles = new HashMap<>();

		// Ajout des villes avec leurs habitants
		mapVilles.put("06", new Ville("Nice", 343000));
		mapVilles.put("110", new Ville("Carcassonne", 47800));
		mapVilles.put("111", new Ville("Narbonne", 53400));
		mapVilles.put("69", new Ville("Lyon", 484000));
		mapVilles.put("09", new Ville("Foix", 9700));
		mapVilles.put("64", new Ville("Pau", 77200));
		mapVilles.put("13", new Ville("Marseille", 850700));
		mapVilles.put("65", new Ville("Tarbes", 40600));

		// Parcours par la liste des clés
		
		//l'initialisation assurer qu'une variable a une valeur de départ 
		//En résumé, l'initialisation est une étape importante dans la programmation pour garantir que 
		//les variables et les objets sont correctement configurés et prêts à être utilisés dans votre programme.
		
		//Initialisation
		Integer min = Integer.MAX_VALUE;
		String keyMin = null;
		
		// récupérer toutes les clés de la map mapVilles.
		Set<String> listeKeys = mapVilles.keySet();
		
		//je parcours la liste des clés
		for (String key : listeKeys) {
			Ville ville = mapVilles.get(key);
			if (ville.getNbHabitants() < min) {
				min = ville.getNbHabitants();
				keyMin = key;
			}
         
		}
		
		System.out.println(keyMin);
		
		mapVilles.remove(keyMin);
		 //La boucle que vous avez présentée est conçue pour parcourir une collection d'objets Ville, pas une collection de String (noms de villes). 
		 //Si listeValues contient effectivement des objets Ville, alors vous devez utiliser le type Ville 
		//pour déclarer votre variable d'itération afin de pouvoir accéder aux attributs ou méthodes des objets Ville.

		Collection<Ville> listeValues = mapVilles.values();
		for (Ville key : listeValues) {
			System.out.println(key);
		}
	}
}
