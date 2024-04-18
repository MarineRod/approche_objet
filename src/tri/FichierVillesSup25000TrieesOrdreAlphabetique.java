package tri;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FichierVillesSup25000TrieesOrdreAlphabetique {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/recensement.csv");
		List<String> liste = Files.readAllLines(path); // Je lis le contenu du fichier dans la variable liste

		// System.out.println(liste.size());

		ArrayList<Villes> listeVilles2 = new ArrayList<>(); // array de objet Villes
		ArrayList<String> fichierVillesSup25000Triees = new ArrayList<>();

		for (int i = 1; i < liste.size(); i++) {
			String ligne = liste.get(i);
			String[] tokens = ligne.split(";");

			String nom = tokens[6];
			String codeDepartement = tokens[2];
			String nomRegion = tokens[1];
			String population = tokens[9].trim().replaceAll(" ", "");
			int popTot = Integer.parseInt(population);

			Villes ville = new Villes(nom, codeDepartement, nomRegion, popTot); 

			listeVilles2.add(ville);

		}

		for (Villes ville : listeVilles2) {

			if (ville.getPopTot() > 25000) {

				String line = ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";"
						+ ville.getPopTot();

				fichierVillesSup25000Triees.add(line);

			}

		}

		
		
		
		//Ici le Collections.sort va effectuer un tri alphabétique sur un String donc la méthode compareTo() redéfinie
		//dans tri.Villes n'est pas utilisée
		Collections.sort(fichierVillesSup25000Triees);
		
        System.out.println(fichierVillesSup25000Triees.size());
		
		for (String fichierV : fichierVillesSup25000Triees ) {
			
			System.out.println(fichierV);
			
		}
		// System.out.println(fichierVillesSup25000.size());

		// Je crée le nouveau fichier qui ne contient que les 100 premières lignes
		// Path pathDest =Paths.get("D:/Diginamic/06. Langage Java - Approche orientée
		// objet/TP/listeVilles2.csv");
		// Files.write(pathDest,listeVilles2);
	}

}
