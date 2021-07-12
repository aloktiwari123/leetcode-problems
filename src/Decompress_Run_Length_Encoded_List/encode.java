package Decompress_Run_Length_Encoded_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class encode {

	 public static int[] decompressRLElist(int[] nums) 
	 {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i];j++)
			{
				arr.add(nums[i+1]);
			}
			i++;
		}
		int[] a = new int[arr.size()];

		for(int i = 0; i < arr.size(); i++) {
		    if (arr.get(i) != null) {
		        a[i] = arr.get(i);
		    }
		}
		return(a);
	        
	    }
	 public static void main(String[] args)
	 {
		 //int[] arr= {1,2,3,4};
		 int[] arr= {1,1,2,3};
		 System.out.print(Arrays.toString(decompressRLElist(arr)));
	 }
}
