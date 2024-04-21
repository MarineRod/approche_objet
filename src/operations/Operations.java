package operations;

public abstract class Operations {
	
	private String date;
	private double montant;
	
	
	public Operations(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	
	public abstract String getType();

	public String getdate() {
		return date;
	}


	public void setdate(String date) {
		this.date = date;
	}


	public double getmontant() {
		return montant;
	}


	public void setmontant(double montant) {
		this.montant = montant;
	}
	
	

}
