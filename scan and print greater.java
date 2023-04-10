package leraning;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st number: ");
			int num=sc.nextInt();
			System.out.println("Enter 2nd number: ");
			int num1 = sc.nextInt();
			System.out.println("Enter 3rd number: ");
			int num2 = sc.nextInt();
			findgreatest(num,num1,num2);
	}
	private static void findgreatest(int num, int num1, int num2) {
		// TODO Auto-generated method stub
		if((num > num1)&& (num> num2))
			System.out.println("Num is greater: "+ num);
		else if(num1>num2)
			System.out.println("Num1 is greater: "+ num1);
		else
			System.out.println("Num2 is Greater: " + num2);
	}
}
	
