import java.util.Scanner; 
import java.math.*;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		final int CENTS_PER_QUARTER = 25;
		final int CENTS_PER_DIME = 10;
		final int CENTS_PER_NICKEL = 5;
		
		
		System.out.println("Welcome to the Change Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter number of cents (0-99): ");
		    int cents = sc.nextInt(); //use int cuz we need whole numbers
		    
		    int numQuarters = cents / 25;
		    // prepare to use the modulus %
		    // cents = cents % 25; // or you could write it as 'cents %= 25;' but we are using below as the example
		    cents %= CENTS_PER_QUARTER;
		    
		    int numDimes = cents / CENTS_PER_DIME;
		    cents %= CENTS_PER_DIME;
		    
		    int numNickels = cents / CENTS_PER_NICKEL;
		    cents %= CENTS_PER_NICKEL;
		    
		    int numPennies = cents; // no need to divide by 1 for penny
		    
		    System.out.println("Quarters: " + numQuarters);
		    System.out.println("Dimes: " + numDimes);
		    System.out.println("Nickel: " + numNickels);
		    System.out.println("Pennies: " + numPennies);
		    System.out.println();
		    
		    System.out.println("Continue? (y/n)");
		    choice = sc.next();
		    
		}  

			System.out.println("Bye");
	}
	
}

