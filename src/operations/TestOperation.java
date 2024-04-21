package operations;

public class TestOperation {

	public static void main(String[] args) {

		Operations[] operationsTab = new Operations[4];

		operationsTab[0] = new Credit("24/01/01", 1000.0);
		operationsTab[1] = new Debit("30/06/20", -200.0);
		operationsTab[2] = new Credit("07/08/23", 750.0);
		operationsTab[3] = new Debit("10/04/24", -30.0);

		double somme = 0;

		for (int i = 0; i < operationsTab.length; i++) {

			System.out.println("Operations " + (i + 1) + ": " + operationsTab[i].getType() + " "
					+ operationsTab[i].getdate() + " " + operationsTab[i].getmontant() + " euros");

			somme += operationsTab[i].getmontant();

		}
		System.out.println("Montant global : " + somme);
	}

}
