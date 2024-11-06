package exercicefinal;


public class Bateau extends Vehicule implements Flottant {
 

 public Bateau(String nom, String typeCarburant) {
     super(nom, typeCarburant);
 }


 @Override
 public void demarrer() {
     System.out.println(nom + " démarre avec le bruit des moteurs marins.");
 }


 @Override
 public void arreter() {
     System.out.println(nom + " s'arrête en douceur sur l'eau.");
 }

 
 public void flotter() {
     System.out.println(nom + " flotte sur la surface de l'eau.");
 }
}
