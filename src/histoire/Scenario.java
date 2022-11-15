package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois Asterix = new  Gaulois ("Asterix",  8) ;
//		Romain Minus = new Romain("romain",6);
//		Asterix.parler("Bonjour à tous ");
//		Minus.parler("UN GAU... UN GAUGAU... ");
//		System.out.println("Astérix envoie un grand coup dans la mâchoire de Minus") ;
//		Minus.recevoirCoup(1);
//		System.out.println("Astérix envoie un grand coup dans la mâchoire de Minus");
//		Minus.recevoirCoup(2);
//		System.out.println("Astérix envoie un grand coup dans la mâchoire de Minus");
//		Minus.recevoirCoup(7);
		Druide Panoramix = new  Druide ("Panoramix",5,10) ;
		Gaulois Obelix = new  Gaulois ("Obelix",  8) ;
		Panoramix.preparerPotion(5,10);
		Panoramix.booster(Obelix);
		Obelix.parler("Par Bélénos, ce n'est pas juste !");
		Asterix.boirePotion(6);
		Asterix.parler("Bonjour ");
		Romain Minus = new Romain("romain",6);
		Minus.parler("UN GAU... UN GAUGAU... ");
		System.out.println("Astérix envoie un grand coup dans la mâchoire de Minus") ;
		Minus.recevoirCoup(1);
		System.out.println("Astérix envoie un grand coup dans la mâchoire de Minus");
		Minus.recevoirCoup(2);
		System.out.println("Astérix envoie un grand coup dans la mâchoire de Minus");
		Minus.recevoirCoup(7);
	}

}
