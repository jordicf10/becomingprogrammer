package manejoVariablesCurso2;

import java.text.DecimalFormat;

public class manejoVariablesCurso2 {

	public static void main(String[] args) {
		String saludo1= "Hola a todos";
		String saludo2= "Hola a todas";
		
		System.out.println(saludo1.equals(saludo2));
		System.out.println(saludo1.substring(0, 4) + " " + saludo2.substring(5) + " y "
				+ saludo1.substring(5));
		
		solo5letras(saludo1);
		sina(saludo1);
		
		double suma= sumar(5,20);
		
		System.out.println(suma);
	
		System.out.printf("%.0f", suma);
		
		System.out.println();
		
		double suma1= sumar(5.345,345.4567);
		
		System.out.println(suma1);
		System.out.println();
		System.out.printf("%.2f", suma1);
		System.out.println();
		System.out.printf("%.3f", suma1);
		System.out.println();
		System.out.printf("%.4f", suma1);
		System.out.println();
		System.out.printf("%.5f", suma1);
		System.out.println();
		
		
		
	String nombre= "Jordi";
	
String apellido1= "Colomer";

String apellido2= "Fàbrega";

System.out.println("El nombre es " + nombre +" "+apellido1+" "+ apellido2);
System.out.println("Nom complet: \t" + nombre + " " + apellido1); 
System.out.println();
System.out.println("Retroceso: \b" + apellido1 + " " + nombre + " " + apellido1);
System.out.println("Retorno de carro: \r" + nombre + " " + apellido1);
System.out.println("Nueva línea: \n" + nombre + " " + apellido1);
		
		

	}

static void solo5letras(String x) {
	x= x.substring(0,4);
	System.out.println(x);
}

static void sina(String x) {
	x= x.replace('a', 'o');
	System.out.println(x);
}


public static double sumar(double a, double b) {
	double resultado=a +b;
	return resultado;
}
}
