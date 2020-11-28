package mason.web;

import java.util.Scanner;

public class ChocolateApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("How many small bars of chocolate do you have? ");
			int small = sc.nextInt();
			System.out.println("How many big bars of chocolate do you have? ");
			int big = sc.nextInt();
			System.out.println("How many kilos of chocolate do you want to make? ");
			int goal = sc.nextInt();
			
			int result = makeChocolate(small, big, goal);
			System.out.println(result);
			choice = sc.nextLine();
			
			System.out.println("Contine? (y/n)");
			choice = sc.nextLine();
			System.out.println("Bye!");
			
		}
		
	}
	
	public static int makeChocolate(int small, int big, int goal) {
		int result = goal % 5;
		
		if (small + big * 5 < goal) {
			return -1;
		} else if (small + big * 5 == goal) {
			return small;
		} 
		 return result;
	}

}
