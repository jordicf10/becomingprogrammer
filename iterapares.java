package iterapares;

/*Ullman conjectures: Introduce a number and it returns divided by 2 if it's an even number, 
and then returns this multiply by 3 if it's an odd number */

import java.util.Scanner;

public class iterapares {

	public static void main(String[] args) {
		
		Scanner intro= new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Introduce a number:");
			
			num= intro.nextInt();
		}
		
		while(num<1);

		System.out.println(num);
		
		while(num>1) {
			if(num%2==0) {
				num= num/2;
			}
				else if(num%2!=0)
					num=(num*3)+1;
			System.out.println(num);
					
						}
				
		
			}
			
	
			
			
		}
		
		

	


