import java.util.Scanner;

public class DoWhileApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		
		do {
			System.out.print("Say the magic word: ");
			word = sc.next();
		} while (!word.equalsIgnoreCase("please")); // note the exclamation point
			
		System.out.println("Thank you");

	}

}
