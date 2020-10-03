import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays


        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // Step 2
        String[] monthNames = {"January", "Fedbruary", "March", "April", "May", "June", 
        		"July", "August", "September", "October", "November", "December"};
             
        // Step 3
        double[] monthSales = {1000.00, 1500.01, 1300.02, 6700.03, 3200.04, 6200.05, 7400.06,
        		9800.07, 1200.08, 4300.09, 8000.10, 1900.11};
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthNames.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales 
            // Step 4
            int monthIndex = monthNumber - 1;
            String monthName = monthNames[monthIndex];
            double salesForMonth = monthSales[monthIndex];
            System.out.println("Sales for " + monthName + ": " + currency.format(salesForMonth));

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        double totalSales = 0.0; //Step 5
        
//        for (int i = 0; i < monthSales.length; i++) { // Step 5
//        	totalSales = totalSales + monthSales[i];
//        }
        
        // Step 6
        for (double sales : monthSales) {
        	totalSales += sales;
        }
        
        // display the total sales for the year
        System.out.println();
        System.out.println("Total Sales: " + currency.format(totalSales));
        
        Console.displayLine();
    }
    
}


