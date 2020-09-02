import java.util.Scanner;

public class StringApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the String App!");
		
		String firstName = "Bob"; // the = is an assignment operator
		String lastName = "Marley";
		
		System.out.println("Hello, "+firstName+" "+lastName);
		
		String fullName = firstName;
		System.out.println("fullName = "+fullName);
		fullName = fullName + " ";
		System.out.println("fullName = "+fullName);
		fullName += lastName;
		System.out.println("fullName = "+fullName);
		
		System.out.println("This is a sentence that\n"
				+ "is on 2 lines");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.println("You entered: "+sentence);
		
		System.out.println("Enter a name: ");
		String name = sc.next();
		System.out.println("You entered: "+name);
		
		// get numbers from the user
		System.out.print("Enter a whole number: ");
		int i = sc.nextInt();
		System.out.println("You entered: "+i);
		
		System.out.print("Enter a decimal number: ");
		double d = sc.nextDouble();
		System.out.println("You entered: "+d);
		
		// use relational operators
		if (i > 10) {
			System.out.println("i is greater than 10!");
		}
		
		// while loop
		System.out.println("Do you want to continue? (y/n)");
		String choice = sc.next();
		while (choice.equalsIgnoreCase("y")) { 
			System.out.println("User wants to continue!!!!");
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
			
		System.out.println("Bye!");

	}

}
