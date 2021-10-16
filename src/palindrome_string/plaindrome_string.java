package palindrome_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class plaindrome_string {
	public static void main(String args[])throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Input the string");
	  String s=br.readLine();
	  System.out.println(palain(s));
	  
	}

	private static boolean palain(String s) {
		// TODO Auto-generated method stub
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
		     if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)) )
		     {
		    	 s1=s.charAt(i)+s1;
		    	 s2=s2+s.charAt(i);
		     }
		}
		if(s1.equalsIgnoreCase(s2))
		{
			return true;
		}
		
		return false;
	}

}
