package exosRefaits;

public class Pigiste extends Intervenant {
	
	private int nbJoursTravaillesMois;
    private double montantJournalierRemuneration;
    
    


	public Pigiste(String nom, String prenom, String statut, int nbJoursTravaillesMois,
			double montantJournalierRemuneration) {
		super(nom, prenom, statut);
		this.nbJoursTravaillesMois = nbJoursTravaillesMois;
		this.montantJournalierRemuneration = montantJournalierRemuneration;
	}




	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return montantJournalierRemuneration*nbJoursTravaillesMois;
		
	}




	public String getStatut() {
		return "Pigiste";
	}
    
    

}
