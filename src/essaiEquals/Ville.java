package essaiEquals;

public class Ville {
	
	private String nomRegion;
	private String nomDepartement;
	
	
	


	
	




	



	public Ville(String nomRegion, String nomDepartement) {
		super();
		this.nomRegion = nomRegion;
		this.nomDepartement = nomDepartement;
	}







	@Override
	public boolean equals(Object obj) {

     if(!(obj instanceof Ville)) {
		return false;
		
     }
     
     Ville autre = (Ville)obj;
     
     return this.nomRegion == autre.getNomRegion() && this.nomDepartement.equals(autre.getNomDepartement());
	}







	public String getNomRegion() {
		return nomRegion;
	}







	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}







	public String getNomDepartement() {
		return nomDepartement;
	}







	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}






	
	
	
}