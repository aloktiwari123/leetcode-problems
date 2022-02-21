package reverse_string;

public class reverse_string {
	
	public static void reverseString(char[] s) 
	{
      int l=s.length;
      int i=0;
      while(i<l/2)
      {
    	  char temp=s[i];
    	  s[i]=s[l-1-i];
    	  s[l-1-i]=temp;
    	  i++;
    	  
      }
    }
	
	public static void main(String args[])
	{
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
	}

}
