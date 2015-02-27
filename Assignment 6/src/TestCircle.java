import java.util.Scanner;
public class TestCircle 
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type in a value for the Radius.");
		c1.radius = input.nextDouble();
		
		System.out.println("The radius entered is "+c1.getRadius());
		System.out.println("The Area is "+c1.getArea());
		System.out.println("The Diameter is "+c1.getDiameter());
		System.out.println("The Circumference is "+c1.getCircumference());
	}
}
