import java.util.Scanner;
import java.math.*;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter number of cents (0-99): ");
		    double amount = sc.nextDouble();
		    
//		    int amountInt = (int) (amount * 100);
//		    double change = 0;
	     
		  /*if(amount >= 25) {
	        change = (int) amount/.25;
	        amount = amount % .25;
		    }
		  
		  if(amount >= 10) {
	        change = (int) amount/.10;
	        amount = amount % .10;
		    }
		  
		  if(amount >= 5) {
		        change = (int) amount/.05;
		        amount = amount % .05;
		    }
		  
		  if(amount >= 1) {
		        change = (int) amount/.01;
		        amount = amount % 01;
		    }
	    */
		    System.out.println("Quarters: "+ change);
		    System.out.println("Dimes: "+ change);
		    System.out.println("Nickels: "+ change);
		    System.out.println("Pennies: "+ change);
		    
		    System.out.println("Continue? (y/n)");
		    choice = sc.next();   
		
		}	
			System.out.println("Bye");
	}
	
}
