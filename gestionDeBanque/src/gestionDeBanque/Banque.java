package gestionDeBanque;

import java.util.ArrayList;

public class Banque {
    private ArrayList<CompteBancaire> comptes; // Liste des comptes
    private static int nombreComptes = 0; // Nombre total de comptes

    // Constructeur
    public Banque() {
        comptes = new ArrayList<>();
    }

    // Méthode pour ajouter un compte
    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
        nombreComptes++;
        System.out.println("Compte ajouté : " + compte.getNumeroCompte());
    }

    // Méthode pour chercher un compte par numéro
    public CompteBancaire chercherCompte(String numeroCompte) {
        for (CompteBancaire compte : comptes) {
            if (compte.getNumeroCompte().equals(numeroCompte)) {
                return compte;
            }
        }
        return null; // Compte non trouvé
    }

    // Méthode pour transférer de l'argent d'un compte à un autre
    public void transfert(String numeroSource, String numeroDest, double montant) {
        CompteBancaire compteSource = chercherCompte(numeroSource);
        CompteBancaire compteDest = chercherCompte(numeroDest);

        if (compteSource != null && compteDest != null) {
            compteSource.retirer(montant);
            compteDest.deposer(montant);
            System.out.println("Transfert de $" + montant + " de " + numeroSource + " à " + numeroDest + " effectué.");
        } else {
            System.out.println("Transfert échoué : un des comptes n'existe pas.");
        }
    }

    // Méthode statique pour afficher le nombre total de comptes
    public static void afficherNombreComptes() {
        System.out.println("Nombre total de comptes : " + nombreComptes);
    }
}