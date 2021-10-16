package anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class anagram {
	public static void main(String args[])throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Input the string");
	  String s1=br.readLine();
	  String s2=br.readLine();
	  System.out.println(ana(s1,s2));
	  
	}

	public static boolean ana(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
			char[] arrays1=s1.toLowerCase().toCharArray();
			char[] arrays2=s2.toLowerCase().toCharArray();
			Arrays.sort(arrays1);
			Arrays.sort(arrays2);
			if(Arrays.equals(arrays1,arrays2))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

}
	