package minumeroejercicio;

import java.util.Scanner;


public class MiNumero {
	
	private static int numero;
	
	public MiNumero() {
		this.numero=0;
	}
	
	public MiNumero(int numero) {
		this.numero=numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	
	static void CambiaNumero() {
		Scanner minumero=new Scanner(System.in);
		System.out.println("Elige el nuevo número:");
		int numero2= minumero.nextInt();
		numero=numero2;
		System.out.println(numero);
		
	}
	
	static void Suma() {
		Scanner minumero=new Scanner(System.in);
		System.out.println("Elige la cantidad a sumar al número:");
		int numero2=minumero.nextInt();
		numero2+=numero;
		numero=numero2;
		System.out.println(numero);
		
	}
	
	static void Resta() {
		Scanner minumero=new Scanner(System.in);
		System.out.println("Elige la cantidad a restar al número:");
		int numero3=minumero.nextInt();
		numero-=numero3;
		System.out.println(numero);
	}
	
	static void getValor() {
		System.out.println(numero);
	}
	
	static void getDoble() {
		System.out.println(numero*2);
	}
	
	static void getTriple() {
		System.out.println(numero*3);
	}
	
	static void getCuadruple() {
		System.out.println(numero*4);
	}
	
	

}
