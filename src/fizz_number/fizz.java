package fizz_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fizz {
	
	public static List<String> fizz_no(int n)
	{
		List<String> arr=new ArrayList();
		
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				arr.add("FizzBuzz");
			}
			else if(i%3==0)
			{
				arr.add("Fizz");
			}
			else if(i%5==0)
			{
				arr.add("Buzz");
			}
			else
			{
				arr.add(Integer.toString(i));
			}
		}
		return arr;
		
	}
	public static void main(String args[]) {
		int n=15;
		System.out.print(fizz_no(n));
		
	}

}
