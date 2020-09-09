import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Travel time Calculator");
		Scanner sc = new Scanner(System.in);
		
		double miles = 0;
		double mph = 0;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			miles = sc.nextDouble();
			
			System.out.print("Enter miles per hour: ");
			mph = sc.nextDouble();
			
			System.out.println("Estimated travel time: ");
			System.out.println("---------------------");
			
			double hours = miles / mph;
			hours = (int) Math.round(hours * 100) / 100;
			final int MIN_PER_HOUR = 60;
			double minutes = hours / MIN_PER_HOUR;
			// minutes = (int) Math.round(minutes * 10) / 10;
			
			System.out.println("Hours : "+ hours);
			System.out.println("Minutes: "+ minutes);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			
		}
			
		
		
		// Get user Input
		
		
		// Business Rules
		
		
		// Get user output
		
		
		// Bye
		System.out.println("Bye");

	}

}
