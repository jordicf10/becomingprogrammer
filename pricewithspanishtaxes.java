package pricewithspanishtaxes;

import javax.swing.JOptionPane;

public class pricewithspanishtaxes {

	public static void main(String[] args) {
		
		double price;
		
		price= Double.parseDouble(JOptionPane.showInputDialog("Introduce price of product"));
		
		final double taxprice = (price*21)/100;
		
		double finalprice= price + taxprice;
		
		System.out.println("If your product has a price of " + price + " you have to pay a final cost of " + finalprice);
		
		

	}

}
