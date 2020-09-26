
public class NumberCheckerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Odd/Even Checker!");

		MyConsole console = new MyConsole();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int number = console.getInt("Enter an integer: ");

			String evenOdd;
			if (number % 2 == 0) {
				evenOdd = "even";
			} else {
				evenOdd = "odd";
			}

			System.out.println("The number " + number + " is " + evenOdd + ".");

			choice = console.getString("Continue? (y/n): ");
		}

	}

}
