package workingday;

//Select a day to know if it's a working day or not
import java.util.Scanner;

public class workingday {

	public static void main(String[] args) {
		
		int days;
		
		Scanner daysweek= new Scanner(System.in);
		
		System.out.println("Select a day to know if it's a working day or not: \n1. Monday\n2. Tuesday\n3. Wednesday"
				+ "\n4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
		
		days=daysweek.nextInt();
		
		switch(days){
			
			case 1:
				System.out.println("You've chosen monday. This is a working day");
				break;
				
			case 2:
				System.out.println("You've chosen tuesday. This is a working day");
				break;
				
			case 3:
				System.out.println("You've chosen wednesday. This is a working day");
				break;
				
			case 4:
				System.out.println("You've chosen thursday. This is a working day");
				break;
				
			case 5:
				System.out.println("You've chosen friday. This is a working day");
				break;
				
			case 6:
				System.out.println("You've chosen saturday. You're lucky!Enjoy your weekend");
				break;
				
			case 7:
				System.out.println("You've chosen sunday. You're lucky!Enjoy your weekend");
				break;
				
		}
		
	}

}
