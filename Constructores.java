package constructores;


public class Constructores {
	
	private String nombre;
	private int edad;
	private static int contadorpersonas;
	private int persona;
	boolean vacio= false;
	boolean todo= false;
	boolean nombres= false;
	boolean edades= false;
	
	public Constructores() {
		contadorpersonas++;
		persona=contadorpersonas;
		vacio=true;
		
		
	}
	
	public Constructores(String nombre, int edad) {
		contadorpersonas++;
		persona=contadorpersonas;
		this.nombre=nombre;
		this.edad=edad;
		todo=true;
		
		
	}
	
	public Constructores(String nombre) {
		contadorpersonas++;
		persona=contadorpersonas;
		this.nombre=nombre;
		nombres=true;
		
	}
	
	public Constructores(int edad) {
		contadorpersonas++;
		persona=contadorpersonas;
		this.edad=edad;
		edades=true;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public static int getContadorPersonas() {
		return contadorpersonas;
		
		
	}
	
	
	
	public String toString() {
		
	if(vacio) {
		return "Este es el hombre sin nombre ni edad pero al menos tiene ID como individuo, y es el " + persona;
	}
	else if (todo) {
		return "El inviduo cuyo nombre es " + nombre + " tiene " + edad + " años y su ID de persona es: " + persona;
	}
	else if(nombres) {
		return "El caballero o señora " + nombre + " es una persona sin edad y su ID de persona es: " + persona;
	}
	else {
		
	return "Este individuo no tiene nombre pero si que tiene una edad, tiene " + edad + " años y su ID de persona es: " + persona;
	
	
	}
	}
		

}
