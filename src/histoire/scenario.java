package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",10);
		Romain minus = new Romain("Minus",8);
		asterix.parler("Bonour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}

//Le gaulois Ast�rix : � Bonjour � tous�
//Le romain Minus : � UN GAU... UN GAUGAU...�
//Ast�rix envoie un grand coup dans la m�choire de Minus
//Le romain Minus : � A�e�
//Ast�rix envoie un grand coup dans la m�choire de Minus
//Le romain Minus : � A�e�
//Ast�rix envoie un grand coup dans la m�choire de Minus
//Le romain Minus : � J'abandonne...�
