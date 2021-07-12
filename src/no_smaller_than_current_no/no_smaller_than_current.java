package no_smaller_than_current_no;

import java.util.Arrays;

public class no_smaller_than_current {
   public static int[] smallerNumbersThanCurrent(int[] nums) 
   {
	   int[] arr=new int[nums.length];
	   for(int i=0;i<nums.length;i++)
        {    
		   int count=0;
        	for(int j=0;j<nums.length;j++)
        	{
        		if(nums[j]<nums[i])
        		{
        			count++;
        		}
        	}
        	arr[i]=count;
        }
		return arr;
    }
   
   public static void main(String[] args)
   {
       int[] nums= {8,1,2,2,3};
   	System.out.print(Arrays.toString(smallerNumbersThanCurrent(nums)));
   }
}
