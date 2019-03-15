
public class Account {
	private static int Balance = 0;
	private int accountNumber;
	private int amount;
	public Account(int accountNumber, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBalance() {
		// TODO Auto-generated method stub
		return Balance;
	}
	public void setBalance(int Balance) {
		this.Balance=Balance;
	}
	
	public String toString() {
		return "Account[accountNumber=" + accountNumber + ",Balance=" + Balance +"]";
	}
	
}
