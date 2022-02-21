package Consecutive_Characters;

public class Consecutive_Characters 
{
	public static void main(String args[])
	{
		String s="triplepillooooow";
		int max = 1, count = 1;
        for(int i=0;i<s.length()-1;i++) 
        {
            if(s.charAt(i)!=s.charAt(i+1)) 
            {
				
                max = Math.max(max,count);
                count = 1;
                continue;
            }
            else
                count ++;
        }     
        max=Math.max(max, count);
		System.out.print(max);
	}
}
