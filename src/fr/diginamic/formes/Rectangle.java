package fr.diginamic.formes;
import fr.diginamic.formes.Forme;

public class Rectangle extends Forme{
	
	private int longueur;
	private int largeur;
	
	
	public Rectangle(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
    public double calculerSurface() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * longueur + 2 * largeur;
	
	
    }

}

