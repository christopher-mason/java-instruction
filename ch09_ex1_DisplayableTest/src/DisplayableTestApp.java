public class DisplayableTestApp {

    public static void main(String args[]) {
        System.out.println("Welcome to the Displayable Test application\n");

        // Employee e = new Employee(2, "Smith", "John"); Step 7
        Displayable e = new Employee(2, "Smith", "John"); // Step 7
        // TODO: add code that passes this object to the display method below
        display(e); // step 7

        //Product p = new Product("java", "Murach's Java Programming", 57.50); Step 10
        Displayable p = new Product("java", "Murach's Java Programming", 57.50); // Step 10
        // TODO: add code that passes this object to the display method below
        display(p); // step 10
        
        System.out.println();        
    }

    private static void display(Displayable d) {
        System.out.println(d.getDisplayText());
    }
}