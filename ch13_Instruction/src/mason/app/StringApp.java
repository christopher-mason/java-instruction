package mason.app;

public class StringApp {

	public static void main(String[] args) {
		
		//Length()
		String productCode = "java";
		System.out.println("Length of " + productCode + " is " + productCode.length());
		System.out.println();
		// Index
		String name = "Martin Van Buren";
		int firstSpace = name.indexOf(" ");
		System.out.println("Found fist space at index " + firstSpace);
		int secondSpace = name.indexOf(" ", firstSpace + 1);
		System.out.println("Found second space at index " + secondSpace);
		int thirdSpace = name.indexOf(" ", secondSpace + 1);
		System.out.println("Found third space at index " + thirdSpace);
		System.out.println();
		
		char fifthChar = name.charAt(4);
		System.out.println("The fifth character is: " + fifthChar);
		System.out.println();
		
		String strWithSpaces = "   a  b c ";
		String trimmed = strWithSpaces.trim();
		System.out.println("Trimmed= [" + trimmed + "]");
		System.out.println();
		
		String fullName = "Mike Murach";
		int spaceIndex = fullName.indexOf(" ");
		String firstName = fullName.substring(0, spaceIndex);
		String lastName = fullName.substring(spaceIndex + 1);
		System.out.println("firstName = [" + firstName + "]\nlastName = [" + lastName + "]");
		System.out.println();
		
		String phoneNumber = "513-254-7694";
		String dotPhoneNumber = phoneNumber.replace("-", ".");
		System.out.println("dotPhoneNumber = " + dotPhoneNumber);
		System.out.println();
		
		String firstNames = "Dave Chris Christina";
		String[] firstNamesArray = firstNames.split(" "); // the thing you split on goes away. in this case the space went away.
		System.out.println("firstNamesArray length = " + firstNamesArray.length);
		for (String f : firstNamesArray) {
			System.out.println("[" + f + "]");
		}
	
		
	}

}
