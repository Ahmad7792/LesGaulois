package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;


public class scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus",6);
		Gaulois obelix = new Gaulois("Ob�lix",25);
		Druide pano = new Druide("Panoramix",5,10);
		pano.parler("Je vais aller pr�parer une petite potion...");
		pano.preparerPotion();
		pano.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		asterix.boirePotion(pano.getForcePotion());
		asterix.parler("Bonjour");
		minus.parler(" UN GAU... UN GAUGAU...");
		asterix.frapper(minus);		
	}

}