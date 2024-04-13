package maps;


import java.util.HashMap;
import java.util.Iterator;





public class ComptagePaysParContinent {

	public static void main(String[] args) {

		
		HashMap<String, Pays> mapPays = new HashMap<>();
		mapPays.put("01",new Pays("France", 65000000, "Europe"));
		mapPays.put("02",new Pays("Allemagne", 80000000, "Europe"));
		mapPays.put("03",new Pays("Belgique", 10000000, "Europe"));
		mapPays.put("04",new Pays("Russie", 150000000, "Asie"));
		mapPays.put("05",new Pays("Chine", 1400000000, "Asie" ));
		mapPays.put("06",new Pays("Indonésie", 220000000, "Océanie"));
		mapPays.put("07",new Pays("Australie", 20000000, "Océanie"));
		
		
		
		// La HashMap appelée comptage va stocker les compteurs (Integer) par continent (String)
				HashMap<String, Integer> comptage = new HashMap<>();
				
				Iterator<Pays> iterPays = mapPays.values().iterator();
				while (iterPays.hasNext()) {
					Pays pays = iterPays.next(); 
					
					String continent = pays.getContinent(); 
					Integer compteur = comptage.get(continent); 
					
					if (compteur==null) {
						comptage.put(continent, 1);
					}
					else {
						compteur++;
						comptage.put(continent, compteur);
					}
				}
				
				System.out.println(comptage);
				
				
			}

		}