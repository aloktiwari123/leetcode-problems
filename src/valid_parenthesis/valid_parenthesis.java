package valid_parenthesis;

import java.util.Stack;

public class valid_parenthesis {
	
	 public static boolean isValid(String s) 
	 {
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
			{
				st.push(s.charAt(i));
			}
			else
			{
				if(st.empty())
				{
					return false;
				}
				char c=st.peek();
				
				if((s.charAt(i)==')' && c=='(') || (s.charAt(i)=='}' && c=='{') || (s.charAt(i)==']' && c=='['))
				{
					st.pop();
				}
				else
				{
					return false;
				}
			}
		}
		if(st.empty())
		{
			return true;
		}
		return false;
	        
	   
	 }
	 
	 public static void main(String args[])
	 {
		 String s="()[]{}";
		 System.out.print(isValid(s));
	 }

}
