package charASCII;

import java.util.Scanner;

public class charASCII {

	public static void main(String[] args) {
		int num;
		
		Scanner caracter= new Scanner(System.in);
		
		System.out.println("Introduce a number to transform to ASCII character:");
		
		num=caracter.nextInt();
		
		System.out.println("Your number " + num + " is equal to " + (char)num);
		

	}

}
