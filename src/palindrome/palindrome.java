package palindrome;

public class palindrome {

	public static boolean palin(int no)
	{
		int n=no;
		int number=0;
		while(n>0)
		{
		   number=number*10+n%10;
		   n=n/10;
		}
		if(no==number)
		{
			return true;
		}
		return false;
		
	}
	public  static void main(String args[]) {
		int n=123;
		System.out.print(palin(n));
	}
}
