import java.util.LinkedList;

public class ICICIBank {
	
	
	LinkedList<Account> accounts=new LinkedList<>();
	
	
	public String createAccount(int accountNumber,int amount)
	{
		Account account = new Account(accountNumber,amount);
		
		accounts.add(account);
		
		return "account created successfully";
	}
	private Account searchAccount(int accountNumber)throws InvalidAccountNumberException
	{
		
		for(Account account : accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				return account;
			}
		}
		throw new InvalidAccountNumberException();
		
	}
	
	public int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account=searchAccount(accountNumber);
		
		if((account.getAmount()-amount)>=0)
		{
			account.setAmount(account.getAmount()-amount);
			return account.getAmount();
		}
		
		throw new InsufficientBalanceException();
	}
	
	public int depositAmount(int accountNumber,int amount) throws InvalidAccountNumberException
	{
		Account account=searchAccount(accountNumber);
		
		account.setBalance(account.getBalance()+amount);
		return account.getBalance();
	}
	public String fundTransfer (int accountNumber1,int accountNumber2,int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account=searchAccount(accountNumber2);
		
		depositAmount(accountNumber1,amount);
		withdrawAmount(accountNumber2,amount);
		return "fund transffered";
	}
	
	public int showBalance(int accountNumber)throws InvalidAccountNumberException{
		Account account=searchAccount(accountNumber);
		return account.getBalance();
	}
	
	
		
	

}



