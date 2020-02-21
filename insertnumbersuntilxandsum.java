package insertnumbersuntilxandsum;

import java.util.Scanner;

//insertnumbersuntilxandsum

public class insertnumbersuntilxandsum {

	public static void main(String[] args) {
		
		int num= 0;
		
		int add= 0;
		
		System.out.println("Introduce a number. Request will finish when you introduce -1. \nThen will add all numbers you have introduced before. \n\nInsert please:");
		
		do {
		
		Scanner introduce= new Scanner(System.in);
		
		num= introduce.nextInt();
		
		add+=num;
		

	}
		while(num!=-1);
		
		add++;
		
		System.out.println(add);

}
	
}
