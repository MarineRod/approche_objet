package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie sa1 = new Salarie("McCoy", "James","journaliste", 2000.00);
		Pigiste p1 = new Pigiste ("Wood","Charles", "pigiste" ,  20, 48.5);
		
		double salaireSa1 = sa1.getSalaire();
        System.out.println("Le salaire de du salarié 1 :" +salaireSa1);
        
        double salaireP1 = p1.getSalaire();
        System.out.println("Le salaire de du pigiste 1 :" +salaireP1);
        
        
        sa1.afficherDonnees();
        p1.afficherDonnees();
        
      
	}

}
