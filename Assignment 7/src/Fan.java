
public class Fan 
{
	int speed;
	boolean fanStatus;
	double radius;
	String color;
	
	public Fan()
	{
		speed = 3;
		fanStatus = false;
		radius = 5;
		color = "blue";
	}
	
	public Fan(int speed, boolean fanStatus, double radius, String color)
	{
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
	}
	
	public String toString() 
	{
		return "Fan [speed=" + speed + ", fanStatus=" + fanStatus + ", radius="
				+ radius + ", color=" + color + "]";
	}
}

