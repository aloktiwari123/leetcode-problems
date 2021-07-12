package Maximum_Length_of_Repeated_Subarray;

public class repeated_subarray {
	
	public static int findLength(int[] nums1, int[] nums2) {
		
		int max=0;
		for(int i=0;i<nums1.length;i++)
		{
			int c=i;
			int count=0;
			
			for(int j=0;j<nums2.length;j++)
			{
				if(c<nums1.length)
				{
				if(nums1[c]==nums2[j])
				{
					count++;
					c++;
				}
				else
				{
					count=0;
					c=i;
				}
				}
			}
			if(count>max)
			{
				max=count;
			}
		}
		return max;
        
    }
	public static void main(String args[])
	{
		int[] arr1= {0,1,1,1,1};
		int[] arr2= {1,0,1,0,1};
		System.out.print(findLength(arr1,arr2));
	}

}
