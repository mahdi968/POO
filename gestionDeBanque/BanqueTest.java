package gestionDeBanque;
//import java.util.ArrayList;
//import java.util.List;

public class BanqueTest {
    public static void main(String[] args) {
        
        Banque banque = new Banque();
//        List<CompteBancaire> comptes = new ArrayList<>();

       
        CompteBancaire compte1 = new CompteBancaire("C001", "Alice",1500.00);
        CompteBancaire compte2 = new CompteBancaire("C002", "Bob",2000.00);
        CompteBancaire compte3 = new CompteBancaire("C003", "Charlie",3000.00);

        banque.ajouterCompte(compte1);
        banque.ajouterCompte(compte2);
        banque.ajouterCompte(compte3);

       
        compte1.deposer(500);
        compte2.deposer(300);
        compte1.retirer(200);
        compte2.retirer(100);

      
        System.out.println("\nSoldes après les transactions :");
        compte1.afficherSolde();
        compte2.afficherSolde();
        compte3.afficherSolde();

       
        banque.transfert("C001", "C002", 150);

        
        System.out.println("\nSoldes après le transfert :");
        compte1.afficherSolde();
        compte2.afficherSolde();

       
        Banque.afficherNombreComptes();

 
        CompteCourant compteCourant1 = new CompteCourant("C004", "David", 0.00,1);
        CompteEpargne compteEpargne1 = new CompteEpargne("E001", "Eve", 0.00,2);

        banque.ajouterCompte(compteCourant1);
        banque.ajouterCompte(compteEpargne1);

       
        compteCourant1.deposer(300);
        compteCourant1.retirer(400); 
        compteCourant1.afficherSolde();

        
        compteEpargne1.deposer(1000);
        compteEpargne1.calculerInteret();
        compteEpargne1.afficherSolde();

        
        Banque.afficherNombreComptes();
        
//        EX 3
//        comptes.add(compte1);
//        comptes.add(compte2);
//        comptes.add(compte3);
//        
//        System.out.println("Effectuer des transactions...");
//        compte1.deposer(500);
//        compte1.retirer(200);
//        compte2.deposer(300);
//        compte2.retirer(100);
//        compte1.transferer(compte2, 150);
//        compte3.deposer(700);
//        compte3.retirer(50);
//        
//        System.out.println("\nAffichage des soldes :");
//        for (CompteBancaire compte : comptes) {
//            compte.afficherSolde();
//        }  
//        
//        System.out.println("\nHistorique des transactions :");
//        for (CompteBancaire compte : comptes) {
//            System.out.println("\nHistorique des transactions pour " + compte.getTitulaire() + " :");
//            for (Transaction transaction : compte.getTransactions()) {
//                System.out.println(transaction);
//            }
//        }
    }
}