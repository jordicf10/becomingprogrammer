package divisionby2;

import javax.swing.JOptionPane;

public class divisionby2 {

	public static void main(String[] args) {
			
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduce one number:"));
		
		if(num%2==0) {
			System.out.println("Your number can division by 2");		
		}
		else {
			System.out.println("Your number is not divisible by 2");
		}
		
		
		
	}

}
