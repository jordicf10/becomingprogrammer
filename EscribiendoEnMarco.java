package creandomarcos;

import javax.swing.*;

import java.awt.*;
import java.lang.ProcessBuilder.Redirect;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		MarcoConTexto mimarco=new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(600, 300);
		setTitle("Mi marco");
		
		Lamina milamina=new Lamina();
		add(milamina);
		
	}
}


class Lamina extends JPanel{
	

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(getBackground().BLUE);
		g.drawString("Hola", 250, 250);
		
		
	}
	
	
}
