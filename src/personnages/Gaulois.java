package personnages;

public class Gaulois {
	// les atributs
	private String nom;
	private int effetPotion = 1;
	private int force;

	// le constructeur
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force / 3);

	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
//		if (forcePotion== 3) {
//			parler("Merci Druide, je sens que ma force est 3 fois décuplée");
		if (forcePotion == 6) {
			parler("Merci Druide, je sens que ma force est 6 fois décuplée");
		}

	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.prendreParole());
		asterix.parler("bonjour");
		Romain romain = new Romain("romain", 5);
		asterix.frapper(romain);
		asterix.boirePotion(3);
//TODO creer un main permettant de tester la classe Gaulois
	}
}
