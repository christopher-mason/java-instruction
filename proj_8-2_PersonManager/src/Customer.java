
public class Customer extends Person {
	
	//Fields
	private String customerNumber;
	
	//constructors
	public Customer(String firstName, String lastName, String customerNumber) {
		super(firstName, lastName);
		this.customerNumber = customerNumber;
		
	}
	
	// Getters and Setters
	public String getCustomerNumber() {
		return customerNumber;
	}
	
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	//Overrides
	@Override
	public String toString() {
		return super.toString() + "\nCustomer Number: " + customerNumber;
	}
	
}
