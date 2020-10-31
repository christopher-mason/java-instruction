package prs.ui;
 
import java.util.List;
import prs.business.Product;
import prs.business.User;
import prs.business.Vendor;
import prs.db.ProductDb;
import prs.db.UserDb;
import prs.db.VendorDb;

public class PRSApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the PRS App");
		System.out.println();
		System.out.println("COMMANDS");
		System.out.println("login - Login");
		System.out.println("logout - Logout");
		System.out.println("prod_la - List all products");
		System.out.println("ven_la - List all vendors");
		System.out.println("ap - Add Product");
		System.out.println("dp - Delete Product");
		System.out.println("up - Update Product");
		System.out.println("aven - Add Vendor");
		System.out.println("dven - Delete Vendor");
		System.out.println("uven - Update Vendor");
		System.out.println("exit - Exit the application");
		System.out.println();
		
		User authenticatedUser = null;
		ProductDb productDb = new ProductDb();
		VendorDb vendorDb = new VendorDb();
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Enter command: ");
			
			if (command.equalsIgnoreCase("login")) {
				authenticatedUser = login();
				if (authenticatedUser == null) {
					System.out.println("Username/Password not found");
				} else {
					System.out.println("Welcome, " + authenticatedUser.getFirstName());
				}
			} else if (command.equalsIgnoreCase("logout")) {
				authenticatedUser = null;
			} else if (authenticatedUser != null) {
			
				switch (command.toLowerCase()) {
		// Product
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
		// User
//				case "user_la":
//					getAll();
//					break;
		// Vendor			
				case "ven_la":
					listVendors();
					break;
				case "aven":
					addVendor(vendorDb);
					break;
				case "dven":
					int vendorId = Console.getInt("Enter Vendor ID to delete: ");
					
					if (vendorDb.delete(vendorId)) {
						System.out.println("Vendor deleted successfully");
					} else {
						System.out.println("Error deleting vendor");
					}
					break;
				case "uven":
					updateVendor(vendorDb);
					break;
				case "exit":
					// nothing to do
					break;
					
					default:
						System.out.println("Invalild command");
						break;
			}
			} else {
				System.out.println("Must login to perform this action");
			}
		}
		System.out.println("Bye!");
	}
	
	private static User login() {
			String userName = Console.getString("User Name: ");
			String password = Console.getString("Password: ");
			
			UserDb userDb = new UserDb();
			User user = userDb.authenticateUser(userName, password);
			
			return user;
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
		int id = Console.getInt("ID: ");
		int vendorId = Console.getInt("Vendor ID: ");
		String partNumber = Console.getString("Part Number: ");
		String name = Console.getString("Name: ");
		double price = Console.getDouble("Price: ");
		String unit = Console.getString("Unit: ");
		String photoPath = Console.getString("Photo Path: ");
		
		Product product = new Product(id, vendorId, partNumber, name, price, unit, photoPath);
		
		if (productDb.update(product)) {
			System.out.println("Product added successfully");
		} else {
			System.out.println("Error adding product");
		}
		
	}
	
	private static void listVendors() {
		VendorDb vendorDb = new VendorDb();
		List<Vendor> vendors = vendorDb.getAll();
		
		System.out.println("Vendors: ");
		for (Vendor vendor : vendors) {
			System.out.println(vendor);
		}
		System.out.println();
	}
	
	private static void addVendor(VendorDb vendorDb) {
		String code = Console.getString("Code: ");
		String name = Console.getString("Name: ");
		String address = Console.getString("Address: ");
		String city = Console.getString("City: ");
		String state = Console.getString("State: ");
		String zipCode = Console.getString("Zip Code: ");
		String phoneNum = Console.getString("Phone Number: ");
		String emailAddress = Console.getString("Email Address: ");
		
		Vendor vendor = new Vendor(0, code, name, address, city, state, zipCode, phoneNum, emailAddress);
		
		if (vendorDb.add(vendor)) {
			System.out.println("Vendor added successfully");
		} else {
			System.out.println("Error adding vendor");
		}
	}
	
	private static void updateVendor(VendorDb vendorDb) {
		int id = Console.getInt("ID: ");
		String code = Console.getString("Code: ");
		String name = Console.getString("Name: ");
		String address = Console.getString("Address: ");
		String city = Console.getString("City: ");
		String state = Console.getString("State: ");
		String zipCode = Console.getString("Zip Code: ");
		String phoneNum = Console.getString("Phone Number: ");
		String emailAddress = Console.getString("Email Address: ");
		
		Vendor vendor = new Vendor(id, code, name, address, city, state, zipCode, phoneNum, emailAddress);
		
		if (vendorDb.update(vendor)) {
			System.out.println("Vendor updated successfully");
		} else {
			System.out.println("Error updating vendor");
		}
		
	}
	
}
