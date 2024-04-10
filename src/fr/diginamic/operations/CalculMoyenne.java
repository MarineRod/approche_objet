package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] tableau;
    private int taille;
    
    // Constructeur prenant en compte une capacité initiale
    public CalculMoyenne(int capaciteInitiale) {
        this.tableau = new double[0];
        this.taille = 0;
    }

    // Méthode pour ajouter un double au tableau
    public void ajout(double nombre) {
        if (taille == tableau.length) {
            // Si le tableau est plein, agrandir sa capacité
            tableau = Arrays.copyOf(tableau, taille + 1);
        }
        tableau[taille++] = nombre;
    }

    // Méthode pour calculer la moyenne des éléments du tableau
    public double calcul() {
        if (taille == 0) {
            throw new IllegalStateException("Le tableau est vide.");
        }
        double somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }
        return somme / taille;
    }

    // Méthode pour obtenir le tableau (pour vérification ou autre usage)
    public double[] getTableau() {
        return Arrays.copyOf(tableau, taille);
    }
}
