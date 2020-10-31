package mason.business;

public class Grade {
	
	//Fields
	private int number;
	
	//Constructors
	public Grade() {
		number = 0;
	}
	
	public Grade(int number) {
		this.number = number;
	}
	
	//Getters and Setters
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	/**
	 * returns this grade's number as a letter grade A thru F
	 * 
	 * @return See above
	 */
	
	public String getLetter() {
		String letterGrade = "F";
		
		if (number >= 88) {
			letterGrade = "A";
		} else if (number >= 80) {
			letterGrade = "B";
		} else if (number >= 67) {
			letterGrade = "C";
		} else if (number >= 60) {
			letterGrade = "D";
		}
		
		return letterGrade;
	}
	
}
