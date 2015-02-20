import java.util.Random;
import java.util.Scanner;

public class NumberGuess 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int numGuess = rand.nextInt(100+1);
		int numAtmpt = 0;
		int guess;
		Scanner input = new Scanner(System.in);
		boolean win = false;
		
		System.out.println("Guess a number between 1 and 100.");
		while (win == false)
		{
			guess = input.nextInt();
			numAtmpt++;
		
			if (guess == numGuess)
			{
				win = true; 
				System.out.println("You guessed it right.");
			}
			else if (guess < numGuess)
				System.out.println("Guess higher.");
			else if (guess > numGuess)
				System.out.println("Guess lower");
		}
	}
}
