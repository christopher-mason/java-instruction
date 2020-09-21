import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List application");
		Scanner sc = new Scanner(System.in);
		
		String firstName;
		String lastName;
		String email;
		String phoneNumber;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter First Name: ");
			firstName = sc.next();
			System.out.println("Enter Last Name: ");
			lastName = sc.next();
			System.out.println("Enter Email: ");
			email = sc.next();
			System.out.println("Enter Phone: ");
			phoneNumber = sc.next();
			
		}

	}

}
