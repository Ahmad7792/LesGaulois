package personnages;

public enum Equipement {
	CASQUE("casque"),BOUCLIER("bouclier");
	private String nom;
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public void setNom(String chaine) {
		this.nom = chaine;
	}
	
	public String toString() {
		return nom;
	}
}
