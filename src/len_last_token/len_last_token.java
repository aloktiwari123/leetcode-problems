package len_last_token;

import java.util.StringTokenizer;

public class len_last_token {
	
	public static int lengthOfLastWord(String s) // String Tokenizer  Approach
	{
		
		StringTokenizer st=new StringTokenizer(s," ");
		String[] sr=new String[st.countTokens()];
		int c=0;
		while (st.hasMoreTokens()) {  
	           sr[c]=st.nextToken();
	     }  
		return sr[c].length();
        
    }
	public static int lengthOfLast_Word(String s) // Substring Approach
	{
		s=s.trim();
		
		return s.substring(s.lastIndexOf(' '),s.length()).length();
        
    }
	
	
	public static void main(String args[])
	 {
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
		System.out.println(lengthOfLast_Word(s));
		
	 }
}


