package gestiondestock;


public class ProduitElectronique implements Produit {
 private String nom;
 private double prixUnitaire;
 private int quantite;
 private int garantie;
 

 public ProduitElectronique(String nom, double prixUnitaire, int quantite, int garantie) {
     this.nom = nom;
     this.prixUnitaire = prixUnitaire;
     this.quantite = quantite;
     this.garantie = garantie;
 }


 @Override
 public double calculerValeurStock() {
     return prixUnitaire * quantite;
 }

 public void afficherInfo() {
     System.out.println("Produit Électronique: " + nom + ", Prix Unitaire: " + prixUnitaire + ", Quantité: " + quantite + ", Garantie: " + garantie + " mois");
 }
}
