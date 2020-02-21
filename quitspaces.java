package quitspaces;

import java.util.Scanner;

public class quitspaces {

	public static void main(String[] args) {
		
		Scanner text= new Scanner(System.in);
		
		System.out.println("Introduce a text:");
		
		String phrase= text.nextLine();
		
		System.out.println(phrase.replace(" ", ""));

	}

}
