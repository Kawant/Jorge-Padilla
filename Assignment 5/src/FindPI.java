
public class FindPI 
{
	public static void main(String[] args)
	{
		int count = 2500000;
		double seconds = 0;
	    double pi = 0;
	    double denominator = 1;
	 
	    for (int x = 0; x < count; x++) 
	    {
	    	if (x % 2 == 0) 
	    		pi = pi + (1 / denominator);
	    	else 
	            pi = pi - (1 / denominator);
	    	
	    	denominator += 2;
	    }
	    pi *= 4;
	    
	    System.out.println("PI = " + pi + " after " + count + " iterations.");
	    System.out.println("It took " + seconds + " to complete this operation.");
	}
}
