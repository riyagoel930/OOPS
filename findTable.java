package Oops;
import java.util.Scanner;
public class operator {
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		 int num = sc.nextInt();
		findtable(num);
	}
	private static void findtable(int num) {
		// TODO Auto-generated method stub
		for(int i=1;i<11;i++)
		{
			int prod= num * i;
			System.out.println("Table:  " + num+ "*"+i+"="+prod);
		}
	}
	}
