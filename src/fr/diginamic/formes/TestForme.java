package fr.diginamic.formes;

import fr.diginamic.essais.AffichageForme;


public class TestForme {

	public static void main(String[] args) {
		
		// Création d'instances de différentes formes
        Cercle cercle = new Cercle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Carre carre = new Carre(3);

        // Création de l'instance de la classe AffichageForme
        AffichageForme affichage = new AffichageForme();
		

        // Test de la méthode afficher avec les différentes formes
        System.out.println("Cercle :");
        affichage.afficher(cercle);

        System.out.println("Rectangle :");
        affichage.afficher(rectangle);

        System.out.println("Carre :");
        affichage.afficher(carre);
		
		
	}

	}


