import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			String firstName = Console.getString("enter first name");
			String lastName = Console.getString("enter last name");
			String email = Console.getString("enter email ");
//			int phoneNumber = Console.getInt("phoneNumber:     ", 0, 100);

			// test without object params
			ContactDB contactList = new ContactDB();
			contactList.setfirstName(firstName);
			contactList.setlastName(lastName);
			contactList.setEmail(email);
//			contactList.setPhoneNumber(phoneNumber);

			// test with object params
			ContactDB contactListConstructor = new ContactDB(firstName, lastName, email, 0);
			contactListConstructor.setfirstName(firstName);
			contactListConstructor.setlastName(lastName);
			contactListConstructor.setEmail(email);

			System.out.println(contactList.getfirstName());
			System.out.println(contactList.getlastName());
			System.out.println(contactList.getEmail());

			System.out.println(contactListConstructor.getfirstName());
			System.out.println(contactListConstructor.getlastName());
			System.out.println(contactListConstructor.getEmail());
//			System.out.println(contactList.getPhoneNumber());

		}

	}

}
