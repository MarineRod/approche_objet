
package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 3.0;

        // Addition
        double resultatAddition = Operations.calcul(a, b, '+');
        System.out.println("Résultat de l'addition : " + resultatAddition);

        // Soustraction
        double resultatSoustraction = Operations.calcul(a, b, '-');
        System.out.println("Résultat de la soustraction : " + resultatSoustraction);

        // Multiplication
        double resultatMultiplication = Operations.calcul(a, b, '*');
        System.out.println("Résultat de la multiplication : " + resultatMultiplication);

        // Division
        double resultatDivision = Operations.calcul(a, b, '/');
        System.out.println("Résultat de la division : " + resultatDivision);
    }
}