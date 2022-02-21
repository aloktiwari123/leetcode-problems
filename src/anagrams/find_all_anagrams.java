package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_all_anagrams {

	 public static List<Integer> findAnagrams(String s, String p)
	 {
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(i+p.length()<=s.length())
			{
				if(isAnagrams(s.substring(i,i+p.length()),p))
				{
					li.add(i);
				}
			}
			
		}
		return li;
	        
	 }
	 public List<Integer> find_Anagrams(String s, String p) {
	        int n = s.length(), m = p.length(), l = 0, r = 0; // creating left and right pointers.
	        int count[] = new int[26], curCount[] = new int[26]; //count array will store the freq count of chars in string p and curCount will store the frequency of lowercase chars between left and right pointers in string s.
	        List<Integer> res = new ArrayList<Integer>(); //declaring result list.
	        for(char i:p.toCharArray()) count[i-'a']++; //storing the frequencies of chars of string p in count array.
	        while(r < n){
	            curCount[s.charAt(r)-'a']++; //storing the count of current char at index right in curCount array.
	            if((r-l) >= m) curCount[s.charAt(l++)-'a']--; //if chars between left and right are more than size of p than first reduce the count of char where left is pointing in string s and after that move left towards right to reduce the window size.
	            if(Arrays.equals(count, curCount)) res.add(l); //if frequency of chars of string s between left and right are equal to frequeny of all chars in string p than store left in the result list.
	            r++; //incrementing right for the next iteration.
	        }
	        return res; //returning the result.
	    }
	 
	 public static boolean isAnagrams(String s1,String s2)
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
	 
	 public static void main(String args[])
	 {
	  String s="abab";
	  String p="ab";
	  System.out.println(findAnagrams(s, p).toString());
	 }
}
