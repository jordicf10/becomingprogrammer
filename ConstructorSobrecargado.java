package constructores;

import java.util.ArrayList;

public class ConstructorSobrecargado {

	public static void main(String[] args) {
		Constructores constructores= new Constructores();
		
		Constructores constructores2= new Constructores("Jordi Colomer");
		
		Constructores constructores3= new Constructores(36);
		
		Constructores constructores4= new Constructores("Èric", 2);
		
		Constructores constructores5=new Constructores("Laura");
		
		ArrayList<Constructores>constr=new ArrayList<Constructores>();
		
		constr.add(constructores);
		constr.add(constructores2);
		constr.add(constructores3);
		constr.add(constructores4);
		constr.add(constructores5);

		
		for(Constructores e:constr) {
			System.out.println(e);
		}
		
		System.out.println("\nEl número de persona que hay es " + Constructores.getContadorPersonas());

	}

}
