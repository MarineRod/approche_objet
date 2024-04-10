package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char operateur) {
        switch (operateur) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.err.println("Erreur : division par zéro.");
                    return Double.NaN; // Retourne NaN (Not a Number) en cas de division par zéro
                }
            default:
                System.err.println("Erreur : opérateur non valide.");
                return Double.NaN; // Retourne NaN en cas d'opérateur non valide
        }
    }
}


