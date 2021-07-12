package twosum;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int arr[] = new int[2];

		    map.put(nums[0],0);
		    
		    for(int i = 1; i<nums.length; i++)
		    {
		       
		        if(map.containsKey(target - nums[i]))
		        {
		            arr[0] = map.get(target - nums[i]);
		            arr[1] = i;
		            break;
		        }
		        else
		             map.put(nums[i], i);
		    }
		    
		    return arr;
        
    }
	public static void main(String args[]) {
		int[] arr= {2,7,11,15}; 
		int[] out=twoSum(arr,9);
		for(int i=0;i<out.length;i++)
		{
			System.out.print(out[i]);
		}
		
	}
}
