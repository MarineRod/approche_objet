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

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

    
   
    
}