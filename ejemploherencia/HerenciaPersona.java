package ejemploherencia;

public class HerenciaPersona {
	
	private String nombre;
	private char genero;
	private int edad;
	private String direccion;
	private static int contadorPersona= 0;  //AFEGIT PER MI
	private int idPersona;      //AFEGIT PER MI
	
	public HerenciaPersona() {
		contadorPersona++;     
		idPersona=contadorPersona; 
	}
	
	public HerenciaPersona(String nombre) {
		contadorPersona++;     
		idPersona=contadorPersona;
		this.nombre=nombre;
	}
	
	public HerenciaPersona(String nombre, char genero, int edad, String direccion) {
		contadorPersona++;     //AFEGIT PER MI
		idPersona=contadorPersona;     //AFEGIT PER MI
		this.nombre=nombre;  
		this.genero=genero;
		this.edad=edad;
		this.direccion=direccion;

	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void SetNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero=genero;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	//MÈTODO AFEGIT PER MI
	
	public static int getContadorPersona(){
		return contadorPersona;
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	
	
	
	public String toString() {
		return "El individuo nº " + idPersona + " cuyo nombre es " + nombre + " es " + genero + ", tiene " + edad + ""
				+ " años y vive en " + direccion;
	}
}
