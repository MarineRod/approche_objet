package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cpt1 = new Compte ("12548", 3500.00);
		Compte cpt2 = new Compte ("12645", 4000.00);
		
		System.out.println(cpt1.getNumCompte());
		System.out.println(cpt2);

	}

}
