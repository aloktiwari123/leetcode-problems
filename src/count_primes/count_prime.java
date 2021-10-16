package count_primes;

public class count_prime {
	
	public static boolean is_prime(int n)
	{
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String args[])
	{
		int n=10;
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(is_prime(i)==true)
			{
				c++;
			}
		}
		System.out.print(c);
	}

}
