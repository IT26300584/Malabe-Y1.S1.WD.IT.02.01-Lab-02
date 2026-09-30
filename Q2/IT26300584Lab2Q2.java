//Question 02

public class IT26300584Lab2Q2
{
	public static void main(String[]args)
	{
		double perimeterSquare, circumference, radius,length;
		
		double PI = 3.14;
		length = 10;
		
		perimeterSquare = 4*length;
		
		circumference = perimeterSquare;
		
		radius = circumference/(2*PI);
		//radius = perimeterSquare/(2*PI);
		
		System.out.println("The Radius of the cicular fence: " + radius);
	}
}
		
		
		