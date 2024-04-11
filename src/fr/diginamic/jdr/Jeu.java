package fr.diginamic.jdr;

import java.util.Scanner;

public class Jeu {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Personnage personnage = null;
        int choix;

        do {
            System.out.println("Menu du jeu :");
            System.out.println("1. Créer le personnage");
            System.out.println("2. Combattre une créature");
            System.out.println("3. Quitter");
            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                	 personnage = new Personnage();
                    System.out.println("Personnage créé avec succès !");
                    break;
                case 2:
                    if (personnage != null) {
                        Creature creature = new Creature();
                        creature.combattrePersonnage(personnage);
                    } else {
                        System.out.println("Veuillez d'abord créer un personnage !");
                    }
                    break;
                case 3:
                    System.out.println("Merci d'avoir joué !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        } while (choix != 3);
        scanner.close();
    }
}