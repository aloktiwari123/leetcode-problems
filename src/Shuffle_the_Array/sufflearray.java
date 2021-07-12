package Shuffle_the_Array;

import java.util.Arrays;

public class sufflearray {

     public static int[] shuffle(int[] nums, int n)
     {
       int[] arr=new int[nums.length];
       int count=0;
	   for(int i=0;i<nums.length/2;i++)
	   {
		   arr[count]=nums[i];
		   arr[count+1]=nums[i+n];
		   count+=2;
	   }
    	 return arr;
        
     }
     
     public static void main(String[] args)
     {
         int[] nums= {1,2,3,4};
     	System.out.print(Arrays.toString(shuffle(nums,2)));
     }
}
