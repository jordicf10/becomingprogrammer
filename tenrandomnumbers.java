package tenrandomnumbers;

import java.util.Random;

import java.util.Scanner;

// Print ten random numbers between two numbers you write
public class tenrandomnumbers {

	public static void main(String[] args) {
		
		int num, num2;
		
		Scanner n= new Scanner(System.in);
		
		System.out.println("Select your first number");
		
		num= n.nextInt();
		
		System.out.println("Select your second number");
		
		num2= n.nextInt();
		
		for(int i=0;i<10;i++) {
			
			int randomnumber;
			
			Random number = new Random();
			
			randomnumber= (int) (Math.random()*(num-num2+1)+num2);   //(N-M+1)+M)
			
			System.out.print(randomnumber + " ");
			
		}
		

	}

}
