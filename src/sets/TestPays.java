package sets;


import java.util.HashSet;



public class TestPays {

	public static void main(String[] args) {

		HashSet<Pays> setPays = new HashSet<>();

		// Ajout des pays avec leurs habitants et leurs PIB
		setPays.add(new Pays("Italie", 60000000, 33000));
		setPays.add(new Pays("Allemagne", 83000000, 44000));
		setPays.add(new Pays("USA", 331000000, 56000));
		setPays.add(new Pays("Inde", 1400000000, 5000));
		setPays.add(new Pays("UK", 68000000, 37000));
		setPays.add(new Pays("Japon", 126000000, 35000));
		setPays.add(new Pays("Chine", 1400000000, 14000));
		setPays.add(new Pays("Russie", 145000000, 24000));
		setPays.add(new Pays("France", 67000000, 39000));

		Pays paysAvecMaxPIBparHabitant = null;
		int maxPIBparHab = Integer.MIN_VALUE;
		for (Pays pays : setPays) {
			if (pays.getPibHab() > maxPIBparHab) {
				maxPIBparHab = pays.getPibHab();
				paysAvecMaxPIBparHabitant = pays;

			}

		}
		System.out.println(paysAvecMaxPIBparHabitant);

		Pays paysPibTotPlusImp = null;
		int pibTotPlusImp = Integer.MIN_VALUE;
		for (Pays pays : setPays) {
			if (pays.getPIBTotal() > pibTotPlusImp) {
				pibTotPlusImp = pays.getPIBTotal();
				paysPibTotPlusImp = pays;

			}

		}
		System.out.println(paysPibTotPlusImp);

		// Recherche du pays avec le PIB total le plus petit
		Pays paysAvecMinPIBTotal = null;
		int minPIBTotal = Integer.MAX_VALUE;
		for (Pays pays : setPays) {
			int PIBTotal = pays.getPIBTotal();
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
