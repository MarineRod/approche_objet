package operations;

import operations.Operations;

public class Debit extends Operations {
	
    super(date, montant);

	
	@Override
	public String getType(){
		return "DEBIT";
	}

}
