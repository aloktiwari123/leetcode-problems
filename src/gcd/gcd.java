package gcd;

public class gcd {

	public static int gcd(int n1,int n2)
	{
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		return gcd;
		
	}
	
	public static int lcm(int n1,int n2)
	{
		return ((n1*n2)/(gcd(n1, n2)));
	}
	
	public static void main(String args[])
	{
		System.out.print(gcd(10,20));
		System.out.print(lcm(10,20));
	}
}
