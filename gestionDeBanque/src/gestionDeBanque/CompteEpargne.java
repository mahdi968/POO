package gestionDeBanque;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret; // Taux d'intérêt pour le compte d'épargne

   
    public CompteEpargne(String numeroCompte, String titulaire,double solde, double tauxInteret) {
        super(numeroCompte, titulaire,solde);
        this.tauxInteret = tauxInteret;
    }


    public void calculerInteret() {
        double interet = solde * (tauxInteret / 100);
        solde += interet;
        System.out.println("Intérêts ajoutés : $" + interet + ". Nouveau solde : $" + solde);
    }
}
