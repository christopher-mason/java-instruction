import java.text.NumberFormat;

public class LineItem implements Cloneable{
    private Product product;
    private int quantity;
    private double total;

    public LineItem() {
        this.product = new Product();
        this.quantity = 0;
        this.total = 0;
    }

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        this.calculateTotal();
        return total;
    }

    private void calculateTotal() {
        total = quantity * product.getPrice();
    }

    public String getFormattedTotal() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }

    @Override
    public String toString() {
        return
            "Code: " + product.getCode() + "\n" +
            "Description: " + product.getDescription() + "\n" +
            "Price: " + product.getFormattedPrice() + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total: " + this.getFormattedTotal() + "\n";
    }   
    
    @Override
    public Object clone() throws CloneNotSupportedException {
    	LineItem li = (LineItem) super.clone(); // creates clone of line item 1 'li1'
    	Product clonedProduct = (Product) li.getProduct().clone(); // creates clone for product 'p1'
    	li.setProduct(clonedProduct); // links cloned product and cloned line item 
    	return li; // returns new line item
    }
}
