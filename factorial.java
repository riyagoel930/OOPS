package Oops;
import java.util.Scanner;
public class operator {
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		int fact;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers: ");
		int num=sc.nextInt();
		int factorial = fact(num);
		System.out.print("Factorial entered number is : "+ factorial);
	}
	static int fact(int n)
	{
		int res;
		if(n==1) {
		return 1;
		}
		res= fact(n-1)*n;
		return res;
		}
		}
