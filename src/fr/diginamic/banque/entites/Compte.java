package fr.diginamic.banque.entites;

public class Compte {

	private String numero;
	private double solde;

	public Compte(String numero, double solde) {

		this.numero = numero;
		this.solde = solde;

	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}

	public String getNumCompte() {
		return numero;
	}

	public void setNumCompte(String numero) {
		this.numero = numero;
	}

	public double getSoldeCompte() {
		return solde;
	}

	public void setSoldeCompte(double solde) {
		this.solde = solde;
	}

}
