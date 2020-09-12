
public class ForLoopApp {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 8; i > 0; i -=2) {
			System.out.println("In loop with i = " + i + " and sum = " + sum);
			sum +=i;
		}
		System.out.println("sum = " + sum);
		
		int factorial = 1;
		
		for (int i = 1; i <= 5; ++i) {
			factorial = factorial * i;
		}
		
		System.out.println("factorial of 5 is " + factorial);
	}

}
