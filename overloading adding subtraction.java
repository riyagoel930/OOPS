package riya;
import java.util.Scanner;
public class calculate {
	
   static void add(int x,int y) {
	   int z;
	z=x+y;
	System.out.println("ADD: "+z);
}
   static void add(double x,double y) {
	  double z;
	z= x+y;
	System.out.println("ADD1: "+z);
}
    static void add(float x,float y) {
    	float z;
	z= x-y;
	System.out.println("SUB: "+z);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate c = new calculate();
		add(1,4);
		add(10.22,11.22);
		add(10f,4f);
		
	}
