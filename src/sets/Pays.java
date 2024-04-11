package sets;

public class Pays {
	//3 attributs : nom, nb d’habitants, PIB/habitant.
	private String nom;
	private int nbHabitants;
	private int pibHab;
	
	
	public Pays(String nom, int nbHabitants, int pibHab) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHab = pibHab;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbHabitants() {
		return nbHabitants;
	}


	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}


	public int getPibHab() {
		return pibHab;
	}


	public void setPibHab(int pibHab) {
		this.pibHab = pibHab;
	}
	
	 @Override
	    public String toString() {
	        return nom + ", " + nbHabitants + " hab." + pibHab + "pibHab";
	    }

}
