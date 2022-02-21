package max_consecutive_ones;

public class max_consecutive_ones {
	
	public static void main(String args[])
	{
		int []nums = {1,1,0,1,1,1};
		int n = nums.length;
		int ans = nums[0];
		for(int i=1;i<n;i++)
		{
			if(nums[i]==1) nums[i] += nums[i-1];
			ans =Math.max(ans,nums[i]);
		}
		System.out.print(ans);
	
	}
	
}

