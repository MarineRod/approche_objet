package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	
	private int NbJoursTravaillesMois;
	private double salaireJournalierMois;



	public Pigiste(String statut, String nom, String prenom, int nbJoursTravaillesMois, double salaireJournalierMois) {
		super(statut, nom, prenom);
		NbJoursTravaillesMois = nbJoursTravaillesMois;
		this.salaireJournalierMois = salaireJournalierMois;
	}


	@Override
	public double getSalaire() {
		return NbJoursTravaillesMois * salaireJournalierMois;
	}
	
	
	@Override
	public String getStatut() {
		return "pigiste";
	}

}