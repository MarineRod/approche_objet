package operations;

import operations.Operations;
import operations.Debit;
import operations.Credit;

public class TestOperation {

	public static void main(String[] args) {
		
	
		Operations[] operationsTab = new Operations[4];
		
		
		operationsTab[0] = new Operations("240101", 1000.0);
		operationsTab[1] = new Operations("300620", -200.0);
		operationsTab[2] = new Operations("070823", 750.0);
		operationsTab[3] = new Operations("100424", -30.0);
		
		
		
		
		for(int i=0; i< operationsTab.length; i++) {
			System.out.println("Operations " + (i + 1) + ": " + operationsTab[i]);
		}


	}

	

}
