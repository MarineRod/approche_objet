package tri;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LectureFichierExerciceComparator {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/recensement.csv");
		List<String> liste = Files.readAllLines(path); // Je lis le contenu du fichier dans la variable liste

		//System.out.println(liste.size());

		ArrayList<VillesTri> ListeVilles = new ArrayList<>(); // array de objet Villes
		ArrayList<String> fichierVillesSup25000 = new ArrayList<>();

		// Ignorer la première ligne (en-tête)
		// int i=1
		for (int i = 1; i < liste.size(); i++) {
			String ligne = liste.get(i); // pour chaque ligne du fichier récupéré
			String[] tokens = ligne.split(";"); // on découpe chaque ligne en tableau de chaine de caractères sur la
												// base d’un séparateur

			// Ce code extrait les informations nécessaires à partir des tokens obtenus
			//System.out.println(ligne);
			String nom = tokens[6];
			String codeDepartement = tokens[2];
			String nomRegion = tokens[1];
			String population = tokens[9].trim().replaceAll(" ", "");
			int popToT = Integer.parseInt(population);

			VillesTri ville = new VillesTri(nom, codeDepartement, nomRegion, popToT); //

			ListeVilles.add(ville); // J'ajoute toutes les lignes de mon objet ville à ma liste ville

			// Les valeurs de ces éléments sont concaténées à l'aide de l'opérateur +
			// pour former une seule chaîne de caractères.
			// La chaîne résultante est ajoutée à la liste villes à l'aide de la méthode
			// add()

			//System.out.println(ListeVilles);
			
			
           
		}
		//le tri va se faire sur ListeVilles mais du coup ça serait fait aussi sur ma liste fichierVillesSup25000
		Collections.sort(ListeVilles);
		
		String[] entetes = liste.get(0).split(";");
        String enteteLine = entetes[6] + ";" + entetes[2] + ";" + entetes[1] + ";" + entetes[9];
        fichierVillesSup25000.add(enteteLine);
        
		
		for (VillesTri ville: ListeVilles) {
			
			if (ville.getPopTot()>25000) {
				
				String line = ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopTot();
				
				fichierVillesSup25000.add(line);
				
				
				
				
				
				//toujours faire en sorte que pour afficher correctement la liste pas sur une ligne mais sous forme de tableau mettre ici le
				//System.out.println(fichierVillesSup25000);
				
				
			}
			
		}
		
		
		
		
		System.out.println(fichierVillesSup25000.size());
		
		for (String fichierV : fichierVillesSup25000 ) {
			
			System.out.println(fichierV);
			
		}
		
		
			
			
			
			//Je crée le nouveau fichier qui ne contient que les 100 premières lignes
	    //Path pathDest =Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/fichierVillesSup25000.csv");
	    //Files.write(pathDest,fichierVillesSup25000);
	}

}
