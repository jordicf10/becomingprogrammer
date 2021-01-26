package ejercicioIfElseCurso;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.*;

public class EjemploIf {

	public static void main(String[] args) {
		
		
		int x=0;
		
		Scanner numero=new Scanner(System.in);
		
		do {
			boolean confirma= false;
		do {

			try {
				
			System.out.println("Selecciona un número entre 1 y 40");
			x= numero.nextInt();
			confirma= true;
			
			}
			catch(InputMismatchException e) {
			System.out.println("\nVuelve a insertar un número válido entre 1 y 40");
			numero.nextLine();
	
		}
		}
		
		while(!confirma);
		
		if(x==0) {
			System.out.println("Que pases un buen día");
		}
		else if(x>0 && x<=10) {
			System.out.println("El valor está entre 1 y 10\n");
		}
		else if(x>10 && x<=20){
			System.out.println("El valor está entre 11 y 20\n");
		}
		else if(x>20 && x<=30){
			System.out.println("El valor está entre 21 y 30\n");
		}
		else if(x>30 && x<=40){
			System.out.println("El valor está entre 31 y 40\n");
		}
		else{
			System.out.println("Tu número ha excedido el rango solicitado\n");
		}
		}
		while(x!=0);
		
		System.out.println("Fin del programa\n");

	}

}
