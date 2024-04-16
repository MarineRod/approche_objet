package sets;

import java.util.HashSet;


public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> pays = new HashSet<>();

		// Ajout des éléments donnés au HashSet

		// USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("UK");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");

		System.out.println(pays);

//		// Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
//
		String paysPlusLongueLettres = "";
		for (String p : pays) {
			if (p.length() > paysPlusLongueLettres.length()) {
				paysPlusLongueLettres = p;

			}

		}
		
		
		pays.remove(paysPlusLongueLettres);
		System.out.println(pays);

		
		

//		Iterator<String> it = pays.iterator();
//		while (it.hasNext()) {
//			String p = it.next();
//			if (p.equals(paysPlusLongueLettres)) {
//				it.remove();
//			}
//		}
		
		
	}
}
