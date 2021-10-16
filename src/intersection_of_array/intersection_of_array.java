package intersection_of_array;

import java.util.HashSet;

public class intersection_of_array {
	
	public static int[] intersect(int[] nums1, int[] nums2)
    {
		HashSet<Integer> hash=new HashSet<Integer>();
		for(int i=0;i<nums1.length;i++)
		{
			hash.add(nums1[i]);
		}
		HashSet<Integer> hash2=new HashSet<Integer>();
		for(int j=0;j<nums2.length;j++)
		{
			if(hash.contains(nums2[j]))
			{
				hash2.add(nums2[j]);
			}
		}
		int []arr=new int[hash2.size()];
		int i = 0;
		for(int n:hash2)
		{
			arr[i++]=n;
		}
		return arr;
        
    }
	
	public static void main(String args[])
	{
		int [] nums1= {4,9,5};
		int [] nums2= {9,4,9,8,4};
		System.out.print(intersect(nums1, nums2));
	}

}
