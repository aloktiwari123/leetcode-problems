package PermutationInString;

import java.util.Arrays;

public class PermutationInString
{
	public static boolean checkInclusion(String s1, String s2) 
	{
		int[] s1count=new int[26];
		int[] s2count=new int[26];
		
		if(s1.length()>s2.length())
		{
			return false;
		}
		int left=0,right=0;
		while(right<s1.length())
		{
			s1count[s1.charAt(right)-'a']++;
			s2count[s2.charAt(right)-'a']++;
			right++;
		}
		right-=1;
		while(right<s2.length())
		{
			if(Arrays.equals(s1count, s2count))
			{
				return true;
			}
			right+=1;
			if(right!=s2.length())
			{
				s2count[s2.charAt(right)-'a']++;
			}
			s2count[s2.charAt(left)-'a']--;
			left++;
		}
		return false;
	}
	public static void main(String args[])
	{
		String s1 = "abab";
		String s2 = "eidbaooo";
		System.out.print(checkInclusion(s1, s2));
	}
	
}
