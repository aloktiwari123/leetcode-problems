package Reverse_Words_in_a_String_III;

public class reverse_words {
	
	public static String reverseWords(String s) 
	{
		String[] words=s.split("\\s");
		String out="";
		for(int i=0;i<words.length;i++)
		{
			out=out+reverseString(words[i]);
			if(i<words.length-1)
			{out=out+" ";}
		}
		

		return out;
        
    }
	public static String reverseString(String s) 
	{
      char[] ch=s.toCharArray();
      int l=ch.length;
      int i=0;
      while(i<l/2)
      {
    	  char temp=ch[i];
    	  ch[i]=ch[l-1-i];
    	  ch[l-1-i]=temp;
    	  i++;
    	  
      }
	return String.valueOf(ch);
    }
	public static void main(String args[])
	{
		String s="Let's take LeetCode contest";
		System.out.print(reverseWords(s));
		
	}
}
