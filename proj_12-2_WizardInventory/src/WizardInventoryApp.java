import java.util.ArrayList;

public class WizardInventoryApp {

	public static void main(String[] args) {
		System.out.println("Wizard Inventory Game");
		
		ArrayList<String> inventory = new ArrayList<>();
		inventory.add("wooden staff");
		inventory.add("wizard hat");
		inventory.add("cloth shoes");
		
		String choice = "";
		
		while (!choice.equalsIgnoreCase("exit")) {
			displayMenu();
			choice = Console.getString("Command: ");
			if (choice.equals("show")) {
				System.out.println(inventory);
			} else if (choice.equals("grab")) {
				System.out.println("Name: " + Console.getString(""));
				
			}
		}

	}
	
	public static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit program");
	}

}
