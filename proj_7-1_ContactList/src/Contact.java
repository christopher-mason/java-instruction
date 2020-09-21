
public class Contact {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;

	public Contact() {
		firstName = "";
		lastName = "";
		email = "";
		phoneNumber = "";
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

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String displayContact() {
		String retVal = "---------------------------------\n" + 
						"----Current Contact--------------\n" + 
						"---------------------------------\n" +
						"Name:             " + this.firstName + " " + this.lastName + "\n" +
						"Email Address:    " + this.email + "\n" +
						"Phone Number:     " + this.phoneNumber + "\n" +
						"----------------------------------";
		return retVal;
	}
}
