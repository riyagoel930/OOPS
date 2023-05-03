//demonstrate the shallow copy using clone()
import java.util.ArrayList;
//oject reference of this classs cotain by Test2
class Test 
{
	int x,y;
}
//Contains the reference of Test and implements clones with shallow copy
class Test2 implements Cloneable{
	int a;
	int b;
	Test c= new Test();
public  Object clone() throws CloneNotSupportedException{
  //additional condition for deepcloning
	Test2 t=(Test2) super.clone();
	t.c=new Test();
	t.c.x=c.x;
	t.c.y=c.y;
	return t;
	}
}
//drive main
public class Main{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Test2 t1 = new Test2();
		t1.a=10;
		t1.b=20;
		t1.c.x=30;
		t1.c.y = 40;
		Test2 t2 = (Test2)t1.clone();
    //create a copy of object t1 and pass it to t2
		t2.a=100;
    //change primitive type of t2 will not references in t1 field
		t2.c.x=300;
    //change the object type field will be referenced in both t1 and t2(shallow copy)
		System.out.println(t1.a+" "+t1.b+" "+t1.c.x+" "+t1.c.y);
		System.out.println(t2.a+" "+t2.b+" "+t2.c.x+" "+t2.c.y);
	}
}
