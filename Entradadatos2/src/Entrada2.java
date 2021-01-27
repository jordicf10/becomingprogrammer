import javax.swing.*;
public class Entrada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");

		String edad=JOptionPane.showInputDialog("Introduce tu edad");
		
		System.out.println("Tu nombre es " + nombre_usuario + " y tienes " + edad + " años");
		
		
	}

}
