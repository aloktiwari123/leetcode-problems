package two_sum_II;

import java.util.HashMap;

public class two_sum {
	
	public static int[] twoSum(int[] numbers, int target) 
    {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int arr[] = new int[2];
		int []nums=numbers;
		    map.put(nums[0],0);
		    
		    for(int i = 1; i<nums.length; i++)
		    {
		       
		        if(map.containsKey(target - nums[i]))
		        {
		            arr[0] = map.get(target - nums[i])+1;
		            arr[1] = i+1;
		            break;
		        }
		        else
		             map.put(nums[i], i);
		    }
		    
		    return arr;
        
      }
	
	
	public static void main(String args[])
	{
		int[] numbers= {2,7,11,15};
		int target=9;
		System.out.println(twoSum(numbers, target));
		
	}

}
