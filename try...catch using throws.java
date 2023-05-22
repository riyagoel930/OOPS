package exception;
import java.util.Scanner;
public class exception {
	static void fun() throws Exception
	{
		System.out.println("inside fun( )");
		throw new Exception("Demo");
	}
	public static void main(String[] args) {
		try {
			fun();
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
	
