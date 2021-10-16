package majority_element;

import java.util.Arrays;
import java.util.HashSet;

public class majority_element {
	 
	public static int majorityElement(int[] nums)
	{
		Arrays.sort(nums);
		
		return nums[nums.length/2];
	        
	}
	 public static void main(String args[])
	 {
		 int[] nums= {1,2,1};
		 System.out.print(majorityElement(nums));
	 }

}
