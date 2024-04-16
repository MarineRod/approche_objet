package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class PopulationDunDepartementDonné extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.print("Veuillez saisir le nom du département : ");
		String codeDepartement = scanner.nextLine();

		// Récupérer la liste des villes du recensement
		List<Ville> villes = recensement.getVilles();
       System.out.println(villes);
		// Parcourir la liste des villes pour trouver celle correspondant au nom saisi

		int popDepartement = 0;
		for (Ville ville : villes) {
        //System.out.println(ville.getCodeDepartement());
        //System.out.println("code :" + codeDepartement );
			if (ville.getCodeDepartement().equals(codeDepartement)) {
				popDepartement += ville.getPopTot();
			}
		}

		System.out.println("Population du département " + codeDepartement + " : " + popDepartement);

	}
}
