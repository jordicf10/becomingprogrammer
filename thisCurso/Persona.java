package thisCurso;

public class Persona {
	String nombre;
	
	public Persona(String nombre) {
		this.nombre=nombre;
		
		Imprimir i= new Imprimir();
		i.imprimir(this);
		
	}
	
}

class Imprimir{
	
	public void imprimir(Object o) {
		System.out.println("Imprimir parámetro: " + o);
		System.out.println("Imprimir objecto actual (this): " + this);
		
	}
	

}
