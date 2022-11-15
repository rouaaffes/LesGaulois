package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut allerd'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
		parler("Je vais aller préparer une petite potion...");
	}

	public String getNom() {
		return nom;
	}

	public void preparerPotion(int effetPotionMin, int effetPotionMax) {
		Random random = new Random();
		int resultat = random.nextInt(effetPotionMax);
		while (!(4 < resultat << 10)) {
			resultat = random.nextInt(effetPotionMax);
		}
		forcePotion = resultat;
		// hi bon bonjour hhhhhh
		if (forcePotion > 7) {
			parler("J'ai préparé une super potion de force" + forcePotion);
		} else {

			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force" + forcePotion);
		}
	}

	public void booster(Gaulois goulois) {
		if (goulois.getNom() == "Obelix") {
			parler(" Non, Obélix !... Tu n’auras pas de potion magique !");
		} else {
			goulois.boirePotion(forcePotion);
		}
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public static void main(String[] args) {
		Druide Pannoramix = new Druide("Panoramix", 5, 10);
		Pannoramix.preparerPotion(5, 10);

	}

}
