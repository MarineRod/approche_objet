package listes;

import java.util.ArrayList;

public class TestVilles {

	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>();

		// Ajout des villes avec leurs habitants
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));

		// Recherche de la ville la plus peuplée
		Ville villePlusPeuplee = villes.get(0);
		for (Ville ville : villes) {
			if (ville.getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
				villePlusPeuplee = ville;
			}
		}

		// Affichage de la ville la plus peuplée
		System.out.println("Ville la plus peuplée : " + villePlusPeuplee);

		// Recherche de la ville la moins peuplée
		Ville villeMoinsPeuplee = villes.get(0);
		for (Ville ville : villes) {
			if (ville.getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
				villeMoinsPeuplee = ville;
			}
		}

		// Suppression de la ville la moins peuplée
		villes.remove(villeMoinsPeuplee);

		// Affichage de la liste des villes après la suppression
		System.out.println("Liste des villes après suppression de la ville la moins peuplée :");
		for (Ville ville : villes) {
			System.out.println(ville);
		}

		for (Ville ville : villes) {
			if (ville.getNbHabitants() > 100000) {
				ville.setNom(ville.getNom().toUpperCase());
            System.out.println("Ville mise en lettres capitales avec un nb d'habitants supérieur à 100000 : "+  ville);
			}

		}

	}

}