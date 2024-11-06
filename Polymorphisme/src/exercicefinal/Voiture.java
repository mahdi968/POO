package exercicefinal;


public class Voiture extends Vehicule implements Roulant {
 
 
 public Voiture(String nom, String typeCarburant) {
     super(nom, typeCarburant);
 }


 @Override
 public void demarrer() {
     System.out.println(nom + " démarre avec un bruit de moteur.");
 }

 
 @Override
 public void arreter() {
     System.out.println(nom + " s'arrête doucement.");
 }


 public void rouler() {
     System.out.println(nom + " roule sur la route.");
 }
}
