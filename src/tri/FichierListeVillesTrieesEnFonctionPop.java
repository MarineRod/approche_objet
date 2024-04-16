package tri;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FichierListeVillesTrieesEnFonctionPop {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/recensement.csv");
		List<String> liste = Files.readAllLines(path); // Je lis le contenu du fichier dans la variable liste

		// System.out.println(liste.size());

		ArrayList<VillesTri> listeVilles = new ArrayList<>(); // array de objet Villes
		

		for (int i = 1; i < liste.size(); i++) {
			String ligne = liste.get(i);
			String[] tokens = ligne.split(";");

			String nom = tokens[6];
			String codeDepartement = tokens[2];
			String nomRegion = tokens[1];
			String population = tokens[9].trim().replaceAll(" ", "");
			int popTot = Integer.parseInt(population);

			VillesTri ville = new VillesTri(nom, codeDepartement, nomRegion, popTot); 

			listeVilles.add(ville);

		}

		

		// Triez par ordre alphabétique la liste en utilisant la méthode compareTo définie dans la classe
		// Villes
		

		Collections.sort(listeVilles);
		
        System.out.println(listeVilles.size());
		
		for (VillesTri LV : listeVilles) {
			
			System.out.println(LV);
			
		}
		// System.out.println(fichierVillesSup25000.size());

		// Je crée le nouveau fichier qui ne contient que les 100 premières lignes
		// Path pathDest =Paths.get("D:/Diginamic/06. Langage Java - Approche orientée
		// objet/TP/listeVilles2.csv");
		// Files.write(pathDest,listeVilles2);
	}

}
