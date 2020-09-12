import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice;
		
		do { 
			System.out.print("Enter first operand: ");
			int operand1 = sc.nextInt();
			System.out.print("Enter second operand: ");
			int operand2 = sc.nextInt();
			System.out.println("Enter operation: (+, -, *, /) ");
			String operation = sc.next();
			
			int answer = 0;
			
			switch (operation) {
			case "+":
				answer = sum(operand1, operand2);
				break;
			case "-":
				answer = diff(operand1, operand2);
				break;
			case "*":
				answer = multiply(operand1, operand2);
				break;
			case "/":
				answer = divide(operand1, operand2);
				break;
			default:
				System.out.println("Unknown Operation");
			}
			
			System.out.println("The answer is " + answer);
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
	}

	private static int sum(int op1, int op2) {
		System.out.println("In sum method");
		
		int result = op1 + op2;
		
		return result;
	}
	
	private static int diff(int op1, int op2) {
		System.out.println("In diff method");
		
		int result = op1 - op2;
		
		return result;
	}
	
	private static int multiply(int op1, int op2) {
		System.out.println("In multiply method");
		
		int result = op1 * op2;
		
		return result;
	}
	
	private static int divide(int op1, int op2) {
		System.out.println("In divide method");
		
		int result = op1 / op2;
		
		return result;
	}
	
}
