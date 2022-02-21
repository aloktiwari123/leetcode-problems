package domain_main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class domain_main {
	
	public static void main(String args[])
	{
		String s="alokt1667!@gmail.com";
		Pattern special=Pattern.compile("[!#$%&*()_+=|<>?{}\\\\[\\\\]~-]]");
		Pattern ath=Pattern.compile("[@]");
		Matcher hasspecial=special.matcher(s);
		Matcher hasath=ath.matcher(s);
		System.out.print(hasspecial.find());
		if(!hasspecial.find() && hasath.find())
		{
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='@')
				{
	                System.out.print(s.substring(i+1,s.length()));
					break;
				}
			}
		}
		else
		{
			
			System.out.print("Invalid Email");
		}
	}

}
