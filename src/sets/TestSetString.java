package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> villes = new HashSet<>();

		// Ajout des éléments donnés au HashSet

		// USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
		villes.add("USA");
		villes.add("France");
		villes.add("Allemagne");
		villes.add("UK");
		villes.add("Italie");
		villes.add("Japon");
		villes.add("Chine");
		villes.add("Russie");
		villes.add("Inde");

		System.out.println(villes);

		// Recherchez le pays dans cette liste qui a le plus grand nombre de lettres

		String villePlusLongue = "";
		for (String ville : villes) {
			if (ville.length() > villePlusLongue.length()) {
				villePlusLongue = ville;

			}

		}
		System.out.println(villePlusLongue);
		villes.remove(villePlusLongue);
		System.out.println(villes);
	}
}
