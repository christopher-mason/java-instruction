package mason.ui;

import mason.business.Grade;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		Grade grade = new Grade();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			int numberGrade = Console.getInt("Enter numerical grade: ");
			
			grade.setNumber(numberGrade);
			
			String letterGrade = grade.getLetter();
			
			System.out.println("Letter Grade: " + letterGrade);
			System.out.println();
			
			choice = Console.getString("Continue? (y/n) ", "y", "n");
			
		}

		System.out.println("Bye");
	}

}
