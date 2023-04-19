package riya;
import java.util.Scanner;
public class calculate {
	int z;
public void addition(int x,int y) {
	z=x+y;
	System.out.println("Sum of x and y: "+z);
}
public void subtraction(int x,int y) {
	z=x-y;
	System.out.println("Difference of x and y: "+z);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Second Number: ");
		Scanner sc1=new Scanner(System.in);
		int b=sc1.nextInt();
		calculate demo=new calculate();
		demo.addition(a,b);
		demo.subtraction(a,b);
	}

}
