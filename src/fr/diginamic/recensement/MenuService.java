package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService {
	
	//Cette méthode est destinée à être utilisée pour traiter les options du menu qui nécessitent d'accéder
	//aux données du recensement et à l'entrée de l'utilisateur via le scanner.
	
	public abstract void traiter(Recensement recensement, Scanner scanner);

}
