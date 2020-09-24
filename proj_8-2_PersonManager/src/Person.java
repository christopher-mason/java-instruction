
public class Person { // if no 'extends' it's an object

	//Fields
	private String firstName;
	private String lastName;
	
	// construcors
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Overrides
	@Override
	public String toString() {
		return "Name: " + firstName + "" + lastName;
	}
	

	
	
}
