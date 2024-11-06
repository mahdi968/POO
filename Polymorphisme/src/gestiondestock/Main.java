package gestiondestock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ProduitAlimentaire produit1 = new ProduitAlimentaire("Pomme", 0.5, 100);
        ProduitElectronique produit2 = new ProduitElectronique("Télévision", 300.0, 10, 24);
        
        produit1.afficherInfo();
        System.out.println("Valeur du stock: " + produit1.calculerValeurStock());

        
        produit2.afficherInfo();
        System.out.println("Valeur du stock: " + produit2.calculerValeurStock());

	}

}
