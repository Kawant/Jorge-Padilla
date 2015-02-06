//Jorge A. Padilla
//Rock, Paper, Scissors program
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors 
{
	public static void main(String[] args)
	{
		String PlayerMove;  //type R for rock, P for paper and S for scissors
		String CompMove = "";    //computer picks the same
		int RandNum;		//random number generator for comp play
		
		//String response;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("Let's play Rock, Paper, Scissors." +
							"Please enter a move.\n" + "Rock = R, " + 
							"Paper = P and Scissors = S.");
		System.out.println();
		
		//generates either 0, 1, or 2 for the comp and assigns it's moves
		RandNum = generator.nextInt(3)+1;
		if (RandNum == 1)
			CompMove = "R"; 
		else if (RandNum == 2) 
			CompMove = "P"; 
		else if (RandNum == 3) 
			CompMove = "S"; 
		
		//the players move
		System.out.print("Enter a move: ");
		PlayerMove = scan.next();
		
		//ensures player move is read regardless of letter case
		PlayerMove = PlayerMove.toUpperCase();
		
		System.out.println("Computer's move is: " + CompMove);
		
		if (PlayerMove.equals(CompMove)) 
			System.out.println("It's a tie!"); 
		else if (PlayerMove.equals("R")) 
		
		if (CompMove.equals("S")) 
			System.out.println("Rock crushes scissors. You win!!");
		else if (CompMove.equals("P")) 
			System.out.println("Paper eats rock. You lose!!"); 
		else if (PlayerMove.equals("P")) 
				
		if (CompMove.equals("S")) 
			System.out.println("Scissor cuts paper. You lose!!"); 
		else if (CompMove.equals("R")) 
			System.out.println("Paper eats rock. You win!!");
		else if (PlayerMove.equals("S")) 
		
		if (CompMove.equals("P")) 
			System.out.println("Scissor cuts paper. You win!!"); 
		else if (CompMove.equals("R")) 
			System.out.println("Rock breaks scissors. You lose!!"); 
		else 
			System.out.println("Invalid user input."); 
		}
	}

