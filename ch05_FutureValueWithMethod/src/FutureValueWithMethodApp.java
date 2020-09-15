import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueWithMethodApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (!choice.equalsIgnoreCase("n")) {
			// get the input from the user
			double monthlyInvestment = getDoubleWithinRange(sc, "Enter monthly Investment: ", 0, 1000); // can't have declared variables in 'try' statement
			double interestRate = getDoubleWithinRange(sc, " Enter yearly interest rate: ", 0, 30);
			int years = getIntWithinRange(sc, "Enter number of years: ", 0, 100);
			
			//monthlyInvestment = getDouble(sc, "Enter monthly investment:   " );

			//System.out.print("Enter monthly investment:   ");
//			if (sc.hasNextDouble()) {
//				monthlyInvestment = sc.nextDouble();
//				sc.nextLine();
//			} else {
//				System.out.println("Invalid investment amount");
//				sc.nextLine();
//				continue;
//			}
//			
			//interestRate = getDouble(sc, "Enter yearly interest rate: ");

			//System.out.print("Enter yearly interest rate: ");
//			if (sc.hasNextDouble()) {
//				interestRate = sc.nextDouble();
//				sc.nextLine();
//			} else {
//				System.out.println("Invalid interest rate\n");
//				sc.nextLine();
//				continue;
//			}
//			
			
			//years = getInt(sc, "Enter number of years:      ");
//			System.out.print("Enter number of years:      ");
//			years = sc.nextInt();

			// convert yearly values to monthly values
			double monthlyInterestRate = interestRate / 12 / 100;
			int months = years * 12;

			// call the future value method
			//System.out.println("About to call calculateFutureValue");
			double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);

			// format and display the result
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("Future value:               " + currency.format(futureValue));
			System.out.println();

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}

	private static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {
		// System.out.println("In calculateFutureValue");
		double futureValue = 0.0;
		for (int i = 1; i <= months; i++) {
			futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
		}
		// System.out.println("Returning " + futureValue);
		return futureValue;
		
	}	
		
	public static double getDouble(Scanner sc, String prompt) {
		double retval = 0.0; // retval means return value. it's industry standard
		
		boolean isValid = false; // assuming user does not put in good values
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				retval = sc.nextDouble();
				isValid = true;
				sc.nextLine();
			} else {
				System.out.println("Invalid decimal number");
				sc.nextLine();
			}
		}
		return retval;
	}
		
	public static int getInt(Scanner sc, String prompt) {
		int retIntVal = 0;
		
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				retIntVal = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Invalid number");
			}
			sc.nextLine();
		}
		return retIntVal;
	}
	
	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
		double d = 0.0;
		
		boolean isValid = false;
		while (!isValid) {
			d = getDouble(sc, prompt);
			if (d <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (d >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return d;
	}

	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		
		boolean isValid = false;
		while (!isValid) {
			i = getInt(sc, prompt); 
			if (i <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (i >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;
	}
}