package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons ) {
			
			System.out.println(saison);
		}
	  String nom = "ETE";
      Saison selection = Saison.valueOf(nom);
      System.out.println(selection);
      
      String libelle = "Hiver";
      Saison saisonHiver = Saison.obtenirSaison(libelle);
      System.out.println(saisonHiver);
	}

}
