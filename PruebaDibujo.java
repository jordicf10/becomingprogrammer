package creandomarcos;

import javax.swing.*;

import java.awt.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		MarconConDibujos mimarco=new MarconConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarconConDibujos extends JFrame{
	
	public MarconConDibujos() {
		
		setTitle("Mi dibujo");
		setSize(400, 400);
		LaminaConFiguras lamina1=new LaminaConFiguras();
		add(lamina1);
	}
}


class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(70, 70, 225, 225);   //Para dibujar rectángulos
		//g.drawLine(100, 70, 200, 200);  //Para dibujar líneas
		g.drawArc(50, 100, 100, 200, 250, 250);  //Para dibujar arcos
		
	}
}
