package comparator;

import java.util.Comparator;


public class ComparatorHabitant implements Comparator<Villes> {

	@Override
	public int compare(Villes v1, Villes v2) {
		return Integer.compare(v1.getPopTot(), v2.getPopTot());

	}

}
