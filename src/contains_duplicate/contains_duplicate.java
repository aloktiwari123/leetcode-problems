package contains_duplicate;

import java.util.HashMap;
import java.util.HashSet;

public class contains_duplicate {
	
	 public static boolean containsDuplicate(int[] nums)
	 {
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int n: nums)
		{
		   if(set.contains(n)==false)
		   {
			   set.add(n);
		   }
		   else
		   {
			   return true;
		   }
			
		}
		return false;
	        
	 }
	 
	 public static void main(String args[])
	 {
	   int[] nums= {1,1,2,3,4};
	   System.out.print(containsDuplicate(nums));
	 }

}
