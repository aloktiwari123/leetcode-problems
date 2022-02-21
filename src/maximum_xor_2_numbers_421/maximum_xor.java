package maximum_xor_2_numbers_421;

public class maximum_xor {
	
	public static void main(String args[])
	{
		int []nums = {3,10,5,25,2,8};
		System.out.print(findMaxXOR(nums));
	}
	public static int findMaxXOR(int[] nums)
	{
		int max=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				max=Math.max(nums[i]^nums[j],max);
			}
		}
		return max;
	
		
	}

}
