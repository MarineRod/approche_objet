package entites;

public class Theatre {

	private String nom;
	private int capaciteMax;
	private int totalClientsInscrits;
	private double recetteTot;

	public Theatre(String nom, int capaciteMax, int totalClientsInscrits, double recetteTot) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.totalClientsInscrits = totalClientsInscrits;
		this.recetteTot = recetteTot;
	}

	public void inscrire(int nbClients, int prixPlace) {

		if (totalClientsInscrits + nbClients <= capaciteMax) {

			totalClientsInscrits += nbClients;
			recetteTot += (nbClients * prixPlace);
			System.out.println("Vous venez de réserver " + nbClients + " place.");
		} else {
			System.err.println("Il ne reste plus de places.");
		}

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getTotalClientsInscrits() {
		return totalClientsInscrits;
	}

	public void setTotalClientsInscrits(int totalClientsInscrits) {
		this.totalClientsInscrits = totalClientsInscrits;
	}

	public double getRecetteTot() {
		return recetteTot;
	}

	public void setRecetteTot(double recetteTot) {
		this.recetteTot = recetteTot;
	}

}
