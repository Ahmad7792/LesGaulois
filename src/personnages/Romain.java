package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force >= 0;
		this.force = force;
		equipement = new Equipement[2];
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert this.force >=0;
		int forceInitialRomain = force;
		force -= forceCoup;
	if (force > 0) {
		parler("Aïe");
	} 
	else {
		parler("J'abandonne...");
		}
	assert forceInitialRomain <  force;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (this.nbEquipement) {
		case 2:
			System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");
			break;

		case 1:
			if (this.equipement[0] == equipement) {
				System.out.println("Le soldat " + this.getNom() + " possède déjà un " + equipement +".");
			}else {
				System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement +".");
				this.equipement[1]= equipement;
				this.nbEquipement++;
			} 
			break;
		case 0:
			System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement +".");
			this.equipement[0]= equipement;
			this.nbEquipement++;
			break;
			};
		}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
//		for (Equipement equipement : Equipement.values())
//		System.out.println(equipement);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
