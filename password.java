package password;

//Set your password and then write it again to access to your account. You have only 3 attempts. At third, you'll be suspended.
import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		
		Scanner password= new Scanner(System.in);
		
		System.out.println("Set your password:");
		
		String correctpass= password.nextLine();
		
		System.out.println("Password established");
		
		int attempts= 0;
		String passtwo;
		
		for(int i=0;i<3;i++) {
			
			attempts++;
			
			System.out.println("Type your password:");
			passtwo= password.nextLine();	
			
			if(passtwo.equals(correctpass)){
				System.out.println("Welcome to your account");
				break;	
			}
			
			if(attempts==1) {
				System.out.println("First attempt");
			}
			if(attempts==2) {
				System.out.println("Second attempt");
			}
			if(attempts==3) {
				System.out.println("Third attempt. Your account has been suspended.");
			}
							}
	}
}
		
			





	
	
