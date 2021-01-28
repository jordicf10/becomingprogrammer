package minumeroejercicio;

public class MinumeroMain {

	public static void main(String[] args) {
		
		MiNumero n1= new MiNumero(10);
		
		System.out.println("\nValor objeto con getValor: " );
		MiNumero.getValor();
		
		
		MiNumero.CambiaNumero();
		
		System.out.println("\nValor objeto con getValor: ");
		MiNumero.getValor();
		
		MiNumero.Suma();
		
		System.out.println("\nValor objeto con getValor: ");
		MiNumero.getValor();
		
		System.out.println("\nValor objeto con getDoble: "); 
		MiNumero.getDoble();
		
		MiNumero.CambiaNumero();
		
		
		System.out.println("\nValor objeto con getTriple: ");
		
		MiNumero.getTriple();
		
		MiNumero.CambiaNumero();
		
		
		
		System.out.println("\nValor actual objeto con getValor: "); 
		MiNumero.getValor();
		
		MiNumero.Resta();
		
		System.out.println("\nValor objeto con getCuadruple: ");
		MiNumero.getCuadruple();
		
		
		
	}

}
