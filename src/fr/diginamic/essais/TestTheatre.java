package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre th1 = new Theatre("Paris La Défense Arena", 400000, 3000, 0);

		for (int i = 0; i < 99; i++) {
			th1.inscrire(1, 15);
			
		}

		System.out.println("Total de clients inscrits : " + th1.getTotalClientsInscrits());

		System.out.println("Recette totale de l'établissement : " + th1.getRecetteTot() + " euros");

	}

}
