class UserDefinedException extends Exception
 {
	 public UserDefinedException(String s)
	 {
		//s="Goyal";
		 System.out.println(s);
	 }
 }
 public class File
 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		throw new UserDefinedException("This is a user Defined exception");
	}
	
	catch(UserDefinedException u)
	{
		System.out.println("caught the exception");
		System.out.println(u.getMessage());
	}
	catch(Exception e)
	{
		System.out.println("Riya");
		System.out.println(e.getMessage());
	}
}
}
