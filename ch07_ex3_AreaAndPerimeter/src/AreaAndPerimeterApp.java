import java.util.Scanner;
import java.text.NumberFormat;

public class AreaAndPerimeterApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter length: ");
            double length = Double.parseDouble(sc.nextLine());

            System.out.print("Enter width:  ");
            double width = Double.parseDouble(sc.nextLine());

            Rectangle rectangle = new Rectangle(length, width); // Step 13
//            rectangle.setLength(length); Step 13
//            rectangle.setWidth(width); Step 13
            
            // calculate total
            //double area = width * length; Step 10
            //double perimeter = 2 * width + 2 * length; Step 10
            
            // format and display output
            //NumberFormat number = NumberFormat.getNumberInstance(); Step 10
            //number.setMinimumFractionDigits(3); Step 10
            String message = 
                    "Area:         " + rectangle.getAreaFormatted() + "\n" +
                    "Perimeter:    " + rectangle.getPerimeterFormatted() + "\n";
                System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
    }  
}
