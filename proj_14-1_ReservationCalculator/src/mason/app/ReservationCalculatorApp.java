package mason.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int arMon = Console.getInt("Enter the arrival month (1-12): ", 1, 12);
			int arDay = Console.getInt("Enter the arrival day (1-31): ", 1, 31);
			int arYear = Console.getInt("Enter the arrival year: ", 2020, 2200);
			
			LocalDate arrivalDate = LocalDate.of(arYear, arMon, arDay);
			
			
			DateTimeFormatter dtFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
			
			choice = Console.getString("Continue? (y/n): ");
		}

		System.out.println("Bye!");
	}

}
