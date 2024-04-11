package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		
		List<String> liste3 = new ArrayList<>();
		
		// Ajouter les éléments de liste1 à liste3, on a créé une variable couleur dans laquelle on stocke tous les éléments de liste1 et ensuite dans liste3, 
		//on ajoute tout ce qu'on a mis dans couleurs
        for (String couleur : liste1) {
            liste3.add(couleur);
        }

        // Ajouter les éléments de liste2 à liste3
        for (String couleur : liste2) {
            liste3.add(couleur);
        }

        // Afficher liste3
        System.out.println("Liste fusionnée : " + liste3);
    }
		
	}

