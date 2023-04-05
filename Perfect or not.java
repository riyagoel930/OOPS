package program3;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n=10;
		int sum = 0;
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
		System.out.print("Perfect Number");
		else
			System.out.print("Not Perfect");
			
		
	}

}
