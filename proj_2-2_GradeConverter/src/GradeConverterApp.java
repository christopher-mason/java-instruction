import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Letter Grade Converter");
		Scanner sc = new Scanner(System.in);
		// while loop - loop while 'continue' == 'y'
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) { // If answer is 'y', everything in curly brace will happen
			// get numerical grade
			System.out.print("Enter numerical grade: "); // Remove ln from print statement
			int numericalGrade = sc.nextInt();
			String letterGrade = "";
			
			if (numericalGrade >= 88) {
				letterGrade = "A";
			}
			else if (numericalGrade >=80) {
				letterGrade = "B";
			}
			
			else if (numericalGrade >=67) {
				letterGrade = "C";
			}
			
			else if (numericalGrade >=60) {
				letterGrade = "D";
			}
			
			else { // If final 'else if' just use 'else' since we know the user will only enter int
				letterGrade = "F";
			}
			
			System.out.println("Letter grade: "+letterGrade);
			
			System.out.print("Continue? (y/n)");
			choice = sc.next(); // Just reference choice, don't declare as 'String choice' since the String is already declared
		
		}
		
		
		// Bye
		System.out.println("Bye"); // don't really need this line per the assignment
		

	}

}
