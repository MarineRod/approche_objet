package exosRefaits;

public class Salarie extends Intervenant{
	
	private double montantSalaireMensuel;
	

	public Salarie(String nom, String prenom, String statut, double montantSalaireMensuel) {
		super(nom, prenom, statut);
		this.montantSalaireMensuel = montantSalaireMensuel;
	}


	@Override
	public double getSalaire() {
		
		return montantSalaireMensuel;
	}


	@Override
	public String getStatut() {
		
		return "Salarié";
	}
	
	

}
