package sum1toxnumber;

import java.util.Scanner;

public class sum1toxnumber {

	public static void main(String[] args) {
		
		Scanner num= new Scanner(System.in);
		
		System.out.println("Introduce number to sum 1 to introduced number:");
		
		String tonum= num.nextLine();
		
		int enternum= Integer.parseInt(tonum);
		
		int add= 0;
		
		for(int num1= 1;num1<=enternum;num1++) {
			add+=num1;
			
		}		
		System.out.println(add);
		
	}


}
