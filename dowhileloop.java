package dowhileloop;

import javax.swing.JOptionPane;

// You have to introduce a number higher or equal to zero. If not, do...while loop ask again 
public class dowhileloop {

	public static void main(String[] args) {
		
		int number= 0;
		
		do {
		
		 number= Integer.parseInt(JOptionPane.showInputDialog("Introduce a number:"));

	}
		while(number<0);
		
		System.out.println("Your number is " + number);
	}
}
	
