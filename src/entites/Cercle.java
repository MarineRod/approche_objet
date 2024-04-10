package entites;

public class Cercle {

		    // Attribut d'instance
		    private double rayon;

		    // Constructeur
		    public Cercle(double rayon) {
		        this.rayon = rayon;
		    }

		    // Méthode pour calculer le périmètre du cercle
		    public double calculerPerimetre() {
		        return 2 * Math.PI * rayon;
		    }

		    // Méthode pour calculer la surface du cercle
		    public double calculerSurface() {
		        return Math.PI * rayon * rayon;
		    }

		   
		
	

	

}
