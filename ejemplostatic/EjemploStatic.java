package ejemplostatic;

import java.util.ArrayList;

public class EjemploStatic {

	public static void main(String[] args) {
			ContarPersonasStatic p1= new ContarPersonasStatic("Jordi");
			ContarPersonasStatic p2= new ContarPersonasStatic("Laura");
			ContarPersonasStatic p3= new ContarPersonasStatic("�ric");
			
			ArrayList<ContarPersonasStatic>personas=new ArrayList();
			
			personas.add(p1);
			personas.add(p2);
			personas.add(p3);
			
			for(ContarPersonasStatic e:personas) {
				System.out.println("Persona: " + e.getNombre() +  "\nIdPersona: " + e.getidPersona() + "\n" + e.toString()) ;
			}
			
			System.out.println("\nN� Personas: " + ContarPersonasStatic.getContadorPersonas());
			/*Las variables static se asocian a la clase y no a los objetos, por eso ContadorPersonas devolver� 3, y idPersona devolver� un 
			valor num�rico por cada uno de los objetos*/
			
			
			System.out.println("Persona: " + p1.getNombre());
			
			System.out.println("N�Personas: " + ContarPersonasStatic.getContadorPersonas());
	}

}
