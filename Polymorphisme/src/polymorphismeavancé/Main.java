package polymorphismeavancé;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe[] E = new Employe[2];
		
		E[0]= new Developpeur("mahdi", "langage java ", 1500);
		E[1]=new Manager(3000, "haitame", 13);
		
		for(Employe Em :E) {
			Em.afficherInfos();
		}
		
		Employe m = new Manager(3, "haitame", 3000);
		m.afficherInfos();
		Employe d =  new Developpeur("langage java ","mahdi" , 0);
		d.afficherInfos();
		
		
		
		Employe m1 = new Manager(3000, "haitame", 13);
		 if (m1 instanceof Manager ) {
			 ((Manager)m1).gererEquipe();
		 }
		

		Employe d1 =  new Developpeur("langage java ",null , 0);
		 if (d1 instanceof Developpeur ) {
		(( Developpeur)d1).afficherLangage();
		 }
		
		
	}

}
