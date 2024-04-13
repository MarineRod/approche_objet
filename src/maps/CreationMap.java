package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		
		// Création de la map mapSalaires
        Map<String, Integer> mapSalaires = new HashMap<>();

        // Ajout des informations de salaire à la map
        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chantal", 2418);

        // Affichage de la taille de la map
        System.out.println("Taille de la map : " + mapSalaires.size());
    }
}