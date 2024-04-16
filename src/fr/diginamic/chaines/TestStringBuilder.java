package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		//long debut = System.currentTimeMillis();

		
		//StringBuilder builder = new StringBuilder();
				// for (int i = 1; i <= 100000; i++) {
			         //   builder.append(i);
			  //      }
				
		//long fin = System.currentTimeMillis();
		//System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		
		long debut = System.currentTimeMillis();
		
		String result = "";
        for (int i = 1; i <= 100000; i++) {
            result += i;
        }
        
        long fin = System.currentTimeMillis();
        
      System.out.println("Temps écoulé en millisecondes :" + (fin - debut));;
	}

}
