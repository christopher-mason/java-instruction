import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");

		Scanner sc = new Scanner(System.in);

		int number = 0;
		long factorial = 1;

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that is greater than zero but less than 10: ");
			number = sc.nextInt();
			factorial = 1;
			for (int i = 1; i <= number; i++) {
				factorial = factorial * i;
			}
			if (number > 10) {
				System.out.println("Error! Invalid integer.");
			}
			System.out.println("The factorial of " + number + " is " + factorial);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
		System.out.println("Bye");
	}

}
