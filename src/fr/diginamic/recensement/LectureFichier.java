package fr.diginamic.recensement;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;

public class LectureFichier {

	public static void lecture(Recensement recensement) throws IOException {

		Path path = Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/recensement.csv");
		List<String> liste = Files.readAllLines(path); // Je lis le contenu du fichier dans la variable liste

		// System.out.println(liste.size());

		ArrayList<Ville> ListeVilles = new ArrayList<>(); // array de objet Villes

		// Ignorer la première ligne (en-tête)
		// int i=1
		for (int i = 1; i < liste.size(); i++) {
			String ligne = liste.get(i); // pour chaque ligne du fichier récupéré
			String[] tokens = ligne.split(";"); // on découpe chaque ligne en tableau de chaine de caractères sur la
												// base d’un séparateur

			// Ce code extrait les informations nécessaires à partir des tokens obtenus
			// System.out.println(ligne);
			String codeRegion = tokens[0];
			String nomRegion = tokens[1];
			String codeDepartement = tokens[2].trim();
			String codeCommune = tokens[5];
			String nomCommune = tokens[6];
			String population = tokens[9].trim().replaceAll(" ", "");
			int popTot = Integer.parseInt(population);

			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, popTot); //

			ListeVilles.add(ville);

		}
      
		recensement.setVilles(ListeVilles);
	}

}
