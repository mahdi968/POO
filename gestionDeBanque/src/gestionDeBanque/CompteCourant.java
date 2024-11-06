package gestionDeBanque;

public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise; // Montant maximum du découvert autorisé

   
    public CompteCourant(String numeroCompte, String titulaire,double solde , double decouvertAutorise) {
        super(numeroCompte, titulaire, solde);
        this.decouvertAutorise= decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (montant <= getSolde() + decouvertAutorise) {
            setSolde(getSolde() - montant); 
            System.out.println("Retrait de $" + montant + " effectué. Nouveau solde : $" + getSolde());
        } else {
            System.out.println("Retrait échoué : montant supérieur au solde et au découvert autorisé.");
        }
    }
}