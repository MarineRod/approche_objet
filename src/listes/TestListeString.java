package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> AjoutVilles = new ArrayList<>();
		AjoutVilles.add("Nice");
		AjoutVilles.add("Carcassonne");
		AjoutVilles.add("Narbonne");
		AjoutVilles.add("Lyon");
		AjoutVilles.add("Foix");
		AjoutVilles.add("Pau");
		AjoutVilles.add("Marseille");
		AjoutVilles.add("Tarbes");

		for (String ville : AjoutVilles) {
			String villePlusLongue = "";
			if (ville.length() > villePlusLongue.length()) {
				villePlusLongue = ville;
				
			}
			// Afficher la ville avec le plus grand nombre de lettres
			System.out.println("Ville avec le plus grand nombre de lettres : " + villePlusLongue);

		}
		
		// Mettre tous les noms de villes en majuscules
        for (int i = 0; i < AjoutVilles.size(); i++) {
        	AjoutVilles.set(i, AjoutVilles.get(i).toUpperCase());
        }

        // Afficher la liste mise à jour
        System.out.println("Liste des villes en majuscules : " + AjoutVilles);
        
        
     // Supprimer les villes dont le nom commence par la lettre "N"
        Iterator<String> it = AjoutVilles.iterator();
        while (it.hasNext()) {
            String ville = it.next();
            if (ville.startsWith("N")) {
                it.remove();
            }
        }

        // Afficher la liste mise à jour
        System.out.println("Liste des villes après suppression des villes commençant par la lettre 'N' : " + AjoutVilles);
	
	}
}
