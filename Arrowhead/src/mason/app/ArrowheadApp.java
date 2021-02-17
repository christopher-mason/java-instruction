package mason.app;

import java.util.Scanner;

public class ArrowheadApp {

	public static void main(String[] args) {
		 System.out.println("Welcome to the Arrowhead App!!");
		 
		 // Prompt user how big they want the arrowhead, by number of lines. Prompt the user to provide the size of an arrowhead.  
		 // The app will print an arrowhead in the console, line by line, for the # of lines given by the user
		 
		 Scanner sc = new Scanner(System.in);
		 String choice = "y";
		 while (choice.equalsIgnoreCase("y")) {
			 System.out.println("Please enter the number of arrows (needs to be 3 or more): ");
			 int arrowNum = sc.nextInt();
			 if (arrowNum % 2 == 0) {
				 arrowNum++;
			 }
			 choice = sc.nextLine();
			 arrowCreate(arrowNum);
			 
			 System.out.println("Continue (y/n)");
			 choice = sc.nextLine();
			 System.out.println("Bye!");
		 }
		 

	}
	
	public static void arrowCreate(int arrowNum) {
		for (int i = 0; i <= arrowNum / 2; i++) {
			for (int a = 0; a <= i; a++) {
				System.out.println(">");
			}
			System.out.println();
		}
		for (int i = arrowNum / 2; i <= arrowNum; i++) {
			for (int a = i; a <= arrowNum; a++) {
				System.out.println(">");
			}
			System.out.println();
		}
		
	}

}
