package mason.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CountryIO {
	
	private static final String countriesFilename = "countries.txt";
	//private static final String outputFilename = "countries_clean.txt";

	public static ArrayList<String> getCountries() {
		
		ArrayList<String> countries = new ArrayList<>();
		
		try (BufferedReader in = new BufferedReader(new FileReader(countriesFilename))) {
			String line = in.readLine();
			while (line != null) {
				countries.add(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Input file " + countriesFilename + " not found");
		} catch (IOException e) {
			System.err.println("Caught IOException. Msg: " + e.getMessage());
		} 
		
		return countries;
	}
	
	public static boolean saveCountries(ArrayList<String> countries) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFilename)))) {
			for (String country : countries) {
				out.println(country);
			}
		} catch (IOException e) {
			System.err.println("Caught IOException. Msg: " + e.getMessage());
			return false;
		}
		return true;
	}
}

