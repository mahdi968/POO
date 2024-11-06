package Exceptions;


public class Compte {
 private String titulaire;
 private double solde;

 public Compte(String titulaire, double soldeInitial) {
     this.titulaire = titulaire;
     this.solde = soldeInitial;
 }

 public void verser(double montant) throws MontantNegatifException {
     if (montant < 0) {
         throw new MontantNegatifException("Erreur : Le montant à verser ne peut pas être négatif !");
     }
     solde += montant;
     System.out.println("Montant déposé : " + montant);
 }

 public void retirer(double montant) throws MontantNegatifException, SoldeInsuffisantException {
     if (montant < 0) {
         throw new MontantNegatifException("Erreur : Le montant à retirer ne peut pas être négatif !");
     }
     if (montant > solde) {
         throw new SoldeInsuffisantException("Erreur : Solde insuffisant !");
     }
     solde -= montant;
     System.out.println("Montant retiré : " + montant);
 }

 public double getSolde() {
     return solde;
 }

 public String getTitulaire() {
     return titulaire;
 }
}