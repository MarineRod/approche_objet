package exosRefaitsExec;

import exosRefaits.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre theatre1 = new Theatre("Le Raja", 20000, 250, 3500);

		for (int i = 0; i < 100; i++) {
			theatre1.inscrire(10, 15);

		}
        
		System.out.println("Le nombre de clients inscrits est de : "+theatre1.getClientsInscritsTot());
		System.out.println("La recette totale de l'établissement est de : "+theatre1.getRecetteTot());
	}
}
