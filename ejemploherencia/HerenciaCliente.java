package ejemploherencia;

import java.util.Date;


public class HerenciaCliente extends HerenciaPersona {
	
	private int idCliente;
	private java.util.Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;
	
	/*public HerenciaCliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip) {
		super(nombre, genero, edad, direccion);
		this.fechaRegistro=fechaRegistro;
		this.vip=vip;
		contadorCliente++;
		idCliente=contadorCliente;
	}*/
	
	public HerenciaCliente(Date fechaRegistro, boolean vip) {
		//super();
		contadorCliente++;
		idCliente=contadorCliente;
		this.fechaRegistro=fechaRegistro;
		this.vip=vip;
			
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro=fechaRegistro;
	}
	
	public boolean getIdVip() {
		return vip;
	}
	
	public void setIdVip(boolean vip) {
		this.vip=vip;
	}
	
	public static int getContadorCliente() {
		return contadorCliente;
	}
	
	@Override
	public String toString() {
		/*return "El individuo nº " + getIdPersona() + " cuyo nombre es " + getNombre() + " es " + getGenero() + ", tiene " 
	+ getEdad() + " años y vive en " + getDireccion() + ";*/ 
		return super.toString() + "; Su ID como cliente es " + idCliente + ", su fecha de registro es " + 
				fechaRegistro + " y su estado como VIP es " + vip;
	
	}
	
	
}
	
	
