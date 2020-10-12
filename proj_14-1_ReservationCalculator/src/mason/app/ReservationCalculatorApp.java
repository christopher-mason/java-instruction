package mason.app;

import java.time.LocalDate;
import business.app.Reservation;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			LocalDate arrivalDate = Console.getLocalDate("arrival");
			System.out.println();
			LocalDate departureDate = Console.getLocalDate("departure");
			
			Reservation res = new Reservation(arrivalDate, departureDate);
			System.out.println();
			
			System.out.println("Arrival Date: " + res.getArrivalDateFormatted());
			System.out.println("Departure Date: " + res.getDepartureDateFormatted());
			System.out.println("Price: " + res.getPricePerNightFormatted() + " per night");
			System.out.println("Total Price: " + res.getTotalPriceFormatted() + " for " + res.getNumberOfNights() + " nights");
			System.out.println();
			
			
			choice = Console.getString("Continue? (y/n): ");
		}

		System.out.println("Bye!");
	}

}
