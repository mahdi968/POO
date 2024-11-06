package Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mian {

	public static void main(String[] args) throws SoldeInsuffisantException {
		// TODO Auto-generated method stub

		
//		 DivisionParZero  
//		        int numerator = 10; 
//		        int denominator = 0; 
//
//		        try {
//		          
//		            int result = numerator / denominator;
//		            System.out.println("Le résultat de la division est : " + result);
//		        } catch (ArithmeticException e) {
//		           
//		            System.out.println("Erreur : Division par zéro !");
//		        } finally {
//		         
//		            System.out.println("Bloc finally exécuté. Le programme s’est terminé.");
//		        }
		
		
		
		
		

//		 ConversionNombre 
//	
//		        Scanner scanner = new Scanner(System.in);
//		        System.out.print("Veuillez saisir un nombre : ");
//		        String saisie = scanner.nextLine(); 
//		        convertirEnEntier(saisie);
//		        
//		        scanner.close(); 
//		    }
//
//		    public static void convertirEnEntier(String nombre) {
//		        try {
//		        
//		            int resultat = Integer.parseInt(nombre);
//		            System.out.println("Le nombre converti est : " + resultat);
//		        } catch (NumberFormatException e) {
//		          
//		            System.out.println("Erreur : La saisie '" + nombre + "' n’est pas un nombre valide.");
//		        } finally {
//		           
//		            System.out.println("Bloc finally : Conversion terminée.");
//		        }
	
		
		
//	GestionCompte 
		  
//		
//		        Scanner scanner = new Scanner(System.in);
//		        
//		       
//		        Compte compte = new Compte("anware", 1000.0);
//		        
//		   
//		        System.out.print("Veuillez entrer le montant à verser : ");
//		        double montantAVerser = scanner.nextDouble();
//		        
//		        try {
//		            compte.verser(montantAVerser);
//		            System.out.println("Nouveau solde après dépôt : " + compte.getSolde());
//		        } catch (MontantNegatifException e) {
//		        
//		            System.out.println(e.getMessage());
//		        }
//
//		      
//		        System.out.print("Veuillez entrer le montant à retirer : ");
//		        double montantARetirer = scanner.nextDouble();
//		        
//		        compte.retirer(montantARetirer);
//				System.out.println("Nouveau solde après retrait : " + compte.getSolde());
//		        
//		        scanner.close(); 
		
		
		
//		
//		Scanner scanner = new Scanner(System.in);
//        Compte compte = new Compte("mahdi", 1000.0);
//
//      
//        while (true) {
//            System.out.print("Entrez un montant à retirer : ");
//            try {
//                double montantARetirer = scanner.nextDouble();
//                compte.retirer(montantARetirer);
//                System.out.println("Nouveau solde après retrait : " + compte.getSolde());
//                break; 
//            } catch (InputMismatchException e) {
//                System.out.println("Erreur : Veuillez entrer un nombre valide !");
//                scanner.next();
//            } catch (MontantNegatifException e) {
//                System.out.println(e.getMessage());
//            } catch (SoldeInsuffisantException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//       
//        while (true) {
//            System.out.print("Entrez un montant à verser : ");
//            try {
//                double montantAVerser = scanner.nextDouble();
//                compte.verser(montantAVerser);
//                System.out.println("Nouveau solde après dépôt : " + compte.getSolde());
//                break; 
//            } catch (InputMismatchException e) {
//                System.out.println("Erreur : Veuillez entrer un nombre valide !");
//                scanner.next(); 
//            } catch (MontantNegatifException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        scanner.close();	 
		    
		
		
		


		
		
		    
		        
		        
		        
		        
		        
	}

}
