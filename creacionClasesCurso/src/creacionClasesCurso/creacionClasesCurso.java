package creacionClasesCurso;

import java.util.ArrayList;
import java.util.Iterator;

public class creacionClasesCurso {

	public static void main(String[] args) {
		
		
		Persona persona1 = new Persona("Jordi", 'H', "Periodista");
		Persona persona2= new Persona("Laura", 'M', "Fisioterapeuta");
		Persona persona3= new Persona("Ana", 'M', "Economista");
		Persona persona4= new Persona("Miquel", 'H', "Informático");
		
		System.out.println("El nombre de la persona es " + persona3.getNombre());
		
		System.out.println("El nombre de la persona es " + persona4.getNombre());
		
		
		ArrayList<Persona>mispersonas= new ArrayList<Persona>();
		mispersonas.add(persona1);
		mispersonas.add(persona2);
		mispersonas.add(persona3);
		mispersonas.add(persona4);


		for (Persona e:mispersonas) {
			System.out.println(e.getNombre() + " trabaja como " + e.getOcupacion() + "\n");
		}
		
		for (Persona e:mispersonas) {
			System.out.println(e.getDatos()+"\n");
		}
	}


}

