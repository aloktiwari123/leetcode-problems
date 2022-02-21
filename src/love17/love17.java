package love17;

import java.util.Stack;

public class love17 {
	
	public static int love_17(String S)
	{
		Stack<Integer> st=new Stack<Integer>();
		
		for(int i=0;i<S.length();i++)
		{
			int t1=Integer.parseInt(String.valueOf(S.charAt(i)));
			if(st.isEmpty())
			{
			st.push(t1);
			}	
			else 
			{
				if(st.peek()+t1!=17)
				{
					st.push(t1);
				}
				else
				{
					st.pop();
				}
			}
		}
		return st.size();
		
	}
	
	public static void main(String args[])
	{
		String s="989898239823832489898349898889838884848938";
		System.out.print(love_17(s));
	}

}
