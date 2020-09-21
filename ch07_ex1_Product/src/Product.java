import java.text.NumberFormat;

public class Product {

	// fields, aka member variables, aka instance variables
    private String code;
    private String description;
    private double price;
    
    // static variables
    private static int instanceCount = 0;

    // constructors
    public Product() {
        code = "";
        description = "";
        price = 0;
        
        instanceCount++;
    }
    
    public Product(String codeParam, String descParam, double priceParam) {
    	this.code = codeParam;
    	this.description = descParam;
    	this.price = priceParam;
    	
    	instanceCount++;
    }

    // setters and getters
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // helper methods
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    // Step 8
    public String getPriceNumberFormat() {
    	NumberFormat number = NumberFormat.getNumberInstance();
    	number.setMaximumFractionDigits(2);
    	number.setMinimumFractionDigits(2);
    	return number.format(price);
    }
    
    // static methods
    public static int getInstanceCount() {
    	return instanceCount;
    }
}