import java.util.Scanner;

public class StringASCII {

	public static void main(String[] args) {
		//Transform every character of string to ASCII code
		
		
		Scanner text= new Scanner(System.in);
		
		System.out.println("Introduce a text:");
		
		String phrase= text.nextLine();
		
		for(int i=0; i<phrase.length();i++) {
			System.out.print((int)phrase.charAt(i) + " ");
			
		}
		
	}
	
}
