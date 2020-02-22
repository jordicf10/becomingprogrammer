package randomnumbersmethod;

import java.util.Random;

import java.util.Scanner;

public class randomnumbersmethod {
	
	public static double randomnumber(double num, double num2) {
		return Math.random()*(num-num2+1)+num2;
	}

	public static void main(String[] args) {
		
		Scanner numbers= new Scanner(System.in);
		
		System.out.println("Introduce first number");
		 
		double num=numbers.nextDouble();
		
		System.out.println("Introduce second number to find a random number between first and second number:");
		
		double num2= numbers.nextDouble();
		
		System.out.println((int)(randomnumber(num,num2)));  //(int) Return a number without decimals
		 

	}

}
