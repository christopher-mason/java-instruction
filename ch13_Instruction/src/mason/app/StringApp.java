package mason.app;

public class StringApp {

	public static void main(String[] args) {
		
		//Length()
		String productCode = "java";
		System.out.println("Length of " + productCode + " is " + productCode.length());
		
		// Index
		String name = "Martin Van Buren";
		int firstSpace = name.indexOf(" ");
		System.out.println("Found fist space at index " + firstSpace);
		int secondSpace = name.indexOf(" ", firstSpace + 1);
		System.out.println("Found second space at index " + secondSpace);
		int thirdSpace = name.indexOf(" ", secondSpace + 1);
		System.out.println("Found third space at index " + thirdSpace);
		
		char fifthChar = name.charAt(4);
		System.out.println("The fifth character is: " + fifthChar);
	
	}

}
