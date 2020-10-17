package mason.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import mason.business.Prospect;

public class FileCleanerApp {
	
	private static final String inputFilename = "prospects.csv";
	private static final String outputFilename = "prospect_clean.csv";
	
	public static void main(String[] args) {
		
		System.out.println("File Cleaner");
		System.out.println();
		
		// Read input file into list of String
		List<String> lines = new ArrayList<>();
		
		try (BufferedReader in = new BufferedReader(new FileReader(inputFilename))) {
			String line = in.readLine();
			while (line != null) {
				lines.add(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Input file " + inputFilename + " not found");
		} catch (IOException e) {
			System.err.println("Caught IOException. Msg: " + e.getMessage());
		} 
		
		// Cleanse and convert Strings to Prospects
		List<Prospect> prospects = new ArrayList<>();
		for (String line : lines) {
			Prospect prospect = createProspect(line);
			prospects.add(prospect);
		} 
		
		
		// Write the email recipients to the output file
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFilename)))) {
			for (Prospect p : prospects) {
				out.print(p.getFirstName());
				out.print(",");
				out.print(p.getLastName());
				out.print(",");
				out.println(p.getEmail());
			}
		} catch (IOException e) {
			System.err.println("Caught IOException. Msg: " + e.getMessage());
		}
		
		System.out.println("Source file: " + inputFilename);
		System.out.println("Cleaned file: " + outputFilename);
		System.out.println();
		System.out.println("Congratulations");
		
	}

	public static Prospect createProspect(String csvStr) {
		String[] nameParts = csvStr.split(",");
		
		String emailAddress = nameParts[2].toLowerCase();
		String firstName = convertToTitleCase(nameParts[0]);
		String lastName = convertToTitleCase(nameParts[1]);
		
		Prospect prospect = new Prospect(firstName, lastName, emailAddress);
		
		return prospect;
	}
	
	public static String convertToTitleCase(String inputStr) {
		String firstNameTrimmed = inputStr.trim();
		String nameFirstLetter = firstNameTrimmed.substring(0, 1);
		nameFirstLetter = nameFirstLetter.toUpperCase();
		
		String nameAfterFirstLetter = firstNameTrimmed.substring(1);
		nameAfterFirstLetter = nameAfterFirstLetter.toLowerCase();
		
		String titleCaseName = nameFirstLetter + nameAfterFirstLetter;
		
		return titleCaseName;
	}
}
