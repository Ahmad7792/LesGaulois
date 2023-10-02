package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMax;
	public Village(String nom, int nombre) {
		this.nom = nom;
		this.villageois = new Gaulois[nombre];
		this.nbVillageoisMax = nombre;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois){
		if (this.nbVillageois < this.nbVillageoisMax) {
			this.villageois[this.nbVillageois] = gaulois;
			nbVillageois++;
			System.out.println("Le gaulois " + gaulois.nom + "a Ã©tÃ© ajoutÃ© au village " + this.nom + ".");
		}
		else {
			System.out.println("Impossible d'ajouter un habitant au village " + this.nom + ". Il n'y a pas assez de place.");
		}
	}
	public Gaulois trouverHabitant(int numero) {
		if (0<= numero && numero < this.nbVillageois) {
			return this.villageois[numero];
		} else {
			return this.villageois[0];
		}
	}
	public void afficherVillageois() {
		System.out.println("Dans le village " + this.nom + ", dont le chef est " this.chef.getNom() + ", il y a " + this.nbVillageois +" villageois :");
		for (int i=1;i<=nbVillageois;i++) {
			System.out.println(i + " : " + this.villageois[i-1]);
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles",30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		30 est l'indice du 31me villageois. or il n'y en a que 30
		Chef Abraracourcix = new Chef("Abraracourcix",6,village);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix));
	}
}