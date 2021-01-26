package calculaMesCurso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculaMesCurso {

	public static void main(String[] args) {
		
		Scanner escribe=new Scanner(System.in);
		int mes=1;
		
		String estacion;
		
		do {
		System.out.println("Introduce el mes que desees entre 1 y 12");
		
		boolean mescorrecto= false;
			do {
		
				try {
				mes=escribe.nextInt();
				mescorrecto=true;
				}
				catch(InputMismatchException e) {
					System.out.println("Introduce un mes correcto");
					escribe.nextLine();
				}
			}
			while(!mescorrecto);
			
		if(mes==1 || mes==2 || mes==3) {
			System.out.println("Te encuentras en la estación de invierno");
		}
			
			else if(mes==4 || mes==5 || mes==6) {
				System.out.println("Te encuentras en la estación de primavera");
			}
				
				else if(mes==7 || mes==8 || mes==9) {
					System.out.println("Te encuentras en la estación de verano");
				}
					
					else if(mes==10 || mes==11 || mes==12) {
						System.out.println("Te encuentras en la estación de otoño");
			}
				}
					while(mes<1 || mes >12);
					
		}
		
		

	}

