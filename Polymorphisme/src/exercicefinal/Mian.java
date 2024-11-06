package exercicefinal;

public class Mian {

	
	public class Main {
	    public static void main(String[] args) {
	       
	        Vehicule[] vehicules = new Vehicule[3];

	       
	        vehicules[0] = new Voiture("Toyota Corolla", "Essence");
	        vehicules[1] = new Bateau("Yacht de luxe", "Diesel");
	        vehicules[2] = new Hydravion("Hydravion de tourisme", "Avion à réaction");

	        
	        for (Vehicule vehicule : vehicules) {
	            vehicule.afficherInfos(); 
	            vehicule.demarrer();       
	            vehicule.arreter();        
	            System.out.println(); 
	        }
	            
	            Vehicule v1 = new Voiture(null, null);
	            if(v1 instanceof Voiture) {
	            	((Voiture)v1).rouler();
	            }
	            
	            Vehicule b1 = new Bateau(null, null);
	            if(b1 instanceof Bateau) {
	            	((Bateau)b1).flotter();
	            }
	            
	            
	            Vehicule h1 = new Hydravion(null, null);
	            if(h1 instanceof Hydravion) {
	            	((Hydravion)h1).flotter();
	            }
	           
	        
	        }
	            }
	            
	            
	            
	        }
	    
	

