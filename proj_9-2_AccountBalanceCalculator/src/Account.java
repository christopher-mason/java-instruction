
public class Account implements Depositable, Withdrawable, Balanceable {
	protected double balance;
	
	public Account() {
		balance = 0.0;
	}
	
	public Account(double initialBalance) {
		balance = initialBalance;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
	
	@Override
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
	}
	
	@Override
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	

}
