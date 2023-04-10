package leraning;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st number: ");
			int num=sc.nextInt();
			
			findfactorial(num);
	}
	private static void findfactorial(int num) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<num;i++)
			fact=fact*i;
		System.out.println("Factorial of number: "+fact);
	}
}
