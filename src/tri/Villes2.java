package tri;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import fichier.Villes;



public class Villes2 {

	public static void main(String[] args) throws IOException {
		
		
		Path path = Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/recensement.csv");
		List<String> liste = Files.readAllLines(path); // Je lis le contenu du fichier dans la variable liste

		//System.out.println(liste.size());

		ArrayList<Villes> listeVilles2 = new ArrayList<>(); // array de objet Villes
		ArrayList<String> fichierVillesSup25000Triees = new ArrayList<>();
		
        
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
			int popTot = Integer.parseInt(population);

			Villes ville = new Villes(nom, codeDepartement, nomRegion, popTot); //

			listeVilles2.add(ville); // J'ajoute toutes les lignes de mon objet ville à ma liste ville

		
			
		}
		
		//String[] entetes = liste.get(0).split(";");
        //String enteteLine = entetes[6] + ";" + entetes[2] + ";" + entetes[1] + ";" + entetes[9];
       // fichierVillesSup25000Triees.add(enteteLine);
        
		
		for (Villes ville: listeVilles2) {
			
			if (ville.getPopTot()>25000) {
				
				String line = ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopTot();
				
				fichierVillesSup25000Triees.add(line);
				
				
			}
			
		}
		
		
		
		// Triez la liste en utilisant la méthode compareTo définie dans la classe Villes
        Collections.sort(fichierVillesSup25000Triees);
        System.out.println(fichierVillesSup25000Triees);
		//System.out.println(fichierVillesSup25000.size());
		
		//Je crée le nouveau fichier qui ne contient que les 100 premières lignes
	   // Path pathDest =Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/listeVilles2.csv");
	    //Files.write(pathDest,listeVilles2);
	}

}
