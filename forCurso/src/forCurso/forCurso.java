package forCurso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class forCurso {

	public static void main(String[] args) {
int number, number2, number3;
		
		Scanner numero= new Scanner(System.in);
		
		System.out.println("Elige a partir de qu� n�mero quieres ver los m�ltiples");
		
		number= numero.nextInt();
		
		
		
		do {
			
			System.out.println("Elige hasta que n�mero quieres hacer iteraciones:");
			number2= numero.nextInt();
			if(number2<=number) {
				
					System.out.println("Introduce una cifra de fin superior a la primera:");	
				
			}
		}
		
		
		while(number2<=number);
		
		/*
		do{
			
			
			boolean numerosbuenos= false;
			do {
				
			try {
				number2= numero.nextInt();
				numerosbuenos=true;
			}
			catch(InputMismatchException e) {
				System.out.println("Introduce una cifra v�lida");
				numero.nextLine();
			}
		}
			while(!numerosbuenos);
		}
		while(number2<number);
		*/
		
		System.out.println("Elige de qu� n�mero quieres ver los m�ltiples");
		
		number3= numero.nextInt();
		
		System.out.println("Has seleccionado el n�mero " + number + " y quieres ver sus m�ltiplos"
				+ " de " + number3 + " hasta " + number2 + " y estas son sus iteraciones:");
		
		sacapormultiples(number,number2,number3);
		

	}
	
	 static void sacapormultiples(int number,int number2, int number3) {
	  
	 for(number=number;number<number2;number++) {
		 if(number%number3==0) {
		 System.out.println(number);
		 }
	 }
	 }

}
