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
		parler("Bonjour, je suis le druide " + nom
		+ " et ma potion peut aller d'une force " + effetPotionMin + " � "
		+ effetPotionMax + ".");
		}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random nombre = new Random();
		this.forcePotion = nombre.nextInt(effetPotionMin) + effetPotionMin;
		if (this.forcePotion > 7) {
			System.out.println("J'ai pr�par� une super potion de force. Sa puissance est : " + this.forcePotion);
		}
		else {
			System.out.println("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force : " + this.forcePotion);
		}
		
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}


//a. Dans la m�thode preparerPotion :
//- cr�er un objet random de type Random (attention bien importer la classe
//Random de � java.util � et non � java.math �). Puis utiliser la m�thode nextInt
//avec en param�tre d�entr�e l�attribut effetPotionMax. Le nombre retourn� par
//la m�thode nextInt sera la force de la potion pr�par�e par le druide.
//- faire parler le druide :
//- si la force de la potion est sup�rieure � 7 le druide dira : � J'ai pr�par�
//une super potion de force � puis donnera la force de la potion.
//- sinon il dira : � Je n'ai pas trouv� tous les ingr�dients, ma potion est
//seulement de force � puis donnera la force de la potion.
//18
//TP1 : Utilisation de Git - Utilisation d�un IDE - Programmation Objet
//b. Dans la classe Druide cr�er un main :
//- Cr�er le druide Panoramix qui pr�pare une potion entre 5 et 10.
//- Tester la m�thode preparerPotion : lancer le test plusieurs fois. Vous devez
//obtenir une force de potion qui varie entre 0 et 9.
//c. Nous souhaitons que la force de la potion varie entre les valeurs des attributs
//effetPotionMin et effetPotionMax (entre 5 et 10 pour notre druide).
//- Modifier la m�thode preparerPotion afin d�obtenir une force ad�quate.
//- Tester
