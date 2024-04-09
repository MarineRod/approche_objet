package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cpt1 = new Compte ("12548", 3500.00);
		Compte cpt2 = new Compte ("12645", 4000.00);
		
		System.out.println(cpt1.getNumCompte());
		System.out.println(cpt2);
		
		Compte[] comptesTab = new Compte[2];
		
		comptesTab[0] = new Compte("123456", 1000.0);
		
		comptesTab[1] = new CompteTaux("789012", 2000.0, 0.05);
		
		for(int i=0; i< comptesTab.length; i++) {
			System.out.println("Compte " + (i + 1) + ": " + comptesTab[i]);
		}

	}

}
