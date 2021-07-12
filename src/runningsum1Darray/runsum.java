package runningsum1Darray;

import java.util.Arrays;

public class runsum {

    public static int[] runningSum(int[] nums) {
		int[] sum=new int[nums.length];
		Arrays.fill(sum,0);
		int s=0;
    	for(int i=0;i<nums.length;i++)
		{ 
    		s=s+nums[i];
		  sum[i]=s;
		}
		return sum;
        
    }
    
    public static void main(String[] args)
    {
        int[] nums= {1,2,3,4};
    	System.out.print(Arrays.toString(runningSum(nums)));
    }
}
