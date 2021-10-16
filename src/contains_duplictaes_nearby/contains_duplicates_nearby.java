package contains_duplictaes_nearby;

import java.util.HashMap;

public class contains_duplicates_nearby {
	 	
	public static boolean containsNearbyDuplicate(int[] nums, int k) 
    {
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k)
                return true;
            map.put(nums[i], i);
		}
		return false;
        
    }
	
	public static void main(String args[])
	{
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		
		System.out.print(containsNearbyDuplicate(nums, k));
	}
	

}
