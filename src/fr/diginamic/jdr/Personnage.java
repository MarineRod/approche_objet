package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {
	
	private int force;
	private int pointsDeVie;
	private int score;
	
	
	
	public Personnage(int force, int pointsDeVie, int score) {
		super();
		this.force = force;
		this.pointsDeVie = pointsDeVie;
		this.score = score;
	}


	public void VotreClasse() {
        Random random = new Random();
        force = random.nextInt(7) + 12; // Génère un nombre aléatoire entre 0 et 6 et ajoute 12
        pointsDeVie = random.nextInt(31) + 20; // points de vie entre 20 et 50
        score = 0;
    
   
	  //Méthode qui va permettre au personnage d'engager le combat
       if(pointsDeVie>0) {
    	   System.out.println("Combat engagé !");
       }else {
    	   System.out.println("Votre personnage est décédé. Il a obtenu un score de "+pointsDeVie+"  points Veuillez créer un nouveau personnage");
    	   
       }
       
	}
       
    // Méthode pour combattre la créature
	  
	 
       public void combattreCreature(Creature creature) {
    	   
    	   int pointsDeVieCreature = creature.getPointsDeVie();
    	   
           if (pointsDeVie > 0 && pointsDeVieCreature > 0) {
               
               System.out.println("Combat engagé !");
           } else {
               System.out.println("La créature ou le personnage est décédé. Le combat est impossible.");
           }
       
	  
  }
	
}
