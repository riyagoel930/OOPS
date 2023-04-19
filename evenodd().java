package riya;
import java.util.Scanner;
public class calculate {
	int z;
public void EvenOdd(int x) {
	if(x%2==0) {
		System.out.println("Number is Even!");
	}
	else
	{
		System.out.println("Number is odd!");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		calculate demo=new calculate();
		demo.EvenOdd(a);
		
	}

}
