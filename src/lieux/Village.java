package lieux;
import personnages.Gaulois;
import personnages.Druide;
import personnages.Chef;
public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois ; 
	private int nbVillageois = 0 ;

	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois= new Gaulois[30];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public void ajouterHabitant (Gaulois gaulois) {
		villageois[nbVillageois]= gaulois ;
		nbVillageois=nbVillageois+1 ;
		
		
	}
	public Gaulois   trouverHabitant(int numeroDuVillageois ) {
		return ( villageois [ numeroDuVillageois-1]);
		}	
	public String getNom() {
		return nom;
	}
	public void afficherVillageois(Chef chef ) {
		System.out.println("dans"+nom+"du chef"+chef.getNom()+"vivent les legendaires gaulois : ");
		for ( int i=0; i<nbVillageois;i++  ) {
			System.out.println(villageois[i].getNom());
			
			
	}
		
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//  le gaulois n'a pas encore de numéro 
		Chef Abraracourcix = new Chef ("Abraracourcix",6,village);
		Gaulois asterix = new  Gaulois ("Asterix",  8) ;
		village.ajouterHabitant(asterix);
		Gaulois obelix = new  Gaulois ("Obelix", 25 ) ;
		village.ajouterHabitant(obelix);
		village.afficherVillageois(Abraracourcix);
		
		
		

		
		
		
	}
	
}
