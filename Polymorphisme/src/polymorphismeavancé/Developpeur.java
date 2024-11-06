package polymorphismeavancé;

public class Developpeur extends Employe {
	
	private String langage;
	
	public Developpeur(String langage,String nom, int salaire) {
		super( nom ,salaire);
		this.langage = langage;
	}
	
	
	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("le langage de programmation "+ langage);
	
	}
	public void afficherLangage() {
		System.out.println("le langage de programmation "+ langage);
	
	}

}
