package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",10);
		Romain minus = new Romain("Minus",8);
		asterix.parler("Bonour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}

//Le gaulois Astérix : « Bonjour à tous»
//Le romain Minus : « UN GAU... UN GAUGAU...»
//Astérix envoie un grand coup dans la mâchoire de Minus
//Le romain Minus : « Aïe»
//Astérix envoie un grand coup dans la mâchoire de Minus
//Le romain Minus : « Aïe»
//Astérix envoie un grand coup dans la mâchoire de Minus
//Le romain Minus : « J'abandonne...»
