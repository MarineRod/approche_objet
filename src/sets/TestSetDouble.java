package sets;

import java.util.HashSet;

import listes.Ville;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> setDoubles = new HashSet<>();

		// Ajout des éléments donnés au HashSet
		setDoubles.add(1.5);
		setDoubles.add(8.25);
		setDoubles.add(-7.32);
		setDoubles.add(13.3);
		setDoubles.add(-12.45);
		setDoubles.add(48.5);
		setDoubles.add(0.01);

		System.out.println(setDoubles);

		// Recherchez le plus grand élément de la collection

		double plusGrandElement = Double.MIN_VALUE;
		for (double setDou : setDoubles) {
			if (setDou > plusGrandElement) {
				plusGrandElement = setDou;

			}
		}
        System.out.println(plusGrandElement);
        
        
        // Supprimez le plus petit élément de la collection
        
        double plusPetitElement = Double.MAX_VALUE;
		for (double setDou : setDoubles) {
			if (setDou < plusPetitElement) {
				plusPetitElement = setDou;

			}
		}
		
		System.out.println(plusPetitElement);
		setDoubles.remove(plusPetitElement);
		System.out.println(setDoubles);
	}
}