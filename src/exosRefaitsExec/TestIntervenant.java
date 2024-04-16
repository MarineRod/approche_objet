package exosRefaitsExec;

import exosRefaits.Pigiste;
import exosRefaits.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie sa1 = new Salarie("Rots", "Jean-Paul", "Pigiste", 2000);
		Pigiste p1 = new Pigiste("Loude", "Myriam", "Salarié", 24, 56.5);
		System.out.println("Le salaire de : " + sa1.getPrenom() + " est de : " + sa1.getSalaire());
		System.out.println("Le salaire de : " + p1.getPrenom() + " est de : " + p1.getSalaire());
        
		sa1.afficherDonnees();
		p1.afficherDonnees();
	}

}
