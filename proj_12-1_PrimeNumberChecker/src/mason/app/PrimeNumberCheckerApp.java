package mason.app;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Prime Number Checker");
		System.out.println();
		
		List<Integer> factors = new ArrayList<>();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int numToCheck = Console.getInt("Enter a number between 1 and 50000: ");
			
			if(numToCheck < 1 || numToCheck > 50000) {
				System.out.println("Number out of range");
				continue;
			}
			
			for (int i = 1; i <= numToCheck; i++) {
				if ((numToCheck % i) == 0) {
					factors.add(i);
					
				}
			}
			if (numToCheck == 1 || factors.size() == 2) {
				System.out.println(numToCheck + " is a prime number");
			} else {
				System.out.println(numToCheck + " is NOT prime.");
				System.out.print("It has " + factors.size() + " factors: ");
				for (Integer factor : factors) {
					System.out.print(factor + " ");
				}
				System.out.println();
			}
			factors.clear();
			
			choice = Console.getString("Try again? (y/n)");
		}
		System.out.println("Bye!");
	}

}
