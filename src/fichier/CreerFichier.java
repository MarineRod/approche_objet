package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;


public class CreerFichier {
	
	public static void main(String[] args) throws IOException {
		
		

		Path path = Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/recensement.csv");
		List<String> liste = Files.readAllLines(path);
	
		
		System.out.println(liste);
		
		//Créer un fichier qui ne contient que les 100 premières lignes
		ArrayList<String> selection = new ArrayList<>();
		
		
		for (int i = 0; i <=100; i++) {
		    String ligne = liste.get(i); 
	     
		    System.out.println(ligne);
		    
		    selection.add(ligne);
		}
		
		
		//Je crée le nouveau fichier qui ne contient que les 100 premières lignes
		Path pathDest =Paths.get("D:/Diginamic/06. Langage Java - Approche orientée objet/TP/selection.csv");
		Files.write(pathDest,selection);
		
      
	}
	
}

