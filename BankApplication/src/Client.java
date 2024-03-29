
public class Client {

	public static void main(String[] args) {


		ICICIBank bank = new ICICIBank();
		
		System.out.println(bank.createAccount(101, 3000));
		System.out.println(bank.createAccount(102, 3000));
		
		try
		{
			System.out.println("initial 101 balance = "+bank.showBalance(101));
			System.out.println("initial 102 balance = "+bank.showBalance(102));
			System.out.println();
			System.out.println("Balance = "+bank.withdrawAmount(101, 2000));
			System.out.println();
			System.out.println("after withdrawal 101 balance = "+bank.showBalance(101));
			System.out.println("after withdrawal 102 balance = "+bank.showBalance(102));
			System.out.println();
			System.out.println(bank.fundTransfer(101,102,2000));
			System.out.println();
			System.out.println("101 balance = "+bank.showBalance(101));
			System.out.println(" 102 balance = "+bank.showBalance(102));
			
			
		}catch(InvalidAccountNumberException i)
		{
			System.out.println("Invalid account number ");
		}
		catch(InsufficientBalanceException ibe){
			System.out.println("insufficient balance");
		}

	}


	}
