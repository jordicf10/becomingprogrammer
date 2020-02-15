package primusnumbers;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
       int number;
       
       Scanner num= new Scanner(System.in);
       
       System.out.println("Introduce a number:");
       
       number=num.nextInt();
       
       if(number<=1) {
    	   System.out.println("Your number " + number + " is not a primus number");
    	   
       }
    	   
    	   int divisibles= 0;
    	   
    	   int raiz= (int)Math.sqrt(number);
    	   
    	   for(int i=raiz; i>1; i--) {
    		   if (number%i==0)
    		   divisibles++;
    	   }
    	   
    	   if(divisibles<1) {
    		   System.out.println("Counter= " + divisibles + ". Your number " + number + " is a primus number");
    	   }
    	   else {
    		   System.out.println("Counter= " + divisibles + ". Your number " + number + " is not a primus number");
    	   }
       }
       
       
    }
       
    
       
       
       
