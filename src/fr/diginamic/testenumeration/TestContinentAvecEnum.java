package fr.diginamic.testenumeration;

import java.util.ArrayList;



public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		ArrayList <VillesContinent> ListeVillesContinent = new ArrayList<>();
		
		ListeVillesContinent.add(new VillesContinent("New York", "Amérique"));
		ListeVillesContinent.add(new VillesContinent("Paris", "Europe")); 
        ListeVillesContinent.add(new VillesContinent("Pékin", "Océanie"));
        ListeVillesContinent.add(new VillesContinent("Moscou", "Europe"));
        ListeVillesContinent.add(new VillesContinent("Berlin", "Europe"));
        ListeVillesContinent.add(new VillesContinent("Sydney", "Océanie"));
        ListeVillesContinent.add(new VillesContinent("Sao Paulo", "Amérique"));
        ListeVillesContinent.add(new VillesContinent("Dakar", "Afrique"));
       
        
        for(VillesContinent lVC : ListeVillesContinent) {
        	System.out.println(lVC);
        }
       
	}

}
