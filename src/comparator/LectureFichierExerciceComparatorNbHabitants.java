package comparator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LectureFichierExerciceComparatorNbHabitants {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/recensement.csv");
		List<String> liste = Files.readAllLines(path);

		ArrayList<Villes> listeVilles = new ArrayList<>();

		for (int i = 1; i < liste.size(); i++) {
			String ligne = liste.get(i);
			String[] tokens = ligne.split(";");

			String nom = tokens[6];
			String codeDepartement = tokens[2];
			String nomRegion = tokens[1];
			String population = tokens[9].trim().replaceAll(" ", "");
			int popToT = Integer.parseInt(population);

			Villes ville = new Villes(nom, codeDepartement, nomRegion, popToT); //

			listeVilles.add(ville);

		}


		Collections.sort(listeVilles, new ComparatorHabitant());

			for (Villes v :listeVilles ) {
				System.out.println(v);
			}

	}

}
