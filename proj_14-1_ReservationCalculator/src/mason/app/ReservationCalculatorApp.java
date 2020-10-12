package mason.app;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int arMon = Console.getInt("Enter the arrival month (1-12): ");
			int arDay = Console.getInt("Enter the arrival day (1-31): ");
			int arYear = Console.getInt("Enter the arrival year: ");
			System.out.println(arMon + arDay + arYear);
		}

		choice = Console.getString("Continue? (y/n): ");
		System.out.println("Bye!");
	}

}
