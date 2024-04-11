package listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
      //ArrayList<Integer> liste = new ArrayList<>();
		ArrayList<Integer> nouvelleListe = new ArrayList<>();
		nouvelleListe.add(-1);
		nouvelleListe.add(5);
		nouvelleListe.add(7);
		nouvelleListe.add(3);
		nouvelleListe.add(-2);
		nouvelleListe.add(4);
		nouvelleListe.add(8);
		nouvelleListe.add(5);

		System.out.println(nouvelleListe);
		System.out.println(nouvelleListe.size());

		// Recherchez et affichez le plus grand élément de la liste
		int max = Integer.MIN_VALUE;
		for (int nombre : nouvelleListe) {
			if (nombre > max) {
				max = nombre;
			}

		}
		System.out.println("Plus grand élément de la liste : " + max);

		// Supprimez le plus petit élément de la liste et affichez le résultat
		ArrayList<Integer> suppression = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		for (int nombre : nouvelleListe) {
			if (nombre < min) {
				min = nombre;
				System.out.println("Plus petit élément de la liste : " + min);
				suppression.add(min);

			}

		}

		//nouvelleListe.remove(suppression);
		//System.out.println(nouvelleListe);

		// Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils
		// deviennent positifs.
		int i = 0;
        for (int nombre : nouvelleListe) {
            if (nombre < 0) {
                nouvelleListe.set(i, Math.abs(nombre));
            }
            i++;
        }
        
        System.out.println("Liste mise à jour après modification des éléments négatifs en positifs : " + nouvelleListe);
    
				
			
				
				
          
			}

	

	}


