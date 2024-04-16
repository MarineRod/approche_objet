package sets;


import java.util.HashSet;



public class TestPays {

	public static void main(String[] args) {

		HashSet<Pays> setPays = new HashSet<>();

		// Ajout des pays avec leurs habitants et leurs PIB
		setPays.add(new Pays("Italie", 60000000, 33000.0));
		setPays.add(new Pays("Allemagne", 83000000, 44000.0));
		setPays.add(new Pays("USA", 331000000, 56000.0));
		setPays.add(new Pays("Inde", 1400000000, 5000.0));
		setPays.add(new Pays("UK", 68000000, 37000.0));
		setPays.add(new Pays("Japon", 126000000, 35000.0));
		setPays.add(new Pays("Chine", 1400000000, 14000.0));
		setPays.add(new Pays("Russie", 145000000, 24000.0));
		setPays.add(new Pays("France", 67000000, 39000.0));

		Pays paysAvecMaxPIBparHabitant = null;
		double maxPIBparHab = Double.MIN_VALUE;
		for (Pays pays : setPays) {
			if (pays.getPibHab() > maxPIBparHab) {
				maxPIBparHab = pays.getPibHab();
				paysAvecMaxPIBparHabitant = pays;

			}

		}
		System.out.println(paysAvecMaxPIBparHabitant);

		Pays paysPibTotPlusImp = null;
		double pibTotPlusImp = Double.MIN_VALUE;
		for (Pays pays : setPays) {
			if (pays.getPIBTotal() > pibTotPlusImp) {
				pibTotPlusImp = pays.getPIBTotal();
				paysPibTotPlusImp = pays;

			}

		}
		System.out.println(paysPibTotPlusImp);

		// Recherche du pays avec le PIB total le plus petit
		Pays paysAvecMinPIBTotal = null;
		double minPIBTotal = Double.MAX_VALUE;
		for (Pays pays : setPays) {
			double PIBTotal = pays.getPIBTotal();
			if (PIBTotal < minPIBTotal) {
				minPIBTotal = PIBTotal;
				paysAvecMinPIBTotal = pays;
			}
		}
		System.out.println(paysAvecMinPIBTotal);

		for (Pays pays : setPays) {
			if (pays.equals(paysAvecMinPIBTotal)) {
				pays.nom = pays.nom.toUpperCase();
			}
		}
		System.out.println(paysAvecMinPIBTotal);
		setPays.remove(paysAvecMinPIBTotal);
		
		System.out.println(setPays);
		
	}

}
