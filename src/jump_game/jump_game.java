package jump_game;

public class jump_game {
	
	public static boolean jump(int[] nums)
	{
		int n=nums.length;
		int reach=0;
		
		for(int i=0;i<n;i++)
		{
			if(i<reach) return false;
			
			reach=Math.max(reach,nums[i]+i);
		}
		return true;
	}
	
	public static void main(String args[])
	{
		
	}

}
