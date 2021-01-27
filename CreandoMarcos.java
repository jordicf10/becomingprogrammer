package creandomarcos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1= new miMarco();
		
		marco1.setVisible(true);
		
		
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que al darle a la x se cierre la ventana y FINALICE SU CARGA EN MEMORIA
															//si no lo ponemos, al cerrar la ventana sigue ejecutándose el programa
	
		
	}

}

class miMarco extends JFrame{
	
	public miMarco() {
		
		
		/*setSize(500,300);
	
		setLocation(500,300);*/
		
		setBounds(500,300,550,250);  //para establecer la posició del marco al abrirlo
		
		//setResizable(true);  //para no cambiar tamaño del marco. Si ponemos true podremos modificar el tamaño del marco	
		
		//setExtendedState(Frame.MAXIMIZED_BOTH); // para abrir con el marco maximizado
		
		setTitle("Mi ventana");
		
	}
	
	
}


