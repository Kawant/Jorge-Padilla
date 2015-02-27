
public class Circle 
{
	double radius;
	double PI = 3.14159;
	
	public double getRadius()
	{
		return radius;
	}

	public double getArea()
	{
		return PI * radius * radius;
	}
	
	public double getDiameter()
	{
		return radius * 2;
	}
	
	public double getCircumference()
	{
		return 2 * PI * radius;
	}
}


