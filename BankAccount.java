package Week2;

public class BankAccount
{
	double balance;

	public BankAccount(double balance) 
	{
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance += amount;
			System.out.println("Deposited : "+amount);
		}else
		{
			System.out.println("Deposite amount must be positive");
		}
	}
	public void withdraw (double amount)
	{
		if(amount>0)
		{
		if(amount<=balance)
		{
		balance -= amount;
		System.out.println("Withdraw : "+amount);
		}else
		{
			System.out.println("Insufficient Balance.");
		}
		}else
		{
			System.out.println("Withdraw amount must be positive");
		}
	}
	public void displayBalance() 
	{
		System.out.println("Current Balance : "+ balance);
	}
	
	static public void main(String [] args)
	{
		BankAccount account=new BankAccount(500);
		
		account.displayBalance();
		
		account.deposit(100);
		account.displayBalance();
		
		account.withdraw(100);
		account.displayBalance();
		
		account.withdraw(700);
		account.displayBalance();
	}
}
