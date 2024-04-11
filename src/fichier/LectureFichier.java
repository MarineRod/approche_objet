package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;





public class LectureFichier {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/recensement.csv");
		List<String> liste = Files.readAllLines(path); //Je lis le contenu du fichier  dans la variable liste

		System.out.println(liste);

		ArrayList<Villes> ListeVilles = new ArrayList<>(); //array de objet Villes

		// Ignorer la première ligne (en-tête)
		// int i=1
		for (int i = 0; i < liste.size(); i++) {
			String ligne = liste.get(i); //pour chaque ligne du fichier récupéré
			String[] tokens = ligne.split(";"); // on découpe chaque ligne en tableau de chaine de caractères sur la base d’un séparateur
			
		//Ce code extrait les informations nécessaires à partir des tokens obtenus
			String nom = tokens[6];
			int codeDepartement = Integer.parseInt(tokens[2]);
			String nomRegion = tokens[1];
			int popToT  = Integer.parseInt(tokens[9]);
			
			Villes ville = new Villes (nom, codeDepartement, nomRegion, popToT); // 
		
			ListeVilles.add(ville); //J'ajoute toutes les lignes de mon  objet ville à ma liste ville
			
			
			//Les valeurs de ces éléments sont concaténées à l'aide de l'opérateur + 
			//pour former une seule chaîne de caractères.
			//La chaîne résultante est ajoutée à la liste villes à l'aide de la méthode add()

		}
		
		System.out.println(ListeVilles);

	}

}
