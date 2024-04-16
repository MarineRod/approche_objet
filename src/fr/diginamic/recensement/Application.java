package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        Recensement recensement = new Recensement();
        LectureFichier.lecture(recensement);
        boolean continuer = true;
        while (continuer) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne après la lecture de l'entier

            switch (choix) {
                case 1:
                	PopulationDuneVilleDonnee recherche = new PopulationDuneVilleDonnee();
                	recherche.traiter(recensement,scanner);
                	break;
          
                case 2:
                	PopulationDunDepartementDonné recherche2 = new PopulationDunDepartementDonné();
                	recherche2.traiter(recensement,scanner);
                	break;
                case 3:
                	PopulationDuneRegionDonnée recherche3 = new PopulationDuneRegionDonnée();
                	recherche3.traiter(recensement,scanner);
                	break;
                case 4:
                	Afficher10RegionsPlusPeuplees recherche4 = new Afficher10RegionsPlusPeuplees();
                	recherche4.traiter(recensement,scanner);
                	break;
                	
                case 5:
                	Afficher10DepartementsPlusPeuples recherche5 = new Afficher10DepartementsPlusPeuples();
                	recherche5.traiter(recensement,scanner);
                	break;
                case 6:
                	Afficher10VillesPlusPeupleesDunDepartement recherche6 = new Afficher10VillesPlusPeupleesDunDepartement();
                	recherche6.traiter(recensement,scanner);
                	break;
                case 7:
                	Afficher10VillesPlusPeupleesDuneRegion recherche7 = new Afficher10VillesPlusPeupleesDuneRegion();
                	recherche7.traiter(recensement,scanner);
                	break;
                case 8:
                	Affiche10VillesPlusPeupleesFrance recherche8 = new Affiche10VillesPlusPeupleesFrance();
                	recherche8.traiter(recensement,scanner);
                	break;
               
                case 9:
                    continuer = false; // Sortir
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et 9.");
            }
        }

        scanner.close();
    }

    public static void afficherMenu() {
        System.out.println("Menu:");
        System.out.println("1. Population d’une ville donnée");
        System.out.println("2. Population d’un département donné");
        System.out.println("3. Population d’une région donnée");
        System.out.println("4. Afficher les 10 régions les plus peuplées");
        System.out.println("5. Afficher les 10 départements les plus peuplés");
        System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
        System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
        System.out.println("8. Afficher les 10 villes les plus peuplées de France");
        System.out.println("9. Sortir");
        System.out.println("Veuillez choisir une option :");
    }
}