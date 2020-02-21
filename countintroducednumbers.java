package countintroducednumbers;

import java.util.Scanner;

public class countintroducednumbers {

	public static void main(String[] args) {
	
				
				int num= 0;
				
				int counter= 0;
				
				System.out.println("Introduce a number. Request will finish when you introduce -1. \nThen will count how many numbers you have introduced before. \n\nInsert please:");
				
				do {
				
				Scanner introduce= new Scanner(System.in);
				
				num= introduce.nextInt();
				
				counter++;
				

			}
				while(num!=-1);
				
				counter--;
								
				System.out.println(counter);

		}
			
	}


