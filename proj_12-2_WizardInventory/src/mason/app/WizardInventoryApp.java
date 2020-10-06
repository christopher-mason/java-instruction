package mason.app;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class WizardInventoryApp {
	private static final int MAX_INVENTORY_SIZE = 4;

	public static void main(String[] args) {
		
		System.out.println("Wizard Inventory Game\n");
		displayMenu();
		
		List<String> inventory = new ArrayList<>();
		inventory.add("wooden staff");
		inventory.add("wizard hat");
		inventory.add("cloth shoes");
		
		String command = "go";
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Command: ");
			
			switch (command) {
			case "show":
				showInventory(inventory);
				break;
			case "grab":
				addItemToInventory(inventory);
				break;
			case "edit":
				editInventory(inventory);
				break;
			case "drop":
				dropItemFromInventory(inventory);
				break;
			case "exit":
				System.out.println("Bye!");
				break;
			default:
				System.out.println("Invalid command");
				break;
			}
		}

	}
	
	private static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit program");
	}
	
	private static void showInventory(List<String> inventory) { // cant call it ArrayList cuz it hurts later if later we change to linked list
		int oneBasedIndex = 1;
		
		for (String item : inventory) {
			System.out.println(oneBasedIndex + "." + item);
			oneBasedIndex++;
		}
	}
	
	private static void addItemToInventory(List<String> inventory) {
		if (inventory.size() >= MAX_INVENTORY_SIZE) {
			System.out.println("You can't carry any more items. Drop something first");
			return;
		}
		
		String newItem = Console.getString("Name: ");
		inventory.add(newItem);
		System.out.println(newItem + " was added.");
	}
	
	private static void editInventory(List<String> inventory) {
		int oneBasedIndex = Console.getInt("Number: ");
		int zeroBasedIndex = oneBasedIndex -1;
		
		if (zeroBasedIndex < 0 || zeroBasedIndex >= inventory.size()) {
			System.out.println("Index Invalid");
			return;
		}
		
		String newItemName = Console.getString("Updated name: ");
		String previousItemName = inventory.set(zeroBasedIndex, newItemName);
		System.out.println("Replaced " + previousItemName + " with " + newItemName);
		
	}
	
	private static void dropItemFromInventory(List<String> inventory) {
		int oneBasedIndex = Console.getInt("Number: ");
		int zeroBasedIndex = oneBasedIndex -1;
		
		if (zeroBasedIndex < 0 || zeroBasedIndex >= inventory.size()) {
			System.out.println("Index Invalid");
			return;
		}
		
		String removedItem = inventory.remove(zeroBasedIndex);
		System.out.println(removedItem + " was removed.");
	}

}

//while (!choice.equalsIgnoreCase("exit")) {
//displayMenu();
//choice = Console.getString("Command: ");
//if (choice.equals("show")) {
//	System.out.println(inventory);
//} else if (choice.equalsIgnoreCase("grab")) {
//	if (inventory.size() > 4) {
//		System.out.println("You can't carry any more items. Drop something first.");
//	} else {
//		String addItem = Console.getString("Name: ");
//		inventory.add(addItem);
//		System.out.println(addItem + "was added.");
//	}
//} else if (choice.equalsIgnoreCase("edit")) {
//	
//}
//}
