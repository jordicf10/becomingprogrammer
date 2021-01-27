package nummayoreinferior;

import java.util.Scanner;

public class numayormenor {

	public static void main(String[] args) {
		int num, num2;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		
		num=entrada.nextInt();
		
		System.out.println("introduce el segundo número");
		
		num2=entrada.nextInt();
		
		if(num>num2) {
			System.out.println("El número " + num + " es mayor que " + num2);
		}	
			else if (num2>num){
				System.out.println("El número " + num2 + " es mayor que " + num);
							
			}
			else if(num==num2) {
				System.out.println("El número " + num + " es igual al número " + num2);
		}
			

	}

}
