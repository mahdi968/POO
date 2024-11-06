package exercicefinal;

public class Hydravion extends Vehicule implements Volant,Flottant {

	public Hydravion(String nom, String typeCarburant) {
		super(nom, typeCarburant);
	}

	@Override
	public void flotter() {
		// TODO Auto-generated method stub
        System.out.println(nom + " flotte sur la surface de l'eau.");
		
	}

	@Override
	public void voler() {
		// TODO Auto-generated method stub
		System.out.println(nom + " vole dans le ciel.");
	}
		
		 @Override
		 public void demarrer() {
		     System.out.println(nom + " démarre avec un bruit de moteur.");
		 }

		 
		 @Override
		 public void arreter() {
		     System.out.println(nom + " s'arrête doucement.");
		 }
	

	
}
