package tri;

	


	public class VillesTri implements Comparable <VillesTri>{
		
		protected String nom;
		protected String codeDepartement;
		protected String NomRegion;
		protected int popTot;
		

		

		public VillesTri(String nom, String codeDepartement, String nomRegion, int popTot) {
			super();
			this.nom = nom;
			this.codeDepartement = codeDepartement;
			NomRegion = nomRegion;
			this.popTot = popTot;
		}

		@Override
		public int compareTo(VillesTri autre) {
			
			if(autre.getPopTot() <this.popTot) {
				return -1;
			}
			else if (autre.getPopTot()>this.popTot) {
				return 1;
			}
			
			return 0;
		}

		@Override
		public String toString() {
			return "Nom=" + nom + ", codeDepartement=" + codeDepartement + ", NomRegion=" + NomRegion + ", popToT="
					+ popTot ;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getCodeDepartement() {
			return codeDepartement;
		}

		public void setCodeDepartement(String codeDepartement) {
			this.codeDepartement = codeDepartement;
		}

		public String getNomRegion() {
			return NomRegion;
		}

		public void setNomRegion(String nomRegion) {
			NomRegion = nomRegion;
		}

		public int getPopTot() {
			return popTot;
		}

		public void setPopTot(int popTot) {
			this.popTot = popTot;
		}


		
		
	}


