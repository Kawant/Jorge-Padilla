//Jorge A. Padilla
//Compare numbers assignment
import java.util.Scanner;
public class CompareNumbers 
{
	public static void main(String[] args)
	{
		int num1;
		int num2;
		int num3;
		int small = 0;
		int large = 0;
		int sum;
		int product;
		int average;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		System.out.print("Enter third number: ");
		num3 = input.nextInt();
		
		System.out.printf("The numbers entered are %d, %d and %d.\n", num1, num2, num3);

		large = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		System.out.println("Largest is " + large);
	
		small = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
		System.out.println("Smallest is " + small);
		
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		average = (num1 + num2 + num3)/3;
		
		System.out.println("Sum is " + sum);
		System.out.println("Product is " + product);
		System.out.println("Average is " + average);
	}
}
