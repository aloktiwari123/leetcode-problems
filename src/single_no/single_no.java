package single_no;

public class single_no {
	
	public static void main(String args[])
	{
		int[] arr= {2,2,1};
		System.out.print(singleNumber(arr));
	}
	public static int singleNumber(int[] nums) 
	{
		
		int res=0;
		
		for(int i=0;i<nums.length;i++)
		{
			res ^=nums[i];
		}
		return res;
        
    }

}
