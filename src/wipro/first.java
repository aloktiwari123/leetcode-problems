package wipro;

import java.util.Scanner;

public class first {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String  s=String.valueOf(n);
		String str="";
		for(int i=0;i<s.length();i++)
		{
			if(i<s.length()&&i+1<s.length())
			{
				
				if(s.charAt(i)<s.charAt(i+1))
				{
					str=str+s.charAt(i+1);
					i++;
				}
				else
				{
					str=str+s.charAt(i);
					i++;
				}
			}
			else
			{
				str=str+s.charAt(i);
			}
		}
		System.out.println(Integer.valueOf(str));
	}

}
