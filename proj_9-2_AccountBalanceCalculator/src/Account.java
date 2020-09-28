
public class Account implements Depositable, Withdrawable, Balanceable {
	
	Account(double initBalance);
	double getBalance();
	void setBalance(double amount);
	void deposit(double amount);
	void withdraw(double amount);

}
