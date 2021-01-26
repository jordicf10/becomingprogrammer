package creacionClasesCurso;

public class Persona {
	
	 String nombre;
	 char genero;
	 String ocupacion;
	
	
	public Persona() {
		
	}
	

	public Persona(String nombre, char genero, String ocupacion) {
		this.nombre=nombre;
		this.genero=genero;
		this.ocupacion=ocupacion;
	}


	public  String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public  char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero=genero;
	}
	
	public  String getOcupacion() {
		return ocupacion;
	}
	
	public void setOcupacion(String ocupacion) {
		this.ocupacion=ocupacion;
	}
	
	public String getDatos () {
		
			return "La persona " + getNombre() + " que es un/a " + getGenero() + " trabaja como " + getOcupacion();
		}
		
		
	}


