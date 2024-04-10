package fr.diginamic.formes;
import fr.diginamic.formes.Forme;

public class Cercle extends Forme{

	private int rayon;

	public Cercle(int rayon) {
		super();
		this.rayon = rayon;
	}
	
	@Override
    public double calculerSurface() {
        return Math.PI * rayon*rayon;
    }

    @Override
    public double calculerPerimetre() {
    	return 2* Math.PI *rayon;
    	
    }
	
}
