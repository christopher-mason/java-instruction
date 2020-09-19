import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		double length;
		double width;
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length: ");
			length = sc.nextDouble();
			System.out.print("Enter width: ");
			width = sc.nextDouble();
			double area = width * length;
			double perimeter = (2 * width) + (2 * length);
			System.out.println("Area = " + area);
			System.out.println("Perimeter = " + perimeter);
			System.out.print("Continue? (y/n)");
			choice =sc.next();
			
		}
		System.out.println("Bye!");
	}

}
