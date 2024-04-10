package fr.diginamic.chaines;

import java.util.Arrays;

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);

		int longueur = chaine.length();
		System.out.println("Premier caractère: " + longueur);

		int indexPremierPointVirgule = chaine.indexOf(";");

		if (indexPremierPointVirgule != -1) {
			System.out.println("Index du premier ';' : " + indexPremierPointVirgule);
		} else {
			System.out.println("Le caractère ';' n'a pas été trouvé dans la chaîne.");
		}

		String sousChaine = chaine.substring(0, 10);
		System.out.println("La portion de caractères entre 0 et 10 est : " + sousChaine);

		String sousChaine2 = chaine.substring(0, indexPremierPointVirgule);
		System.out.println("La nom de famille est : " + sousChaine2);
		String nomCapital = sousChaine2.toUpperCase();
		System.out.println("La nom de famille en lettres capitales est : " + nomCapital);
		String nomMinuscule = sousChaine2.toLowerCase();
		System.out.println("La nom de famille en lettres minuscules est : " + nomMinuscule);

		String[] morceauxTab = chaine.split(";");
		System.out.println("Tableau obtenu : " + Arrays.toString(morceauxTab));
		
		double salaireCorecte =  Double.parseDouble("2 523.5".replace(" ", ""));
 
		System.out.println(salaireCorecte);
		
		

	}

	

}
