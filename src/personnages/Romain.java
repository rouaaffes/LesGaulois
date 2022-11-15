package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	public String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void sEquiper(Equipement equipement) {
		/*
		 * if (nbEquipement==2 ) { System.out.println("le soldat"+ nom +
		 * "est déja bien protegé"); } if(equipements[0]==equipement){
		 * System.out.println("le soldat"+nom+"possède déja"+equipement+"!"); } else {
		 * equipements[0]= equipement ; nbEquipement = 1 ; }
		 */
		switch (nbEquipement) {
		case 2: {
			System.out.println("le soldat" + nom + "est déja bien protegé");
			break;
		}
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("le soldat" + nom + "possède déja" + equipement + "!");
			} else {
				ajouterEquipement(equipement, 1);
			}
		default:
			ajouterEquipement(equipement, 0);
		}
	}

	public void ajouterEquipement(Equipement equipement, int nbEquipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0 : "force doit être positive";
		int avant = force;
		force -= forceCoup;
		assert force >= 0 : "force doit être positive";
		assert force < avant : "force d'un romain doit diminuer";
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}

	}

	public static void main(String[] args) {
		Romain romain = new Romain("romain", 7);
		romain.prendreParole();
		romain.parler("bonne nuit ");
		romain.recevoirCoup(6);
		Romain Minus = new Romain("romain", 6);
		Minus.recevoirCoup(2);
		System.out.println(Equipement.CASQUE);

	}
}