package Employee;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String args[])
	{
	int x=3;
	int y=4;
	int z;
	try 
	{
			z=x+y;
			System.out.println("Sum of x and y: "+z);
	}
	finally
	{
		System.out.println("hellolll");
	}
	try 
	{
		z=(x+y/0);               //java.lang.ArithmeticException is thrown
			System.out.println("Subtract of x and y: "+z);
	}
	finally
	{
		System.out.println("hello");
	}
	try
	{
		if (x>y)
		System.out.println("x greater"+ x);
			else
				System.out.println("y greater"+ y);
	}
	catch(Exception e)
	{
		System.out.println("ABC");
	}
}
}
