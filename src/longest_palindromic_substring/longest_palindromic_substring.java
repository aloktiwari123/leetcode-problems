package longest_palindromic_substring;

import java.util.HashSet;

public class longest_palindromic_substring {

	public static HashSet<String> map=new HashSet<String>();
	
	public static void substring(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				map.add(s.substring(i,j));
			}
		}
	}
	
	public static boolean check_palin(String s)
	{
		String str="";
		for(int i=0;i<s.length();i++)
		{
			str=s.charAt(i)+str;
		}
		if(str.equalsIgnoreCase(s))
		{
			return true;
		}
		return false;
		
	}
	
	public static void main(String args[])
	{
		String s="cbbd";
		substring(s);
		int max=0;
		String out="";
		for(String i:map)
		{
			if(i.length()>max && check_palin(i))
			{
				out=i;
				max=i.length();
			}
		}
		System.out.print(out);
		
	}
}
