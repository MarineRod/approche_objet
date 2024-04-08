package entites;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale();
	    adr1.numRue = 2;
	    adr1.libellRue = "Impasse Guillaume Brune";
	    adr1.codePostal = 85000;
	    adr1.ville = "La Roche sur Yon";
		
	    AdressePostale adr2 = new AdressePostale();
	    adr1.numRue = 3;
	    adr1.libellRue = "Maréchal Geoffre";
	    adr1.codePostal = 07200;
	    adr1.ville = "Aubenas";

	}

}
