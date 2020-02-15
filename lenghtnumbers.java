package lenghtnumbers;

import java.util.Scanner;

public class lenghtnumbers {

	public static void main(String[] args) {
		int number;
		
		Scanner num= new Scanner(System.in);
		
		do {
			System.out.println("Introduce a number");
			
			number= num.nextInt();
		}
		while(number<1);
		
		int counter= 0;
		
		for(int i=number; i>0; i/=10) {
			counter++;
		}
		
		if(counter==1) {
			System.out.println("Your number " + number + " has " + counter + " figures");
		}
		else {
			System.out.println("Your number " + number + " has " + counter + " figures");
		}
		
		
		

	}

}
