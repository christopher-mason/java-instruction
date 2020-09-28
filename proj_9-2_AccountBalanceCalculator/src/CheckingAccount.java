
public class CheckingAccount extends Account {
	
	private double monthlyFee;
	
	public CheckingAccount() {
		monthlyFee = 0.0;
	}
	
	public CheckingAccount(double initialBalance, double monthlyFee) {
		super(initialBalance);
		this.monthlyFee = monthlyFee;
	}
	
	public double getMonthlyFee() {
		return monthlyFee;
	}
	
	public void applyMonothlyFee() {
		balance -= monthlyFee;
	
	}
	

}
