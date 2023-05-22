package riya;
class UserDefineException1 extends Exception {
	public UserDefineException1(String str)
	{
		super(str);
	}
}
public class user {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try
			{
				throw new UserDefineException1("This is User Defined Exception");
			}
			catch(UserDefineException1 ude)
			{
				System.out.println("Exception Caught!");
				System.out.println(ude.getMessage());
			}

	}

}
