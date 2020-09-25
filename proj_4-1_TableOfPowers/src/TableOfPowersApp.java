import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes Table");
		
		Scanner sc = new Scanner(System.in);
		
		int i;

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter integer: ");
			i = sc.nextInt();
			double squared = 0;
			double cubed = 0;
			for (int p = 0; p <= i; p++) {
				squared = Math.pow(p, 2);
				cubed = Math.pow(p, 3);
			}
			System.out.println("Number     Squared     Cubed" + "\n" + 
							   "======     =======     =======");
			System.out.println(i + "          " + squared + "         " +cubed);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			
		}
		System.out.println("Bye");
	}

}
