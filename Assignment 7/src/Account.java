import java.util.Date;
public class Account 
{
	int id;
	double balance;
	double annualInterestRate;
	Date timeStamp;
	
	public Account()
	{
		id = 0001;
		balance = 15000;
		annualInterestRate = 1.5;
		timeStamp = new Date();
	}

	public Account(int id, double balance, double annualInterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		timeStamp = new Date();
	}
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) 
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date dateCreated()
	{
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) 
	{
		this.timeStamp = timeStamp;
	}
	
	public double getMonthlyIntersetRate()
	{
		return annualInterestRate / 12;
	}
	
	public void withdraw(double withdraw)
	{
		balance -= withdraw;
	}
	
	public void deposite(double deposite)
	{
		balance += deposite;
	}
	
}
