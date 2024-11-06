package polymorphismeavancé;

public class Employe {

	private String nom;
	private int salaire;
	
	public Employe(String nom, int salaire) {
		this.nom = nom;
		this.salaire = salaire;
	}


	
	
	
	public void afficherInfos() {
		System.out.println("le nom de employe "+ nom);
		System.out.println("le salaire de employe "+ salaire);
	}
	
}
