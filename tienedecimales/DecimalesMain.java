package tienedecimales;

public class DecimalesMain {

	public static void main(String[] args) {
		Decimales decimal=new Decimales(9);
		
		if(decimal.TieneDecimales()==true) {
			System.out.println("El n�mero " + decimal.getNum() + " tiene decimales");
		}
		else {
			System.out.println("El n�mero " + decimal.getNum() + " no tiene decimales");
		}

	}

}
