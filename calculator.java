package calculator;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class calculator {

	public static void main(String[] args) {
		
		Scanner op= new Scanner(System.in);
		
		System.out.println("Introduce your first number");
		
		int num1=op.nextInt();	
		
		System.out.println("Introduce what type of operation you want to do:\n1.Addition(+)\n2.Subtraction(-)\n3."
				+ "Multiplication(*)\n4.Division(/)\n5.Power(^)\n6.Rest(%)");
		
		String operation= op.next();
		
		System.out.println("Introduce your second number");
		
		int num2=op.nextInt();
		
		switch(operation){
			
			case "+":
				System.out.println("The addition of " + num1 + " plus " + num2 + " is = " + (num1+num2) );
				break;
				
			case "-":
				System.out.println("The substraction of " + num1 + " minus " + num2 + " is = " + (num1-num2));
				break;
				
			case "*":
				System.out.println("The multiplication of " + num1 + " by " + num2 + " is = " + (num1*num2));
				break;
				
			case "/":
				System.out.println("The division of " + num1 + " by " + num2 + " is = " + (num1/num2));
				break;
				
			case "^":
				System.out.println("The power of " + num1 + " to power " + num2 + " is = " + (Math.pow(num1, num2)));
				break;
				
			case "%":
				System.out.println("The rest of " + num1 + " by " + num2 + " is = " + (num1%num2));
				break;
		}
		
		
		
		
		
		
		
		

	}

}
