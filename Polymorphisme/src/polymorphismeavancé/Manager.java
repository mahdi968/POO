package polymorphismeavancé;

public class Manager extends Employe {
	private int nombreDeSubordonnes;
	

	public Manager(int nombreDeSubordonnes,String nom, int salaire) {
		super(nom, salaire);
		this.nombreDeSubordonnes = nombreDeSubordonnes;
	}
	
	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("le nombre de subordonnés est  "+ nombreDeSubordonnes);
	}
	
	public void gererEquipe() {
		
	}

}
