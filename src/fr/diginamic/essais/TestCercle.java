package fr.diginamic.essais;
import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        // Utilisation de la méthode statique de CercleFactory pour créer les cercles
        Cercle cercle1 = CercleFactory.creerCercle(5.0);
        Cercle cercle2 = CercleFactory.creerCercle(7.5);

        // Affichage des résultats des méthodes de calcul de périmètre et de surface
        System.out.println("Périmètre du cercle 1 : " + cercle1.calculerPerimetre());
        System.out.println("Surface du cercle 1 : " + cercle1.calculerSurface());

        System.out.println("Périmètre du cercle 2 : " + cercle2.calculerPerimetre());
        System.out.println("Surface du cercle 2 : " + cercle2.calculerSurface());
    }
}