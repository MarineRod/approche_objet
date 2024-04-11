package sets;

import java.util.HashSet;

import sets.Pays;

public class TestPays {

	public static void main(String[] args) {
		
		HashSet<Pays> setPays = new HashSet<>();
		
		// Ajout des pays avec leurs habitants et leurs PIB
		setPays.add(new Pays("Italie", 343000));
		setPays.add(new Pays("Allemagne", 47800));
		setPays.add(new Pays("USA", 53400));
		setPays.add(new Pays("Inde", 484000));
		setPays.add(new Pays("UK", 9700));
		setPays.add(new Pays("Japon", 77200));
		setPays.add(new Pays("Chine", 850700));
		setPays.add(new Pays("Russie", 40600));
		setPays.add(new Pays("France", 40600));

	}

}
