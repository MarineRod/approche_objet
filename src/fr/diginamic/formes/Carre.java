package fr.diginamic.formes;
import fr.diginamic.formes.Forme;

public class Carre extends Forme {

	private int longueur;

	public Carre(int longueur) {
		super();
		this.longueur = longueur;
	}
	
	@Override
    public double calculerSurface() {
        return longueur * longueur;
    }

    @Override
    public double calculerPerimetre() {
        return 4 * longueur;
	
	
    }
}
