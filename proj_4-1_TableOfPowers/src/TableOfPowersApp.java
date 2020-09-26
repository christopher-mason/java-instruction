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
			int squared = 0;
			int cubed = 0;
			System.out.println("Number\tSquared\tCubed" + "\n" + 
					   "======\t=======\t=======");
			for (int p = 1; p <= i; p++) {
				squared = (int) Math.pow(p, 2);
				cubed = (int) Math.pow(p, 3);
				System.out.println(p + "\t" + squared + "\t" +cubed);
			}
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			
		}
		System.out.println("Bye");
	}

}
