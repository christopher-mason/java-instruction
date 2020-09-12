import java.text.NumberFormat;

public class FutureValuesApp {

	public static void main(String[] args) {
		// get the currency and percent formatters
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(1);
		
		// set the monthly payment to 100 and display it to the user
		int monthlyInvestment = 100;
		System.out.println("Monthly investment: " + currency.format(monthlyInvestment) + "\n");
		
		// create the header row and add it to the table
		String table = "";
		String headerRow = "Year	       ";
		for (double rate = 5.0; rate < 7.0; rate += .5) {
			headerRow += percent.format(rate/100) + "	       ";
		}
		table += headerRow + "\n";
		
		// Loop through the years
		for (int year = 1; year < 7; year++) {
			// add year to the start of the row
			String row = year + "	  ";
			
			// Loop through each interest rate
			for (double rate = 5.0; rate < 7.0; rate += .5) {
				int months = year * 12;
				double monthlyInterestRate = rate/12/100;
				
				// Calculate the future vale
				double futureValue = 0.0;
				for (int i = 1; i <= months; i++) {
					futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
				}
			
				// Add the calculation to the row
				row += currency.format(futureValue) + "	  ";
			}
			// Add row to the table
			table += row + "\n";
		}
		System.out.println(table);
		
	}

}
