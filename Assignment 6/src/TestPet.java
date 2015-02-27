import java.util.Scanner;
public class TestPet 
{
	public static void main(String[] args)
	{
		Pet p1 = new Pet();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type in your pets name, type and age.");
		p1.name = input.next();
		p1.type = input.next();
		p1.age = input.nextInt();
		
		
		System.out.println("My pet is named "+p1.name+" and he is a "+p1.type+" and he is "+p1.age+" years old.");
	}
}
