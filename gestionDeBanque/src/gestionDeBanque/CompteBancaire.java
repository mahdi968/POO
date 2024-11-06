package gestionDeBanque;

import java.util.ArrayList;
import java.util.List;

public class CompteBancaire {
    private String numeroCompte;
    protected double solde; 
    private String titulaire; 
    private List<Transaction> transactions;

  
    public CompteBancaire(String numeroCompte, String titulaire,double solde) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde = 0; 
        this.transactions = new ArrayList<>(); 
    }

 
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de $" + montant + " effectué.");
        } else {
            System.out.println("Le montant à déposer doit être positif.");
        }
    }

 
    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de $" + montant + " effectué.");
        } else {
            System.out.println("Retrait échoué : montant supérieur au solde.");
        }
    }

    
    public void transferer(CompteBancaire compteDestinataire, double montant) {
        if (montant > 0) { 
            if (montant <= solde) {
                this.retirer(montant); 
                compteDestinataire.deposer(montant); 
                transactions.add(new Transaction("transfert", montant)); 
                System.out.println("Transfert de $" + montant + " vers " + compteDestinataire.getTitulaire() + " effectué.");
            } else {
                System.out.println("Transfert échoué : montant supérieur au solde.");
            }
        } else {
            System.out.println("Le montant du transfert doit être positif.");
        }
    }
    
    public List<Transaction> getTransactions() {
        return transactions; 
    }
   
    public void afficherSolde() {
        System.out.println("Solde de " + titulaire + " (" + numeroCompte + ") : $" + solde);
    }

   
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
    	this.solde=solde;
    }

   
    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }
    public String getTitulaire() {
		return titulaire;
    	
    }
}