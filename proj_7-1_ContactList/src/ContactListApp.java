import java.util.Scanner;

public class ContactListApp {
	
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the Contact List Applicaiton");
		System.out.println();
	}
	
	private static void printFarewellMessage() {
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		printWelcomeMessage();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			String firstName = Console.getString("Enter first name: ");
			String lastName = Console.getString("Enter last name: ");
			String email = Console.getString("Enter email: ");
			String phoneNumber = Console.getString("Enter phone number: ");
			
//			Contact contact = new Contact();
//			contact.setfirstName(firstName);
//			contact.setlastName(lastName);
//			contact.setEmail(email);
//			contact.setPhoneNumber(phoneNumber);
			
			// to start using other classes, this is how you bring it in. Note the class name 'Contact' and then we bring in 'new' class
			Contact contact = new Contact(firstName, lastName, email, phoneNumber); 
			
			System.out.println(contact.displayContact());
			System.out.println();
			
			choice = Console.getString("Continue? (y/n): ");
			System.out.println();

		}
		printFarewellMessage();
	}

}
