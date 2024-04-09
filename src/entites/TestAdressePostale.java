package entites;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale(2, "Impasse Guillaume Brune", 85000, "La Roche sur Yon" );
	   
		
	    AdressePostale adr2 = new AdressePostale(3, "Maréchal Geoffre", 07200, "Aubenas" );
	    
	    
	    System.out.println(adr1.numRue + " "+ adr1.libellRue );
	    System.out.println(adr2.numRue + " "+ adr2.libellRue );

	}

}
