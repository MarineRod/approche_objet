package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {

		ArrayList<VillesContinent> ListeVillesContinent = new ArrayList<>();

		ListeVillesContinent.add(new VillesContinent("New York", Continent.AMERIQUE));
		ListeVillesContinent.add(new VillesContinent("Paris", Continent.EUROPE));
		ListeVillesContinent.add(new VillesContinent("Pékin", Continent.OCEANIE));
		ListeVillesContinent.add(new VillesContinent("Moscou", Continent.EUROPE));
		ListeVillesContinent.add(new VillesContinent("Berlin", Continent.EUROPE));
		ListeVillesContinent.add(new VillesContinent("Sydney", Continent.OCEANIE));
		ListeVillesContinent.add(new VillesContinent("Sao Paulo", Continent.AMERIQUE));
		ListeVillesContinent.add(new VillesContinent("Dakar", Continent.AFRIQUE));

		for (VillesContinent lVC : ListeVillesContinent) {
			System.out.println(lVC);
		}

	}

}
