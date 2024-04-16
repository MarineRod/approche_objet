package exosRefaits;

public class Theatre {

	private String nom;
	private int capaciteMax;
	private int clientsInscritsTot;
	private double recetteTot;

	public Theatre(String nom, int capaciteMax, int clientsInscritsTot, double recetteTot) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.clientsInscritsTot = clientsInscritsTot;
		this.recetteTot = recetteTot;
	}

	public  void inscrire(int nbClients,int prixPlace ) {
		
		
		if(clientsInscritsTot + nbClients<=capaciteMax) {
			
			clientsInscritsTot += nbClients;
			recetteTot +=nbClients*prixPlace;
			System.out.println("Vous venez de réserver " + nbClients + " place.");
		}
		
		else {
			
			System.out.println("Il n'y a plus de place");
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

	public int getClientsInscritsTot() {
		return clientsInscritsTot;
	}

	public void setClientsInscritsTot(int clientsInscritsTot) {
		this.clientsInscritsTot = clientsInscritsTot;
	}

	public double getRecetteTot() {
		return recetteTot;
	}

	public void setRecetteTot(double recetteTot) {
		this.recetteTot = recetteTot;
	}

}
