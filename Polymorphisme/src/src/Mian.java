package src;

public class Mian {

	public static void main(String[] args) {

		 Vehicule[] vehicules = new Vehicule[3];
	    
	        vehicules[0] = new Voiture();
	        vehicules[1] = new Velo();
	        vehicules[2] = new Vehicule();
	        
	        for (Vehicule v : vehicules) {
	            v.seDeplacer(); }
	}

}
