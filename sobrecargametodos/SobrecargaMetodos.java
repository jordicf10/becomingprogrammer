package sobrecargametodos;

public class SobrecargaMetodos {
	
	public static void main(String[]args) {
		
		System.out.println("Método sumar double+double " + SobrecargaMetodos.sumar(4.5, 7.3));
		
		System.out.println("Método sumar double+int " + SobrecargaMetodos.sumar(8.1, 4));
		
		System.out.println("Método sumar int+double " + SobrecargaMetodos.sumar(9, 3.9));
		
		System.out.println("Método sumar int+int " + SobrecargaMetodos.sumar(45, 67));
		
		System.out.println(SobrecargaMetodos.sumar(45.3, 'z'));
		
	}
	
	
	public static int sumar(int a, int b) {
		return a+b;
	}
	
	public static double sumar(double a, int b) {
		return a+b;
	}
	
	public static double sumar(int a, double b) {
		return a+b;
	}
	
	public static double sumar(double a, double b) {
		return a+b;
	}
	
	
	
	

}
