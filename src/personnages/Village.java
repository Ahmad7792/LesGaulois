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
			System.out.println("Le gaulois " + gaulois.nom + "a été ajouté au village " + this.nom + ".");
		}
		else {
			System.out.println("Impossible d'ajouter un habitant au village " + this.nom + ". Il n'y a pas assez de place.");
		}
	}
	public Gaulois trouverHabitant(int numero) {
		if (0<= numero && numero < this.nbVillageois) {
			return this.villageois[numero];
		} else {
			
		}
	}
}