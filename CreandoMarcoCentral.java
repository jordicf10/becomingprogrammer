package creandomarcos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class CreandoMarcoCentral {

	public static void main(String[] args) {
		
		MarcoCentrado mimarco= new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		
		
		

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mipantalla= Toolkit.getDefaultToolkit();  //le pasamos nuestro sistema nativo de pantalla con la clase Toolkit
		
		Dimension size=mipantalla.getScreenSize();   //Almacenamos el tamaño de nuestra pantalla con la clase Dimension
		
		int alturaPantalla=size.height;  //Almacenamos el alto de la pantalla
		
		int anchoPantalla=size.width;    //Almacenamos el ancho de la pantalla
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		
		setLocation(anchoPantalla/4,alturaPantalla/4); //Con esto estará centrado
		
		setTitle("Marco Centrado");  //Para poner título a la ventana
		
		Image miicono=mipantalla.getImage("src/creandomarcos/icono.png");   //para cambiar el icno de la ventana usamos la clase Image
		
		setIconImage(miicono);  //establecemos el icono
		
		
		
	}
	
}
