import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (!choice.equalsIgnoreCase("n")) {
			// get the input from the user
			System.out.print("Enter customer type (r/c/t): "); // Step 4, added 't'
			String customerType = sc.next();
			System.out.print("Enter subtotal:   ");
			double subtotal = sc.nextDouble();

			// get the discount percent
			double discountPercent = 0.0;

			if (customerType.equalsIgnoreCase("r")) {
				if (subtotal < 100) {
					discountPercent = 0.0;
				} else if (subtotal >= 100 && subtotal < 250) {
					discountPercent = .1;
				} else if (subtotal >= 250 && subtotal < 500) { // Step 2
					discountPercent = .25;
				} else if (subtotal > 500) { // Step 2
					discountPercent = .3;
				}

			} else if (customerType.equalsIgnoreCase("c")) {
				// if (subtotal > 0) { // Step 3
				discountPercent = .2;

			} else if (customerType.equalsIgnoreCase("t")) { // Step 4
				if (subtotal < 500) {
					discountPercent = .4; // Step 4
				} else if (subtotal >= 500) { // Step 4
					discountPercent = .5; // Step 4
				}
			} else {
				discountPercent = 0; // Step 5
			}

			/*
			 * switch(customerType) { case "r": case "R": if (subtotal < 100) {
			 * discountPercent = 0.0; } else if (subtotal >= 100 && subtotal < 250) {
			 * discountPercent = .1; } else if (subtotal >= 250 && subtotal < 500) { //Step
			 * 2 discountPercent = .25; } else if (subtotal > 500) { // Step 2
			 * discountPercent = .3; } break; case "c": case "C": // if (subtotal > 0) { //
			 * Step 3 discountPercent = .2; // } else if (subtotal >= 250) { //
			 * discountPercent = .3; //} break; case "t": // Step 4 case "T": // Step 4 if
			 * (subtotal < 500) { // Step 4 discountPercent = .4; // Step 4 } else { // Step
			 * 4 discountPercent = .5; // Step 4 } break; default: //discountPercent = .1;
			 * discountPercent = 0; // Step 5 break; }
			 */
			// calculate the discount amount and round to 2 decimals
			double discountAmount = subtotal * discountPercent;
			discountAmount = Math.ceil(discountAmount * 100) / 100;

			// calculate the total
			double total = subtotal - discountAmount;

			// format and display the results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			System.out.println("Discount percent: " + percent.format(discountPercent) + "\n" + "Discount amount:  "
					+ currency.format(discountAmount) + "\n" + "Total:            " + currency.format(total) + "\n");

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}
}