package Count_No_of_Consistent_Strings;

public class Count_No_Of_Consistent_Strings {
	
	public static int count(String allowed,String [] words)
	{
		int result=0;
		
		for(String word:words)
		{
			int i=0;
			for(;i<word.length();i++)
			{
				if(!allowed.contains(word.substring(i,i+1)))
				{
					break;
				}
			}
			if(i==word.length())
				result++;
		}
		return result;

	}
	
	public static void main(String args[])
	{
		String allowed = "abc";
		String[] words = {"a","b","c","ab","ac","bc","abc"};
		System.out.print(count(allowed, words));
	}
}
