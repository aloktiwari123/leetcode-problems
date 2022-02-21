package min_jump_to_end;

public class min_jump_end {
	
	public static int min_jump(int[] nums)
	{
		int counter=0;
		int l=0;
		int r=0;
		
		while(r<nums.length-1)
		{
			int farthest=0;
			for(int i=l;i<r+1;i++)
			{
				farthest=Math.max(farthest,i+nums[i]);
			}
		l=r+1;
		r=farthest;
		counter++;
		}
		return counter;
	}
	
	public static void main(String args[])
	{
		int[] nums= {2,3,1,1,4};
		System.out.print(min_jump(nums));
	}

}
