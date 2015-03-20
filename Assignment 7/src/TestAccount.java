
public class TestAccount 
{
	public static void main(String[] args)
	{
		Account a1 = new Account();
		Account a2 = new Account(1122, 20000, 4.5);
		
		System.out.println(a1.getId() + " " + a1.getBalance() + " " + a1.getAnnualInterestRate());
		System.out.println(a2.getId() + " " + a2.getBalance() + " " + a2.getAnnualInterestRate());
		
		a2.withdraw(2500);
		a2.deposite(3000);
		
		System.out.println(a2.getBalance() + " " + a2.getMonthlyIntersetRate() + " " + a2.dateCreated());
		
	}
}