package Concatenation_of_Array;

import java.util.Arrays;

public class concat {
	 
	public static int[] getConcatenation(int[] nums)
	{
		int[] n=new int[2*nums.length];
		for(int i=0;i<nums.length;i++)
		{
			n[i]=nums[i];
			n[i+nums.length]=nums[i];
		}
		nums=n;
		return nums;
	        
	 }
	 public static void main(String args[])
	 {
		 int[] nums= {1,2,1};
		 System.out.print(Arrays.toString(getConcatenation(nums)));
	 }

}
