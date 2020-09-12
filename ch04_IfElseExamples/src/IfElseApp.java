
public class IfElseApp {

	public static void main(String[] args) {
//		double subtotal = 317.0;
//		
//		double discountPercent = 0.05; // the moment the code sees a true statement, it doesn't run anything else
//		if (subtotal >= 100 && subtotal < 200.0) { // curly brace starts block of code
//			discountPercent = 0.1;
//		} // if it's just one block of code, don't really need curly braces but it is good practice to add them anyway
//		else if (subtotal >= 200.0) { // if we put this above the && statement, then the code would see true at >= 200 if subtotal is above 200 and not run rest of code
//			discountPercent = 0.2;
//		} // if none of the above statements are true, write an else statement to end it
//		
		double subtotal = 317.0;
		
		double discountPercent = 0.05; 
		if (subtotal >= 100 && subtotal < 200.0) { // curly brace starts block of code
			discountPercent = 0.1;
		} 
		else if (subtotal >= 200.0) { 
			discountPercent = 0.2;
		}
		
		System.out.println("discountPercent = " + discountPercent);
	}

}
