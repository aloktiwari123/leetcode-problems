package find_duplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class find_duplicate {
	
	/*
	 public static List<Integer> findDuplicates(int[] nums) // Hashset approach
	 {
		HashSet<Integer>map=new HashSet<Integer>(); 
		List<Integer> out=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(map.contains(nums[i]))
			{
				out.add(nums[i]);
			}
			else 
			{
				map.add(nums[i]);
			}
		}
		return out;
	        
	 }
	 */
	 public static List<Integer> findDuplicates(int[] nums)
	 {
		List<Integer>out=new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			int index=Math.abs(nums[i])-1;
			
			if(nums[index]<0)
			{
				out.add(index+1);
			}
			nums[index]=nums[index]*-1;
		}
		return out;
		 
	 }
	 
	 public static void main(String args[])
	 {
		 int[] nums = {4,3,2,7,8,2,3,1};
		 System.out.print(findDuplicates(nums).toString());
	 }

}
