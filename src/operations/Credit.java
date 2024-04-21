package operations;

public class Credit extends Operations {
   
	// lors de la création d'un nouvel objet de la classe Credit, 
	//la date et le montant de l'opération sont initialisés en appelant 
	//le constructeur de la classe mère Operations
	public Credit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String getType() {
		return "CREDIT";
	}

}
