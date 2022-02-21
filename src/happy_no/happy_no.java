package happy_no;

import java.util.HashSet;
import java.util.Set;

public class happy_no {
	
	public static void main(String args[])
	{
		int n=19;
		System.out.print(isHappy(n));
	}
	public static boolean isHappy(int n) 
    {
		Set<Integer>set=new HashSet<>();
		
		while(n!=1)
		{
			int sum=0;
			while(n>0)
			{
				int digit=n%10;
				sum=sum+digit*digit;
				n=n/10;
			}
			n=sum;
			if(!set.add(n))
			{
				return false;
			}
		}
		return true;
        
    }

}
