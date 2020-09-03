import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// Welcome message		
		System.out.println("Student Registration Form");
		Scanner sc = new Scanner(System.in);
		
		// Get user input
		System.out.print("Enter first name: "); // Get rid of ln in print line
		String firstName = sc.next();
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		System.out.print("Enter birth year: ");
		int year = sc.nextInt();
		
		// Biz logic
		String tempPWD = firstName + "*" +year;
		
		// display output
		System.out.println("Welcome "+firstName+" "+lastName+"!");
		System.out.println("Your registration is compleete.");
		System.out.println("Your temporary password is: "+tempPWD);
			
		
		// Bye
		System.out.println("Bye"); // don't really need this line per the assignment
	}

}
