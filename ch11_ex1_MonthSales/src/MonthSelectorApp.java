import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays


        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // Step 2
        String[] monthName = {"January", "Fedbruary", "March", "April", "May", "June", 
        		"July", "August", "September", "October", "November", "December"};
        
        // Step 3
        String[] monthSales = {"1000", "1500", "1300", "6700", "3200", "6200", "7400",
        		"9800", "1200", "4300", "8000", "1900"};
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales 
            // Step 4
            System.out.println("Sales for " + monthName[monthNumber] + ": " + currency.format(monthSales[monthNumber]));

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        double totalSales = 0; //Step 5
        for () {
        	
        }
        
        // display the total sales for the year
        System.out.println("Total Sales: " + currency.format(totalSales));
        
        Console.displayLine();
    }    

}
