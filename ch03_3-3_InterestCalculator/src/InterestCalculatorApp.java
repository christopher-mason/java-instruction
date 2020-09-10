import java.util.Scanner; 
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		double loanAmount = 0;
		double rate = 0;
				
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter loan amount: ");
			loanAmount = sc.nextDouble();
			NumberFormat currency = NumberFormat.getCurrencyInstance();
				String loanString = currency.format(loanAmount);
			
			System.out.print("Enter interest rate: ");
			rate = sc.nextDouble();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			String rateString = percent.format(rate);
			System.out.println();
			
			double interest = loanAmount * rate;
			BigDecimal interestString = new BigDecimal(Double.toString(interest));
			interestString = interestString.setScale(2, RoundingMode.HALF_UP);
			NumberFormat interestRate = NumberFormat.getCurrencyInstance();
				String interestRateString = interestRate.format(interestString);
			System.out.println("Loan amont: "+ loanString);
			System.out.println("Interest rate: "+ rateString);
			System.out.println("Interest: "+ interestRateString);
			System.out.println("Continue? (y/n)");
			System.out.println();
			choice = sc.next();			
			
		}
		System.out.println("Bye");
	}

}
