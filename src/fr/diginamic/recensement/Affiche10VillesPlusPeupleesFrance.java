package fr.diginamic.recensement;

import java.util.Collections;

import java.util.List;

import java.util.Scanner;

public class Affiche10VillesPlusPeupleesFrance extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		// Récupérer la liste des villes du recensement
		List<Ville> villes = recensement.getVilles();

		// Trier la liste des villes par population décroissante
		Collections.sort(villes, (ville1, ville2) -> Integer.compare(ville2.getPopTot(), ville1.getPopTot()));

		// Afficher les 10 premières villes
		System.out.println("Les 10 villes les plus peuplées de France :");
		for (int i = 0; i < 10 && i < villes.size(); i++) {
			Ville ville = villes.get(i);
			System.out.println((i + 1) + ". " + ville.getNomCommune() + " - Population : " + ville.getPopTot());
		}
	}

}
