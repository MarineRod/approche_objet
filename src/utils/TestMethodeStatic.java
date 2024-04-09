package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {

		String chaine = "123"; // Chaîne de caractères à convertir en entier
		int entier = Integer.parseInt(chaine);

		
		// Assignation de la valeur de entier aux variables a et b
		int a = 12;
		int b = 14;

		// Utilisation de la méthode max() pour obtenir le maximum entre a et b
		int max = Integer.max(a, b);
     
		System.out.println(max);
	}

}
