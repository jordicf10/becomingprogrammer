package esonopositivo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numero {
	
	private double num;
	
	
	public Numero() {
		
		
		
		
		System.out.println("Introduce un n�mero y averigua si es positivo o negativo:");
		
		boolean numcorrecto=false;
		
		do {
			
			try{
			Scanner inserta=new Scanner(System.in);
			num=inserta.nextDouble();
			numcorrecto=true;
			this.num=num;
			
			}
			catch(InputMismatchException e) {
				numcorrecto=false;
				System.out.println("Introduce un n�mero v�lido:");
			}
		}
		while(!numcorrecto);
		
		System.out.println("El n�mero introducido es " + num);
	}
	
	public double getNum() {
		return num;
	}
	
	public void setNum(double num) {
		this.num=num;
	}
	
	public String esnoespositivo() {
		if (num<0) {
			return "El numero es negativo";
		}
		else if(num==0) {
			return "El n�mero es igual a 0";
		}
		else {
			return "El numero es positivo";
		}
	}

}
