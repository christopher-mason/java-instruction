
public class SwitchExampleApp {

	public static void main(String[] args) {
		String productCode = "hm01";
		String productDescription;
		
		if (productCode.equals("hm01")) {
			productDescription = "Hammer";
		}
		else if (productCode.equals("bn01")) {
			productDescription = "Box of Nails";
		}
		else {
			productDescription = "Product not Found";
		}
	
		System.out.println("productDescription via if/else: " + productDescription);
		
		// now let's add switch, which will be the same result as above
		
/*		switch (productCode) {
		case "hm01": // note the colon, acts as open curly brace as in if statements
			productDescription = "Hammer";
			break; // acts as closed curly brace as in if statements
		case "bn01":
			productDescription = "Box of Nails";
			break;
		default: // acts as 'else' statement from above if statement
			productDescription = "Product not Found";
			break;
		}	
		
		System.out.println("productDescription via switch: " + productDescription);
*/
		switch (productCode) {
		case "hm01":
		case "hm02": // can continue to add case statements until it hits a break
			productDescription = "Hammer";
			break; 
		case "bn01":
			productDescription = "Box of Nails";
			break;
		default: 
			productDescription = "Product not Found";
			break;
		}
	
	}

}
