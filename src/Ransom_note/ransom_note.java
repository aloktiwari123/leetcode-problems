package Ransom_note;

import java.util.Arrays;

public class ransom_note {
	
	 public static boolean canConstruct(String ransomNote, String magazine)
	 {
		
		char[] r1=ransomNote.toLowerCase().toCharArray();
		char[] r2=magazine.toLowerCase().toCharArray();
		Arrays.sort(r1);
		Arrays.sort(r2);
		String s1=new String(r1);
		String s2=new String(r2);
		int index=s2.indexOf(s1);
		
		if(index ==-1)
		{
			return false;
		}
		return true;
	        
	 }
	 
	 public static void main(String args[])
	 {
		 String ransomNote = "aa";
		 String magazine = "aab";
		 
		 System.out.print(canConstruct(ransomNote, magazine));
		 
	 }

}
