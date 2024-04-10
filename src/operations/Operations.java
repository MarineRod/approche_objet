package operations;

public class Operations {
	
	private String dateOperation;
	private double montantOperation;
	
	
	public Operations(String dateOperation, double montantOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	
	public abstract String getType();

	public String getDateOperation() {
		return dateOperation;
	}


	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}


	public double getMontantOperation() {
		return montantOperation;
	}


	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}
	
	

}
