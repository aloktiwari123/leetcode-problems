package count_even;

public class count_even {
	
	public static void main(String args[])
	{
		String s="ABCD235684";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				int n=s.charAt(i)-'0';
				if(n%2==0)
				{
					c++;
				}
			}
		}
		System.out.print(c);
	}

}
