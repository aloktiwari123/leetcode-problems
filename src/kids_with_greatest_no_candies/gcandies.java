package kids_with_greatest_no_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class gcandies {
    
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
	{
		int max=candies[0];
		for(int i=0;i<candies.length;i++)
		{
			if(candies[i]>max)
			{
				max=candies[i];
			}
		}
		List<Boolean>out=new ArrayList<Boolean>();
		for(int i=0;i<candies.length;i++)
		{
			if(candies[i]+extraCandies>=max)
			{
				out.add(true);
			}
			else
			{
				out.add(false);
			}
		}
		return out;
        
    }

	public static void main(String[] args)
    {
        int[] nums= {12,1,12};
    	System.out.print(kidsWithCandies(nums,10));
    }
}
