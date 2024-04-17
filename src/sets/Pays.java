package sets;

import java.util.Objects;

public class Pays {
	// 3 attributs : nom, nb d’habitants, PIB/habitant.
	protected String nom;
	private int nbHabitants;
	private double pibHab;

	public Pays(String nom, int nbHabitants, double pibHab) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHab = pibHab;
	}

	public double getPIBTotal() {
		return (double) nbHabitants * pibHab;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pibHab=" + pibHab + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nbHabitants, nom, pibHab);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		return nbHabitants == other.nbHabitants && Objects.equals(nom, other.nom)
				&& pibHab == other.pibHab;
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

	public double getPibHab() {
		return pibHab;
	}

	public void setPibHab(int pibHab) {
		this.pibHab = pibHab;
	}

}
