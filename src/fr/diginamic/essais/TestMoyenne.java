package fr.diginamic.essais;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        // Test 1
        CalculMoyenne moyenne1 = new CalculMoyenne(0);
        moyenne1.ajout(10);
        moyenne1.ajout(35.5);
        moyenne1.ajout(30);
        System.out.println("Moyenne du test 1: " + moyenne1.calcul());

        // Test 2
        CalculMoyenne moyenne2 = new CalculMoyenne(0);
        moyenne2.ajout(5);
        moyenne2.ajout(150);
        moyenne2.ajout(18);
        moyenne2.ajout(26.3);
        System.out.println("Moyenne du test 2: " + moyenne2.calcul());
    }
}