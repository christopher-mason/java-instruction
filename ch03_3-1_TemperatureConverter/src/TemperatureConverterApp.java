import java.text.NumberFormat; 
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Temperature Converter");
		Scanner sc = new Scanner(System.in);
		
		double fh;
		double c;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter Degrees in Fahrenheit: ");
			fh = sc.nextDouble();
			c = (fh-32)/1.8;
			NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            String cString = number.format(c);
			System.out.println("Degrees in Celsius: "+cString);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
		
		// User Input
		
		
		// Business Rules
		
		
		// Display Output
		
		
		// Goodbye
		System.out.println("Bye");
	}

}
