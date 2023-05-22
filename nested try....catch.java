package exception;
import java.util.Scanner;
public class exception {

	public static void main(String[] args) {
		try {
			try {
				int	num=50/0;
			System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
				try {
					int	num1=59/0;
				System.out.println(num1);
			}
				catch(Exception e) {
				System.out.println("Try again");
				}
		}
		catch(Exception e) {
			System.out.println("Nested try catch");
			
		
	}
}
}
	
