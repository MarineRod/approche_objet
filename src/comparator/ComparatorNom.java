package comparator;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Villes> {

	@Override
	public int compare(Villes v1, Villes v2) {
		return v1.getNom().compareTo(v2.getNom());

	}

}
