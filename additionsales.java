package additionsales;

import java.util.Scanner;

public class additionsales {

	public static void main(String[] args) {
		
		int numsales;
		
		Scanner num= new Scanner(System.in);
		System.out.println("How many sales have you done?");
		
		numsales= num.nextInt();
		
		int addition= 0;
		int addsales= 0;
		
		for(int i=0;i<numsales;i++) {
			System.out.println("Which is the value of every sale?");
			addsales=num.nextInt();
			addition += addsales;
			
		}
		System.out.println("You've made " + numsales + " sales, so you've sold by a value ascending to " + addition);

	}

}
