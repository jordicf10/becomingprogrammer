package nummayoreinferior;

import java.util.Scanner;

public class numayormenor {

	public static void main(String[] args) {
		int num, num2;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero");
		
		num=entrada.nextInt();
		
		System.out.println("introduce el segundo n�mero");
		
		num2=entrada.nextInt();
		
		if(num>num2) {
			System.out.println("El n�mero " + num + " es mayor que " + num2);
		}	
			else if (num2>num){
				System.out.println("El n�mero " + num2 + " es mayor que " + num);
							
			}
			else if(num==num2) {
				System.out.println("El n�mero " + num + " es igual al n�mero " + num2);
		}
			

	}

}
