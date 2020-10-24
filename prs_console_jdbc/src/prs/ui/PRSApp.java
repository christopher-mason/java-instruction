package prs.ui;

import java.util.List;
import prs.business.Product;
import prs.db.ProductDb;

public class PRSApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the PRS App");
		System.out.println();
		System.out.println("COMMANDS");
		System.out.println("prod_la - List all products");
		System.out.println("ap - Add Product");
		System.out.println("dp - Delete Product");
		System.out.println("up - Update Product");
		System.out.println("exit - Exit the application");
		System.out.println();
		
		ProductDb productDb = new ProductDb();
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Enter command: ");
			
			switch (command.toLowerCase()) {
			case "prod_la":
				listProducts();
				break;
			case "ap":
				addProduct(productDb);
				break;
			case "dp":
				int productId = Console.getInt("Enter Product ID to delete: ");
				
				if (productDb.delete(productId)) {
					System.out.println("Product deleted successfully");
				} else {
					System.out.println("Error deleting product");
				}
				break;
			case "up":
				updateProduct(productDb);
			case "exit":
				// nothing to do
				break;
				
				default:
					System.out.println("Invalild command");
					break;
			}
		}
		System.out.println("Bye!");
	}
	
	private static void listProducts() {
		ProductDb productDb = new ProductDb();
		List<Product> products = productDb.getAll();
		
		System.out.println("Products: ");
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println();
	}

	private static void addProduct(ProductDb productDb) {
		int vendorId = Console.getInt("Vendor ID: ");
		String partNumber = Console.getString("Part Number: ");
		String name = Console.getString("Name: ");
		double price = Console.getDouble("Price: ");
		String unit = Console.getString("Unit: ");
		String photoPath = Console.getString("Photo Path: ");
		
		Product product = new Product(0, vendorId, partNumber, name, price, unit, photoPath);
		
		if (productDb.add(product)) {
			System.out.println("Product added successfully");
		} else {
			System.out.println("Error adding product");
		}
	}
	
	private static void updateProduct(ProductDb productDb) {
		long id = Console.getInt("ID: ");
		int vendorId = Console.getInt("Vendor ID: ");
		String partNumber = Console.getString("Part Number: ");
		String name = Console.getString("Name: ");
		double price = Console.getDouble("Price: ");
		String unit = Console.getString("Unit: ");
		String photoPath = Console.getString("Photo Path: ");
		
		Product product = new Product(0, vendorId, partNumber, name, price, unit, photoPath);
		
		if (productDb.update(product)) {
			System.out.println("Product added successfully");
		} else {
			System.out.println("Error adding product");
		}
		
	}
	
}
