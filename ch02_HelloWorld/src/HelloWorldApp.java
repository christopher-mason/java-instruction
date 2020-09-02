import java.util.Scanner;

public class HelloWorldApp {

	public static void main(String[] args) {
		// System.out.println("Hello, World!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Is Star Trek better than Star Wars? (y/n)");		
		String choice = sc.next();
		while (choice.equalsIgnoreCase("n")) {
			System.out.println("That is not correct");
			System.out.println("Would you like to change your mind? (y/n)");
			choice = sc.next();
		}
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("That is correct!");
			choice = sc.next();
		}
		
		System.out.println("Bye!");

	}

}
