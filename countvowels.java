package countvowels;

import java.util.Scanner;

public class countvowels {

	public static void main(String[] args) {
		//Count how many vowels has the phrase
		
		System.out.println("Introduce a text:");
		
		Scanner text= new Scanner(System.in);
		
		String phrase= text.nextLine();
	
		
		int counter= 0;
		
		
		for(int i=0; i<phrase.length();i++) {
			
			if (phrase.charAt(i)=='a'|| phrase.charAt(i)=='e'|| phrase.charAt(i)=='i'|| phrase.charAt(i)=='o'
					|| phrase.charAt(i)=='u') {
							
				counter++;	
			
		}
			
			
	}
		System.out.println("The phrase has " + counter + " vowels");	
		
	}

	
}
		


