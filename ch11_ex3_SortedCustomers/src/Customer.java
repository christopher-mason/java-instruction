
public class Customer implements Comparable {
	
	private String email;
    private String firstName;
    private String lastName;

    public Customer(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    
    @Override // Step 3
    public int compareTo(Object object) {
    	Customer c = (Customer)object;
    	
    	if (this.getEmail().compareToIgnoreCase(c.getEmail()) < 0) {
    		return -1;
    	} else if (this.getEmail().compareToIgnoreCase(c.getEmail()) > 0) {
    		return 1;
    	} else {
    		return 0;
    	}
    }
}
