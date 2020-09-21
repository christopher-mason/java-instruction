public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
       
    	//Product product = new Product(); Step 6
    	Product product; // Step 6

        // fill the Product object with data
        
    	//product.setCode(productCode); Step 6
        
    	
        if (productCode.equalsIgnoreCase("java")) {
            //product.setDescription("Murach's Java Programming"); Step 6
            product = new Product(productCode, "Murach's Java Programming", 57.50); // Step 6
        	//product.setPrice(57.50); Step 6
        } else if (productCode.equalsIgnoreCase("jsp")) {
            product = new Product(productCode, "Murach's Java Servlets and JSP", 57.50); // Step 6
//        	product.setDescription("Murach's Java Servlets and JSP"); Step 6
//            product.setPrice(57.50); Step 6
        } else if (productCode.equalsIgnoreCase("mysql")) {
            product = new Product(productCode, "Murach's MySQL", 54.50); // Step 6
//        	product.setDescription("Murach's MySQL"); Step 6
//          product.setPrice(54.50); Step 6
        } else if (productCode.equalsIgnoreCase("python")) {
        	product = new Product(productCode, "Chris's Python Programming", 43.26); // Step 6
//        	product.setDescription("Chris's Python"); Step 6
//        	product.setPrice(43.26); Step 6
        } else {
            product = new Product(productCode, "Unknown", 0.00); // Step 6
            // product.setDescription("Unknown"); Step 6
        }
        return product;
    }
}