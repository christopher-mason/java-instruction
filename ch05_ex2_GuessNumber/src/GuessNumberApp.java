import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberApp {
    
    private static void displayWelcome(int limit) {
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + limit);
        System.out.println();
    }
    
    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;   // d is >= 0.0 and < limit
        int randomInt = (int) d;            // convert double to int
        randomInt++;                        // int is >= 1 and <= limit
        return randomInt;
    }
    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }
    /**
     * Prompts the user for an integer between minInclusive and maxInclusive
     * @param sc
     * @param prompt
     * @param minInclusive
     * @param maxInclusive
     * @return
     */
    public static int getIntWithinRange(Scanner sc, String prompt, int minInclusive, int maxInclusive) {
    	int retVal = 0;
    	boolean isValid = false;
    	//while (!isValid) {
    	do {
    		retVal = getInt(sc, prompt);
    		if (minInclusive <= retVal && retVal <= maxInclusive) {
    			isValid = true;
    		} else {
    			System.out.println("Value must be between " + minInclusive + "and " + maxInclusive + ".");
    		}
    	} while (!isValid);
    	return retVal;
    }

    public static void main(String[] args) {
        final int LIMIT = 10;
        
        displayWelcome(LIMIT);
        int number = getRandomInt(LIMIT);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);            
        int count = 1;
        int guess; // moved this declaration out of the try
        
        while (true) {
//        	System.out.print("Your guess: ");
//        	try {
//        		guess = sc.nextInt();
//        	}
//        	catch (InputMismatchException e) { // 'e' is convention for inout mismatch exception
//        		System.out.println("Invalid input");
//        		sc.nextLine();
//        		continue; // complier knows valid data is entered in guess 'line 33', so you dont have to initialize line 28 'int guess'
//        	}
            
        	guess = getIntWithinRange(sc, "Your guess: ", 1, LIMIT);
        	
            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }
       
			if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            } else {
                System.out.println("You guessed it in " + count + " tries.\n");
                break;
            }            
            count++;
        
        
    } System.out.println("Bye!");
}
}


