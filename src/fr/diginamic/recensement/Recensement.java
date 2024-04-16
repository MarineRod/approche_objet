package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {

	private List<Ville> villes;

	public Recensement() {
		this.villes = new ArrayList<>();
	}
 
	


	public Recensement(List<Ville> villes) {
		super();
		this.villes = villes;
	}




	public void ajouterVilles(ArrayList<String> recensement) {
		for (String line : recensement) {
			String[] tokens = line.split(";");
			String codeRegion = tokens[0];
			String nomRegion = tokens[1];
			String codeDepartement = tokens[2];
			String codeCommune = tokens[3];
			String nomCommune = tokens[4];
			int populationTotale = Integer.parseInt(tokens[5]);

			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
			villes.add(ville);
		}
	}

	public void ajouterVille(Ville ville) {
		villes.add(ville);
	}

	public void supprimerVille(Ville ville) {
		villes.remove(ville);
	}
	// Getter pour les villes
    public List<Ville> getVilles() {
        return villes;
    }
    
    //setter pour les villes
    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }
}