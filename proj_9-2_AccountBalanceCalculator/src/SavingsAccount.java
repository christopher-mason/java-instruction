
public class SavingsAccount extends Account {
	// Fields
	private double monthlyInterestRate;
	private double calculatedInterest;
	
	// constructors
	public SavingsAccount() {
		monthlyInterestRate = 0.0;		
		calculatedInterest = 0.0;
	}
	
	public SavingsAccount(double initialBalance, double monthlyInterestRate) {
		super(initialBalance);
		this.monthlyInterestRate = monthlyInterestRate;
		this.calculatedInterest = 0.0;
	}
	
	// Getters
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}
	
	public double getCalculatedInterest() {
		return calculatedInterest;
	}
	
	// helpers
	public void applyMonthlyInterest() {
		calculatedInterest = balance * monthlyInterestRate / 100.0;
		balance += calculatedInterest;
	}

}
