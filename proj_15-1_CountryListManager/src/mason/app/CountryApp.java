package mason.app;

import java.util.ArrayList;
import java.util.List;

import mason.business.CountryIO;

public class CountryApp {
	
	private static final int COMMAND_LIST = 1;
	private static final int COMMAND_ADD = 2;
	private static final int COMMAND_EXIT = 3;
	
	private static void printWelcomeMessage() {
		System.out.println("Country List Manager");
		System.out.println();
		System.out.println("Command Menu");
		System.out.println(COMMAND_LIST + " - List countries");
		System.out.println(COMMAND_ADD + " - Add a country");
		System.out.println(COMMAND_EXIT + " - Exit");
	}
	
	public static void main(String[] args) {
		printWelcomeMessage();
		
		CountryIO countryIO = new CountryIO();
		
		//ArrayList<String> countries = new ArrayList<>();
		
		int command = 0;
		while (command != COMMAND_EXIT) {
			command = Console.getInt("Enter menu number: ");
			System.out.println();
			
			if (command == 1) {
				ArrayList<String> countries = CountryIO.getCountries();
				for (String country : countries) {
					System.out.println(country);
				}
			} else if (command == 2) {
				String newCountry = Console.getString("Enter country: ");
				ArrayList<String> countries = CountryIO.getCountries();
				countries.add(newCountry);
				if (CountryIO.saveCountries(countries)) {
					System.out.println(newCountry + " was saved.");
				} else {
					System.out.println("Error saving country.");
				}
			} else {
				System.out.println("Bye");
			}
			
//			switch (command) {
//			case COMMAND_LIST:
//				listCountries(countries);
//				break;
//			case COMMAND_ADD:
//				addCountries(countries);
//				break;
//			case COMMAND_EXIT:
//				System.out.println("Goodbye.");
//				break;
//			default:
//				System.out.println("Inavlid menu number");
//				break;
//			}
				
		}

		
	}
}

//	public static String createCountry(String csvStr) {
//		String[] nameParts = csvStr.split(",");
//		
//		String firstName = convertToTitleCase(nameParts[0]);
//		
//		//String prospect = new Prospect(firstName, lastName, emailAddress);
//		
//		return ;
//	}
//	
//	private static void listCountries(List<String> listCountries) {
//		int oneBasedIndex = 1;
//		
//		for (String country : listCountries) {
//			System.out.println(oneBasedIndex + "." + country);
//			oneBasedIndex++;
//		}
//	}
//	
//	public static void addCountries(List<String> addCountries) {
//		List<String> countries = null;		
//		String newCountry = Console.getString("Name: ");
//		countries.add(newCountry);
//		System.out.println(newCountry + " was added.");
//	}
//	
//}
