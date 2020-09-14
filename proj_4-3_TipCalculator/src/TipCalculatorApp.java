import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tip Calculator\n");
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		String choice;
		
		do {
			System.out.print("Cost of the meal: ");
			BigDecimal cost = sc.nextBigDecimal();
			
			BigDecimal tipIncrement = new BigDecimal("0.05");
			BigDecimal tipPercent = new BigDecimal("0.15");
			
			for (int i = 0; i < 3; ++i) {
				// Calculate tip and total
				BigDecimal tipAmount = cost.multiply(tipPercent);
				BigDecimal totalCost = cost.add(tipAmount);
				
				System.out.println(percent.format(tipPercent));
				System.out.println("Tip Amount:       " + currency.format(tipAmount));
				System.out.println("Total Amount:     " + currency.format(totalCost));
				System.out.println();
				
				// Increment to next tip amount
				tipPercent = tipPercent.add(tipIncrement);
			}
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
		
		
		
		
		
		
		
		
		
		
		
/*		
		System.out.println("Welcome to the Tip Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cost of meal: ");
		BigDecimal cost = sc.nextBigDecimal();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(2);
		
		System.out.println("Welcome to the Tip Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Meal Cost		
		System.out.println("Cost of meal: ");
		cost = sc.nextBigDecimal();
		currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(2);
		
		System.out.println("15%");
		System.out.print("Tip Amount:  "+ cost);
		
		System.out.print("Total amount: ");
		
		
		System.out.println("20%");
		System.out.print("Tip Amount:  " + cost);
		
		System.out.print("Total amount: ");
		
		System.out.println("25%");
		System.out.print("Tip Amount:  " + cost);
		
		System.out.print("Total amount: ");
		
		System.out.print("Continue? y/n: ");
		choice = sc.next();
		System.out.println();
		System.out.println("Bye!");
		}
*/
	}

}
