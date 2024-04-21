package operations;


public class Debit extends Operations {
	
	public Debit(String date, double montant) {
		super(date, montant);
	}

	
	@Override
	public String getType(){
		return "DEBIT";
	}

}
