import java.util.Scanner;

public class TestFan 
{
	public static void main(String[] args)
	{
		Fan f1 = new Fan();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the fan's speed, radius, status and color.");
		f1.speed = input.nextInt();
		f1.radius = input.nextDouble();
		f1.fanStatus = input.nextBoolean();  //false is off, true is on.
		f1.color = input.next();
		
		System.out.println("The fan speed is " + f1.speed + ", it's radius is " + f1.radius + ", the status of it is "
				+ f1.fanStatus + " and the color is " + f1.color);
	}
}
