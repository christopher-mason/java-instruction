
public class ContactDB {
	
	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;

	public ContactDB() {
		firstName = "";
		lastName = "";
		email = "";
		phoneNumber = 0;
	}

	public ContactDB(String firstName, String lastName, String email, int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;

	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}
	
	
	

}
