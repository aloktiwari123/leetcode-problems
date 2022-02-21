package all_possible_substring;

import java.util.*;

public class all_possible_substring {

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
	
	public static void main(String args[])
	{
		String s="abcd";
		substring(s);
		System.out.print(map.toString());
	}
}
