package arrays;

import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;




public class ArraysBidimensionales {

	public static void main(String[] args) {

		int[][]edades= new int[3][2];
		
		edades[0][0]=30;
		edades[0][1]=15;
		edades[1][0]=20;
		edades[1][1]=45;
		edades[2][0]=5;
		edades[2][1]=38;
		
		
		System.out.println("Matriz enteros �ndice 0-0: " + edades[0][0]);
		System.out.println("Matriz enteros �ndice 0-1: " + edades[0][1]);
		System.out.println("Matriz enteros �ndice 1-0: " + edades[1][0]);
		System.out.println("Matriz enteros �ndice 1-1: " + edades[1][1]);
		System.out.println("Matriz enteros �ndice 2-0: " + edades[2][0]);
		System.out.println("Matriz enteros �ndice 2-1: " + edades[2][1]);
		
		
		System.out.println();
		
		for(int i=0;i<edades.length;i++) {
			for(int j=0;j<edades[i].length;j++) {
				System.out.println("Actualiza tus n�meros:");
				Scanner introduce=new Scanner(System.in);
				boolean correcto=false;
				int numero=0;
				do {
					
					try {
						numero=introduce.nextInt();
						correcto=true;
						
					}
					catch(InputMismatchException e) {
						System.out.println("Introduce un n�mero v�lido:");
						//introduce.nextLine();
					}

			}
				while(!correcto);
					
				System.out.println("\n�ndice de la matriz " + i + " - " + j + " = " + (edades[i][j]=numero));
			}
			
		}
		
		System.out.println();
		
		for(int i=0;i<edades.length;i++) {
			for(int j=0;j<edades[i].length;j++) {
				//System.out.print("\n�ndice de la matriz " + i + " - " + j + " = " + (edades[i][j]));
				System.out.print(edades[i][j] + " ");
				
			}
			System.out.print("\n");
			
		}
		/*System.out.println("Matriz enteros �ndice 0-0: " + edades[0][0]);
		System.out.println("Matriz enteros �ndice 0-1: " + edades[0][1]);
		System.out.println("Matriz enteros �ndice 1-0: " + edades[1][0]);
		System.out.println("Matriz enteros �ndice 1-1: " + edades[1][1]);
		System.out.println("Matriz enteros �ndice 2-0: " + edades[2][0]);
		System.out.println("Matriz enteros �ndice 2-1: " + edades[2][1]);*/
		
	}
	
	
	
	
	
	
}