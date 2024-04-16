package essaiEquals;

public class TestEquals {

	public static void main(String[] args) {

		Ville v1 = new Ville("Auvergne", "07");
		Ville v2 = new Ville("Auvergne", "08");

		// if(v1.equals(v2)) {
		// System.out.println("les villes sont identiques");
		// }
		// else {
		// System.out.println("les villes sont différentes");
		// }

		if (v1==v2) {
			System.out.println("les villes sont identiques");
		} else {
			System.out.println("les villes sont différentes");
		}
	}

}
