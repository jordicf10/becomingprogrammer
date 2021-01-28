package ejemploherencia;

public class HerenciaEmpleado extends HerenciaPersona {
	
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	/*public HerenciaEmpleado(String nombre, char genero, int edad, String direccion, double sueldo) {
		super(nombre, genero, edad, direccion);
		this.sueldo=sueldo;
		contadorEmpleado++;
		idEmpleado=contadorEmpleado;
		
	}*/
	
	public HerenciaEmpleado(String nombre, double sueldo) {
		super(nombre);
		contadorEmpleado++;
		idEmpleado=contadorEmpleado;
		this.sueldo=sueldo;

	}
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	
	public static int getContadorEmpleado() {
		return contadorEmpleado;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "; Su ID como empleado es " + idEmpleado + " y tiene un sueldo de " + sueldo + " euros";
	}
}
