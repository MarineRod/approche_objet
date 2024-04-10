package fr.diginamic.jdr;

import java.util.Random;

public class Creature {
    private int force;
    private int pointsDeVie;

    // Constructeur 
    public Creature() {
        Random random = new Random();
        this.force = random.nextInt(7) + 12; // force entre 12 et 18
        this.pointsDeVie = random.nextInt(31) + 20; // points de vie entre 20 et 50
    }

    // Méthode pour combattre le personnage
    public void combattrePersonnage(Personnage personnage) {
        if (pointsDeVie > 0 && personnage.pointsDeVie > 0) {
            
            System.out.println("Combat engagé !");
        } else {
            System.out.println("La créature ou le personnage est décédé. Le combat est impossible.");
        }
    }

    
}