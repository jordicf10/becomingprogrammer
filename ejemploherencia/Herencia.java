package ejemploherencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Herencia {

	public static void main(String[] args) {
		HerenciaPersona persona= new HerenciaPersona("Jordi", 'H', 36, "Passeig Andreu Nin, 69");
		HerenciaPersona persona1= new HerenciaPersona("Laura", 'M', 36, "Passeig Andreu Nin, 69");
		HerenciaPersona persona2= new HerenciaPersona("Ana", 'M', 34, "Rubén Darío, 154");
		
		/*HerenciaEmpleado persona3=  new HerenciaEmpleado("Antonio", 'H', 67, "Rubén Darío, 79", 40000);
		HerenciaEmpleado persona4=  new HerenciaEmpleado("Fina", 'M', 60, "Rubén Darío, 79", 40000);
		HerenciaEmpleado persona5= new HerenciaEmpleado("Miquel", 'M', 34, "Rubén Darío, 154", 25000);*/
		
		HerenciaEmpleado persona3=  new HerenciaEmpleado("Antonio", 40000);
		HerenciaEmpleado persona4=  new HerenciaEmpleado("Fina", 40000);
		HerenciaEmpleado persona5= new HerenciaEmpleado("Miquel", 25000);
		
		
		/*HerenciaCliente persona6= new HerenciaCliente("Conchi", 'M', 66, "Enric Borràs, 24", new java.util.Date(2014-1900, 6-1, 22), true);
		HerenciaCliente persona7= new HerenciaCliente("Carme", 'M', 92, "Enric Borràs, 24", new java.util.Date(2010-1900, 8-1, 20), false);
		Para que el año y el mes salgan correctos, el año se debe restar con 1900, y el mes con 1. Investigar el porqué*/
		
		HerenciaCliente persona6= new HerenciaCliente(new java.util.Date(2014-1900, 6-1, 22), true);
		HerenciaCliente persona7= new HerenciaCliente(new java.util.Date(2010-1900, 8-1, 20), false);
		
		persona3.setEdad(67);
		persona3.setDireccion("Rubén Darío, 79");
		persona5.setEdad(34);
		persona4.setEdad(60);
		persona4.setDireccion("Rubén Darío, 79");
		persona5.setDireccion("Rubén Darío, 154");
		persona6.SetNombre("Conchi");
		persona7.SetNombre("Carme");
		persona6.setEdad(66);
		persona7.setEdad(92);
		persona6.setDireccion("Enric Borràs, 24");
		persona7.setDireccion("Enric Borràs, 24");
		
		
		System.out.println(persona2);
		System.out.println(persona5);
		System.out.println(persona7);
		
		ArrayList<HerenciaPersona>personas=new ArrayList<HerenciaPersona>();
		personas.add(persona);
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		personas.add(persona4);
		personas.add(persona5);
		personas.add(persona6);
		personas.add(persona7);

		
		for(HerenciaPersona e: personas) {
			System.out.println(e);
			
		}
		
		for(HerenciaPersona e: personas) {
			System.out.println("\n" + e.getNombre());
		}
		
		System.out.println("\nEl número de personas es " + HerenciaPersona.getContadorPersona());
		System.out.println("\nEl número de empleados es " + HerenciaEmpleado.getContadorEmpleado());
		System.out.println("\nEl número de clientes es " + HerenciaCliente.getContadorCliente());
		
		
		

	}
	
	

}
