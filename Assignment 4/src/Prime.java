import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args)
	{		
		Scanner input = new Scanner(System.in);
		int i = 0;
		int num = 0;
		String  primeNum = "";
	      
		System.out.println("Enter a number. The system will find the prime numbers smaller than this number.");
		int n = input.nextInt();
		for (i = 1; i <= n; i++)  	   
		{ 		 		  
			int count = 0;
			for(num = i; num >= 1; num--)
			{
				if(i % num == 0)
					count++;
			}
			if (count == 2)
				primeNum = primeNum + i + " ";
		}	
		System.out.println("These are the prime numbers smaller than " + n + ": ");
		System.out.println(primeNum);
		//System.out.println("There are a total of " + count + "prime numbers.");
	}
}
