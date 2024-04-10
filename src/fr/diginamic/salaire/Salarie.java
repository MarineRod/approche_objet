package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	
	private double salaireMensuel;
	

	public Salarie(String statut, String nom, String prenom, double salaireMensuel) {
		super(statut, nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}

	
	@Override
	public String getStatut() {
		return "journaliste";
	}
}
