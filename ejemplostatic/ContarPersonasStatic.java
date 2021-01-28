package ejemplostatic;

public class ContarPersonasStatic {
	
	private String nombre;
	private int idPersona;
	private static int contadorPersonas;
	
	public ContarPersonasStatic(String nombre) {
		
		contadorPersonas++;  //Cada vez que creamos un objeto Persona incrementamos el contador para obtener un nuevo idPersona
		idPersona=contadorPersonas;
		this.nombre=nombre;
		
	}
	
	public String getNombre() {
		return nombre;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public static int getContadorPersonas() {
		return contadorPersonas;
	}
	
	public int getidPersona() {
		return idPersona;
	}
	
	public void setidPersona(int idPersona) {
		this.idPersona=idPersona;
	}
	
	public String toString() {
		return "Persona[idPersona: " + idPersona + " , nombre: " + nombre + "]";
	}
	
}

